package br.com.millercs.system;

import br.com.millercs.language.Language;
import br.com.millercs.language.PT_BR;

public class Config {
	
	public static Language language = new PT_BR();
	private static String logoAdmin = "../_assets/images/logoAdmin.png";
	private static String logoFrontEnd = "../_assets/images/logo.png";
	private static String fullSystemName = "Portal Da Transparencia";
	private static String fullCompanyName = "Miller Consultoria e Servi�os";
	private static String shortCompanyName = "M.C.S.";
	private static String fullCompanySite = "http://www.millercs.com.br";
	
	
	
	

	public static String getFullSystemName() {
		return fullSystemName;
	}

	public static void setFullSystemName(String fullSystemName) {
		Config.fullSystemName = fullSystemName;
	}

	public static String getLogoAdmin() {
		return logoAdmin;
	}

	public static void setLogoAdmin(String logoAdmin) {
		Config.logoAdmin = logoAdmin;
	}

	public static String getLogoFrontEnd() {
		return logoFrontEnd;
	}

	public static void setLogoFrontEnd(String logoFrontEnd) {
		Config.logoFrontEnd = logoFrontEnd;
	}

	public static String getFullCompanyName() {
		return fullCompanyName;
	}

	public static void setFullCompanyName(String fullCompanyName) {
		Config.fullCompanyName = fullCompanyName;
	}

	public static String getShortCompanyName() {
		return shortCompanyName;
	}

	public static void setShortCompanyName(String shortCompanyName) {
		Config.shortCompanyName = shortCompanyName;
	}

	public static String getFullCompanySite() {
		return fullCompanySite;
	}

	public static void setFullCompanySite(String fullCompanySite) {
		Config.fullCompanySite = fullCompanySite;
	}
	

}
