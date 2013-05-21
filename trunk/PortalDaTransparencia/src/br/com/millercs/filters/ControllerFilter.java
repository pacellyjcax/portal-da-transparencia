package br.com.millercs.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import br.com.millercs.encryption.CriptoMCS;
import br.com.millercs.models.Usuario;


public class ControllerFilter implements Filter {

	  
    public void init(FilterConfig config) throws ServletException{}  
  
    public void destroy(){}  
  
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)   
        throws IOException, ServletException { 
    	
    	
    	HttpSession session = (((HttpServletRequest)request).getSession());
	
   
    	if(session.getAttribute("logado") == null ){
    		String login = request.getParameter("username");
    		String senha = request.getParameter("password");
    		
    		if(login != null && senha != null){
    			Usuario usuario = new Usuario(login,CriptoMCS.encrypt(senha));
    			boolean verif = usuario.isUsuarioValido();

    			if(verif){
    				session.setAttribute("logado", usuario);    				
    				chain.doFilter(request, response);
    				
    			}else{
    				HttpServletRequest rServletRequest = (HttpServletRequest)request;
    				rServletRequest.getRequestDispatcher("/admin/login.jsp").forward(request, response);
    			}
    		}else{
    			
    			
    			HttpServletRequest rServletRequest = (HttpServletRequest)request;
				rServletRequest.getRequestDispatcher("/admin/login.jsp").forward(request, response);
    		}    		    		
    	}else{
			chain.doFilter(request, response);
		}    	
    }

}