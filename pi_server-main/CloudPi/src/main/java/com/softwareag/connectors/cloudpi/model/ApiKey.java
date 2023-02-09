//
//package com.softwareag.connectors.cloudpi.model;
//
//import java.io.Serializable;
//import java.util.HashMap;
//import java.util.Map;
//import javax.annotation.Generated;
//import com.fasterxml.jackson.annotation.JsonAnyGetter;
//import com.fasterxml.jackson.annotation.JsonAnySetter;
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.JsonInclude;
//import com.fasterxml.jackson.annotation.JsonProperty;
//import com.fasterxml.jackson.annotation.JsonPropertyOrder;
//
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({
//    "addto",
//    "apikey"
//})
//@Generated("jsonschema2pojo")
//public class ApiKey implements Serializable
//{
//
//    @JsonProperty("addto")
//    private String addto;
//    @JsonProperty("apikey")
//    private String apikey;
//    @JsonIgnore
//    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
//    private final static long serialVersionUID = 2074055034801454461L;
//
//    /**
//     * No args constructor for use in serialization
//     * 
//     */
//    public ApiKey() {
//    }
//
//    /**
//     * 
//     * @param apikey
//     * @param addto
//     */
//    public ApiKey(String addto, String apikey) {
//        super();
//        this.addto = addto;
//        this.apikey = apikey;
//    }
//
//    @JsonProperty("addto")
//    public String getAddto() {
//        return addto;
//    }
//
//    @JsonProperty("addto")
//    public void setAddto(String addto) {
//        this.addto = addto;
//    }
//
//    @JsonProperty("apikey")
//    public String getApikey() {
//        return apikey;
//    }
//
//    @JsonProperty("apikey")
//    public void setApikey(String apikey) {
//        this.apikey = apikey;
//    }
//
//    @JsonAnyGetter
//    public Map<String, Object> getAdditionalProperties() {
//        return this.additionalProperties;
//    }
//
//    @JsonAnySetter
//    public void setAdditionalProperty(String name, Object value) {
//        this.additionalProperties.put(name, value);
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(ApiKey.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
//        sb.append("addto");
//        sb.append('=');
//        sb.append(((this.addto == null)?"<null>":this.addto));
//        sb.append(',');
//        sb.append("apikey");
//        sb.append('=');
//        sb.append(((this.apikey == null)?"<null>":this.apikey));
//        sb.append(',');
//        sb.append("additionalProperties");
//        sb.append('=');
//        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
//        sb.append(',');
//        if (sb.charAt((sb.length()- 1)) == ',') {
//            sb.setCharAt((sb.length()- 1), ']');
//        } else {
//            sb.append(']');
//        }
//        return sb.toString();
//    }
//
//}



// Naman Code


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
    "addto",
    "key",
    "value"
})
@Generated("jsonschema2pojo")
public class ApiKey implements Serializable
{

    @JsonProperty("addto")
    private String addto;
    @JsonProperty("key")
    private String key;
    @JsonProperty("value")
    private String value;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2074055034801454461L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ApiKey() {
    }

    /**
     * 
     * @param key
     * @param value
     * @param addto
     */
    public ApiKey(String addto, String key ,String value) {
        super();
        this.addto = addto;
        this.key = key;
        this.value = value;
    }

    public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@JsonProperty("addto")
    public String getAddto() {
        return addto;
    }

    @JsonProperty("addto")
    public void setAddto(String addto) {
        this.addto = addto;
    }

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
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
        sb.append(ApiKey.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("addto");
        sb.append('=');
        sb.append(((this.addto == null)?"<null>":this.addto));
        sb.append(',');
        sb.append("key");
        sb.append('=');
        sb.append(((this.key == null)?"<null>":this.key));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
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
