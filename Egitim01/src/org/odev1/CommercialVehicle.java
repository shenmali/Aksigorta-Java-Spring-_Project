package org.odev1;

public interface CommercialVehicle {
	public final static int yearLimit = 10;
	public double calculateAmortizedTax( double baseTax, int currentYear );
	public String getPlate();
}
