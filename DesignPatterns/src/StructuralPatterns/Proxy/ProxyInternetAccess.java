package StructuralPatterns.Proxy;

public class ProxyInternetAccess implements OfficeInternetAccess {
	private String employeeName;
	private RealInternetAccess realaccess;

	public ProxyInternetAccess(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public void grantInternetAccess() {
		if (getRole(employeeName) > 4) {
			realaccess = new RealInternetAccess(employeeName);
			realaccess.grantInternetAccess();
		} else {
			System.out.println("İnternet erişimi verilmedi. Seviyeniz 5'in altında");
		}
	}

	public int getRole(String emplName) {
		// Check role from the database based on Name and designation
		// return job level or job designation.
		return 9;
	}
}
