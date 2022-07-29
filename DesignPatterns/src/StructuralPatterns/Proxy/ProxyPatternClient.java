package StructuralPatterns.Proxy;

public class ProxyPatternClient {

	public static void main(String[] args) {
		OfficeInternetAccess access = new ProxyInternetAccess("M.Ali SEN");
		access.grantInternetAccess();
	}

}
