
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
    "apiKey",
    "bearerToken",
    "basic",
    "awsSignature"
})
@Generated("jsonschema2pojo")
public class Authentication implements Serializable
{

	@JsonProperty("type")
    private String type;
    @JsonProperty("apiKey")
    private ApiKey apiKey;
    @JsonProperty("bearerToken")
    private BearerToken bearerToken;
    @JsonProperty("basic")
    private Basic basic;
    @JsonProperty("awsSignature")
    private AwsSignature awsSignature;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8858694704396971669L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Authentication() {
    }

    /**
     * 
     * @param type
     * @param bearerToken
     * @param apiKey
     * @param awsSignature
     * @param basic
     */
    public Authentication(String type, ApiKey apiKey, BearerToken bearerToken, Basic basic, AwsSignature awsSignature) {
        super();
        this.type = type;
        this.apiKey = apiKey;
        this.bearerToken = bearerToken;
        this.basic = basic;
        this.awsSignature = awsSignature;
    }

    @JsonProperty("type")
    public String getType() {
		return type;
	}
    @JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("apiKey")
    public ApiKey getApiKey() {
        return apiKey;
    }

    @JsonProperty("apiKey")
    public void setApiKey(ApiKey apiKey) {
        this.apiKey = apiKey;
    }

    @JsonProperty("bearerToken")
    public BearerToken getBearerToken() {
        return bearerToken;
    }

    @JsonProperty("bearerToken")
    public void setBearerToken(BearerToken bearerToken) {
        this.bearerToken = bearerToken;
    }

    @JsonProperty("basic")
    public Basic getBasic() {
        return basic;
    }

    @JsonProperty("basic")
    public void setBasic(Basic basic) {
        this.basic = basic;
    }

    @JsonProperty("awsSignature")
    public AwsSignature getAwsSignature() {
        return awsSignature;
    }

    @JsonProperty("awsSignature")
    public void setAwsSignature(AwsSignature awsSignature) {
        this.awsSignature = awsSignature;
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
        sb.append(Authentication.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("apiKey");
        sb.append('=');
        sb.append(((this.apiKey == null)?"<null>":this.apiKey));
        sb.append(',');
        sb.append("bearerToken");
        sb.append('=');
        sb.append(((this.bearerToken == null)?"<null>":this.bearerToken));
        sb.append(',');
        sb.append("basic");
        sb.append('=');
        sb.append(((this.basic == null)?"<null>":this.basic));
        sb.append(',');
        sb.append("awsSignature");
        sb.append('=');
        sb.append(((this.awsSignature == null)?"<null>":this.awsSignature));
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
