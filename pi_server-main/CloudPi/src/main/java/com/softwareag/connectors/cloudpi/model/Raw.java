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
//    "type",
//    "text"
//})
//@Generated("jsonschema2pojo")
//public class Raw implements Serializable
//{
//
//    @JsonProperty("type")
//    private String type;
//    @JsonProperty("text")
//    private String text;
//    @JsonIgnore
//    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
//    private final static long serialVersionUID = -6518223664275186037L;
//
//    /**
//     * No args constructor for use in serialization
//     * 
//     */
//    public Raw() {
//    }
//
//    /**
//     * 
//     * @param text
//     * @param type
//     */
//    public Raw(String type, String text) {
//        super();
//        this.type = type;
//        this.text = text;
//    }
//
//    @JsonProperty("type")
//    public String getType() {
//        return type;
//    }
//
//    @JsonProperty("type")
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    @JsonProperty("text")
//    public String getText() {
//        return text;
//    }
//
//    @JsonProperty("text")
//    public void setText(String text) {
//        this.text = text;
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
//        sb.append(Raw.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
//        sb.append("type");
//        sb.append('=');
//        sb.append(((this.type == null)?"<null>":this.type));
//        sb.append(',');
//        sb.append("text");
//        sb.append('=');
//        sb.append(((this.text == null)?"<null>":this.text));
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


// Naman code 


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
    "type",
    "text"
})
@Generated("jsonschema2pojo")
public class Raw<T> implements Serializable
{

    @JsonProperty("type")
    private String type;
    @JsonProperty("text")
    private T text;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6518223664275186037L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Raw() {
    }

    /**
     * 
     * @param text
     * @param type
     */
    public Raw(String type, T text) {
        super();
        this.type = type;
        this.text = text;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("text")
    public T getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(T text) {
        this.text = text;
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
        sb.append(Raw.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
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
