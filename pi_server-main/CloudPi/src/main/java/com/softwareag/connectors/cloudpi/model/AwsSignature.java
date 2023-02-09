
package com.softwareag.connectors.cloudpi.model;

import java.io.Serializable;
import java.util.HashMap;
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
    "accessKey",
    "secretKey",
    "awsRegion",
    "serviceName",
    "sessionToken"
})
@Generated("jsonschema2pojo")
public class AwsSignature implements Serializable
{

    @JsonProperty("accessKey")
    private String accessKey;
    @JsonProperty("secretKey")
    private String secretKey;
    @JsonProperty("awsRegion")
    private String awsRegion;
    @JsonProperty("serviceName")
    private String serviceName;
    @JsonProperty("sessionToken")
    private String sessionToken;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -7833264857375935236L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AwsSignature() {
    }

    /**
     * 
     * @param awsRegion
     * @param secretKey
     * @param accessKey
     * @param sessionToken
     * @param serviceName
     */
    public AwsSignature(String accessKey, String secretKey, String awsRegion, String serviceName, String sessionToken) {
        super();
        this.accessKey = accessKey;
        this.secretKey = secretKey;
        this.awsRegion = awsRegion;
        this.serviceName = serviceName;
        this.sessionToken = sessionToken;
    }

    @JsonProperty("accessKey")
    public String getAccessKey() {
        return accessKey;
    }

    @JsonProperty("accessKey")
    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    @JsonProperty("secretKey")
    public String getSecretKey() {
        return secretKey;
    }

    @JsonProperty("secretKey")
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    @JsonProperty("awsRegion")
    public String getAwsRegion() {
        return awsRegion;
    }

    @JsonProperty("awsRegion")
    public void setAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
    }

    @JsonProperty("serviceName")
    public String getServiceName() {
        return serviceName;
    }

    @JsonProperty("serviceName")
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @JsonProperty("sessionToken")
    public String getSessionToken() {
        return sessionToken;
    }

    @JsonProperty("sessionToken")
    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
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
        sb.append(AwsSignature.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("accessKey");
        sb.append('=');
        sb.append(((this.accessKey == null)?"<null>":this.accessKey));
        sb.append(',');
        sb.append("secretKey");
        sb.append('=');
        sb.append(((this.secretKey == null)?"<null>":this.secretKey));
        sb.append(',');
        sb.append("awsRegion");
        sb.append('=');
        sb.append(((this.awsRegion == null)?"<null>":this.awsRegion));
        sb.append(',');
        sb.append("serviceName");
        sb.append('=');
        sb.append(((this.serviceName == null)?"<null>":this.serviceName));
        sb.append(',');
        sb.append("sessionToken");
        sb.append('=');
        sb.append(((this.sessionToken == null)?"<null>":this.sessionToken));
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
