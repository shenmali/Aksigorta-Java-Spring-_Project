package org.egitim.facade.library;

import java.io.InputStream;

public class FileConverter {

	public void convertFile(byte[] file, String fileType){
		convertFileType(file,fileType);
	}
	
	public void convertFile(byte[] file){
		String fileType = detectFileType(file);
		convertFileType(file, fileType);
		
	}

	private String detectFileType(byte[] file) {
		// TODO Auto-generated method stub
		return "doc";
	}
	
	public void convertFileType(byte[] file, String fileType){
		if (fileType.equalsIgnoreCase("doc")){
			DocToPdf docToPdf = new DocToPdf();
			docToPdf.convertDocument(file);
			
			
		}
		else if (fileType.equalsIgnoreCase("txt")){
			TextToPdf textToPdf = new TextToPdf();
			textToPdf.convertText(file);
		}	
		
		else if (fileType.equalsIgnoreCase("xls")){
			XlsToPdf xlsToPdf = new XlsToPdf();
			xlsToPdf.xlsConvert(file);
			
		}	
		
		else if (fileType.equalsIgnoreCase("csv")){
			XlsToPdf csvToPdf = new XlsToPdf();
			csvToPdf.csvConvert(byteArrayToStream(file));
			
		}	else {
			
			return;
		}
	}

	private InputStream byteArrayToStream(byte[] file) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
