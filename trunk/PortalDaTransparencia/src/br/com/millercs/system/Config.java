package br.com.millercs.system;

import br.com.millercs.language.Language;
import br.com.millercs.language.PT_BR;

public class Config {
	
	public static Language language = new PT_BR();
	private static String logoAdmin = "../_assets/images/logoAdmin.png";
	private static String logoFrontEnd = "../_assets/images/logo.png";
	private static String fullSystemName = "Portal Da Transparencia";
	private static String fullCompanyName = "Miller Consultoria e Serviços";
	private static String shortCompanyName = "M.C.S.";
	private static String fullCompanySite = "http://www.millercs.com.br";
	
	
	private static String bdServerName = "localhost";
	private static String bdServerPort = "3306";
	private static String bdName = "transparenciasvs";
	private static String bdUrl = "jdbc:mysql://" + bdServerName + ":" + bdServerPort+ "/" + bdName;
	private static String bdUsername = "pacelly";
	private static String bdPassword = "5865889093";


	

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

	public static String getBdServerName() {
		return bdServerName;
	}

	public static void setBdServerName(String bdServerName) {
		Config.bdServerName = bdServerName;
	}

	public static String getBdServerPort() {
		return bdServerPort;
	}

	public static void setBdServerPort(String bdServerPort) {
		Config.bdServerPort = bdServerPort;
	}

	public static String getBdName() {
		return bdName;
	}

	public static void setBdName(String bdName) {
		Config.bdName = bdName;
	}

	public static String getBdUrl() {
		return bdUrl;
	}

	public static void setBdUrl(String bdUrl) {
		Config.bdUrl = bdUrl;
	}

	public static String getBdUsername() {
		return bdUsername;
	}

	public static void setBdUsername(String bdUsername) {
		Config.bdUsername = bdUsername;
	}

	public static String getBdPassword() {
		return bdPassword;
	}

	public static void setBdPassword(String bdPassword) {
		Config.bdPassword = bdPassword;
	}

	

}
