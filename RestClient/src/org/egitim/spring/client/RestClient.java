package org.egitim.spring.client;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestClient {
	
	private static final String SERVICE_URL = "http://localhost:8086/egitim/sorgu/kisi";
	
	public void serviceKisiTumListe() {
		HttpHeaders httpHeader = new HttpHeaders();
		
		httpHeader.setAccept(Arrays.asList(new MediaType[] {MediaType.APPLICATION_JSON}));
		httpHeader.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<String> httpEntity = new HttpEntity<String>(httpHeader);
		
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<String> responseEntity = restTemplate.exchange(SERVICE_URL + "/tumliste" , HttpMethod.GET, httpEntity, String.class);
		
		String result = responseEntity.getBody();
		
		System.out.println("SERVICE RESULT");
		System.out.println(result);
	};
	
	
	
}
