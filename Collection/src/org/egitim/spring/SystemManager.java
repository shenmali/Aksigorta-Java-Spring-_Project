package org.egitim.spring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Properties;

public class SystemManager {
	
	private String serverName;
	
	private ArrayList<String> printerList;
	
	private HashSet<String> routerSet;
	
	private Properties securityProperties;
	
	private HashMap<String,String> allowedClientMap;

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public ArrayList<String> getPrinterList() {
		return printerList;
	}

	public void setPrinterList(ArrayList<String> printerList) {
		this.printerList = printerList;
	}

	public HashSet<String> getRouterSet() {
		return routerSet;
	}

	public void setRouterSet(HashSet<String> routerSet) {
		this.routerSet = routerSet;
	}

	public Properties getSecurityProperties() {
		return securityProperties;
	}

	public void setSecurityProperties(Properties securityProperties) {
		this.securityProperties = securityProperties;
	}

	public HashMap<String, String> getAllowedClientMap() {
		return allowedClientMap;
	}

	public void setAllowedClientMap(HashMap<String, String> allowedClientMap) {
		this.allowedClientMap = allowedClientMap;
	}
	
	

}
