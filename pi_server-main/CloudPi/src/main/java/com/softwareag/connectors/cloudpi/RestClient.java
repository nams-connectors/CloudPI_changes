package com.softwareag.connectors.cloudpi;


import java.io.FileReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;
import org.json.simple.parser.JSONParser;
import com.softwareag.connectors.cloudpi.model.PiRest;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@AllArgsConstructor
@Service
public class RestClient<T, V> {
    @Autowired
    RestTemplate restTemplate;
    public V execute(PiRest data, ResponseErrorHandler errorHandler)
            throws ResourceAccessException, Exception {

        restTemplate.setErrorHandler(errorHandler);
        HttpHeaders headers = new HttpHeaders();
        
        int j = data.getHeaders().size() -1;
        while(j>=0) {
        	headers.set(data.getHeaders().get(j).getKey() , data.getHeaders().get(j).getValue());
        	j--;
        }

        JSONParser parser = new JSONParser();
        HttpEntity<T> entity = null;
        ResponseEntity<T> response = null;
        MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
        HttpEntity<MultiValueMap<String, String>> request = null;
   
        StringBuilder actualPathString = new StringBuilder();
        actualPathString.append(data.getEndpoint());
        if(data.getParameters().getParams().size() >= 1) {
        	actualPathString.append("?" +  data.getParameters().getParams().get(0).getKey() + "=" + data.getParameters().getParams().get(0).getValue());
        	for(int i = 1;i<data.getParameters().getParams().size();i++) {
        		actualPathString.append("&" +  data.getParameters().getParams().get(i).getKey() + "=" + data.getParameters().getParams().get(i).getValue());
        	}

        }

        switch (data.getBody().getType()) {
		case "form":
			headers.setContentType(MediaType.MULTIPART_FORM_DATA);
			for(int i = 0; i < data.getBody().getForm().size(); i++) {
			map.add(data.getBody().getForm().get(i).getKey(), data.getBody().getForm().get(i).getValue());	
			}
			request = new HttpEntity<MultiValueMap<String, String>>(map, headers);
			 response = (ResponseEntity<T>) restTemplate.exchange(actualPathString.toString(),HttpMethod.valueOf(data.getMethod()), request , String.class);
			break;
			
		case "urlencode":
			headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
			for(int i = 0; i<data.getBody().getForm().size();i++) {
			map.add(data.getBody().getUrlencode().get(i).getKey(), data.getBody().getUrlencode().get(i).getValue());	
			}
			request = new HttpEntity<MultiValueMap<String, String>>(map, headers);
			response = (ResponseEntity<T>) restTemplate.exchange(actualPathString.toString(),HttpMethod.valueOf(data.getMethod()), request , String.class);
			break;
		
		case "raw":
		
			entity = new HttpEntity<T>((T)data.getBody().getRaw().getText(), headers);
			 response = (ResponseEntity<T>) restTemplate.exchange(actualPathString.toString(),HttpMethod.valueOf(data.getMethod()), entity , String.class);
			break;
		
		case "attachment":

			Object obj = parser.parse(new FileReader(data.getBody().getAttachment().getPath() + data.getBody().getAttachment().getFilename()));
			entity = new HttpEntity<T>((T)obj, headers);
			response = (ResponseEntity<T>) restTemplate.exchange(actualPathString.toString(),HttpMethod.valueOf(data.getMethod()), entity , String.class);
			break;			
		default:
			entity = new HttpEntity(headers);
        	response = (ResponseEntity<T>) restTemplate.exchange(actualPathString.toString(),HttpMethod.valueOf(data.getMethod()), entity , String.class);
			break;
		}
        return (V) response.getBody();
    }

}
