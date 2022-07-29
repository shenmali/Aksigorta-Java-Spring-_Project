package singelton;

public class PrinterQ {

	private static PrinterQ printerQ;
	
	private PrinterQ() {}
	
	public static PrinterQ getPrinterQ() {
		
		if (printerQ == null) {
			printerQ = new PrinterQ();
			
		}
		return printerQ;
		
	}
	
	
	
}
