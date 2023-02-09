package com.softwareag.connectors.cloudpi.nams;

import java.lang.reflect.Type;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.RequestBodyAdviceAdapter;

import com.nimbusds.jose.util.Base64;
import com.softwareag.connectors.cloudpi.CloudPiController;
import com.softwareag.connectors.cloudpi.model.Header;
import com.softwareag.connectors.cloudpi.model.PiRest;

@Component
@RestControllerAdvice
public class RequestBodyHandler extends RequestBodyAdviceAdapter {

	@Override
	public boolean supports(MethodParameter methodParameter, Type targetType,
			Class<? extends HttpMessageConverter<?>> converterType) {
		
        return methodParameter.getContainingClass() == CloudPiController.class && targetType.getTypeName() == PiRest.class.getTypeName();
	}

	@Override
	public Object afterBodyRead(Object body, HttpInputMessage inputMessage, MethodParameter parameter, Type targetType,
			Class<? extends HttpMessageConverter<?>> converterType) {
		PiRest objPiRest = null;
		
		if(body instanceof PiRest) {
			objPiRest = (PiRest) body;
		}
		if(!objPiRest.getAuthentication().getType().isBlank()) {
			Header header = new Header();
			switch (objPiRest.getAuthentication().getType()) {
			case "apiKey":
				if(objPiRest.getAuthentication().getApiKey().getAddto().equals("header")) {
					header.setKey(objPiRest.getAuthentication().getApiKey().getKey());
					header.setValue(objPiRest.getAuthentication().getApiKey().getValue());
					objPiRest.getHeaders().add(header);
				}
				break;
				
			case "bearerToken":
					header.setKey("Authorization");
					header.setValue( "Bearer " + objPiRest.getAuthentication().getBearerToken().getToken());
					objPiRest.getHeaders().add(header);
				break;	
				
			case "basic":
				header.setKey("Authorization");
				header.setValue( "Basic " + Base64.encode(objPiRest.getAuthentication().getBasic().getUsername()+":"+objPiRest.getAuthentication().getBasic().getPassword()));
				objPiRest.getHeaders().add(header);
			break;
			
			case "awsSignature":
				header.setKey("Authorization");
				
				// code likhna h yha
				
				header.setValue("");
				objPiRest.getHeaders().add(header);
			break;
			
			default:
				break;
			}
		}
		objPiRest.setAuthentication(null);
		return objPiRest;
	}

}
