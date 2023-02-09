
package com.softwareag.connectors.cloudpi.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "headers",
    "parameters",
    "body",
    "method",
    "endpoint",
    "authentication"
})
@Generated("jsonschema2pojo")
public class PiRest implements Serializable
{

    @JsonProperty("headers")

    private List<Header> headers = null;
    @JsonProperty("parameters")
    private Parameters parameters;
    @JsonProperty("body")
    private Body body;
    @JsonProperty("method")
    private String method;
    @JsonProperty("endpoint")
    private String endpoint;
    @JsonProperty("authentication")
    private Authentication authentication;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -9025309708553947224L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PiRest() {
    }
    
    public PiRest (Object obj) {
    	PiRest objPiRest = new PiRest();
    	objPiRest = (PiRest) obj;
    }
    /**
     * 
     * @param headers
     * @param endpoint
     * @param method
     * @param body
     * @param parameters
     * @param authentication
     */
    public PiRest(List<Header> headers, Parameters parameters, Body body, String method, String endpoint, Authentication authentication) {
        super();
        this.headers = headers;
        this.parameters = parameters;
        this.body = body;
        this.method = method;
        this.endpoint = endpoint;
        this.authentication = authentication;
    }

    @JsonProperty("headers")
    public List<Header> getHeaders() {
        return headers;
    }

    @JsonProperty("headers")
    public void setHeaders(List<Header> headers) {
        this.headers = headers;
    }

    @JsonProperty("parameters")
    public Parameters getParameters() {
        return parameters;
    }

    @JsonProperty("parameters")
    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    @JsonProperty("body")
    public Body getBody() {
        return body;
    }

    @JsonProperty("body")
    public void setBody(Body body) {
        this.body = body;
    }

    @JsonProperty("method")
    public String getMethod() {
        return method;
    }

    @JsonProperty("method")
    public void setMethod(String method) {
        this.method = method;
    }

    @JsonProperty("endpoint")
    public String getEndpoint() {
        return endpoint;
    }

    @JsonProperty("endpoint")
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    @JsonProperty("authentication")
    public Authentication getAuthentication() {
        return authentication;
    }

    @JsonProperty("authentication")
    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PiRest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("headers");
        sb.append('=');
        sb.append(((this.headers == null)?"<null>":this.headers));
        sb.append(',');
        sb.append("parameters");
        sb.append('=');
        sb.append(((this.parameters == null)?"<null>":this.parameters));
        sb.append(',');
        sb.append("body");
        sb.append('=');
        sb.append(((this.body == null)?"<null>":this.body));
        sb.append(',');
        sb.append("method");
        sb.append('=');
        sb.append(((this.method == null)?"<null>":this.method));
        sb.append(',');
        sb.append("endpoint");
        sb.append('=');
        sb.append(((this.endpoint == null)?"<null>":this.endpoint));
        sb.append(',');
        sb.append("authentication");
        sb.append('=');
        sb.append(((this.authentication == null)?"<null>":this.authentication));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}

/*
Sample Json
{
  "headers": [{
    "key":"",
    "value":""
  }],
  "parameters":
  {
    "type":"",
    "params":
      [{
        "key":"",
        "value":""
      }]
  },
  "body":{
  	"type": "",
    "form":
      [{
      "key":"",
      "value":""
    }],
    "urlencode":
    [{
      "key":"",
      "value":""
    }],
    "raw":{
      "type":"",
      "text":""
    },
    "attachment":{
      "filename":"",
      "path":""
    }
  },
  "method":"",
  "endpoint":"",
  "authentication":{
  	"type":"",
    "apiKey":{
      "addto":"",
      "key":"",
      "value":""
    },
    "bearerToken":{
      "token":""
      },
    "basic":{
      "username":"",
      "password":""
    },
    "awsSignature":{
      "accessKey":"",
      "secretKey":"",
      "awsRegion":"",
      "serviceName":"",
      "sessionToken":""
    }
  }
}
 */
