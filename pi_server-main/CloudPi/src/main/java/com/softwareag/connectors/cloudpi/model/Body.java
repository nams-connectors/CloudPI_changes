
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
    "form",
    "urlencode",
    "raw",
    "attachment"
})
@Generated("jsonschema2pojo")
public class Body implements Serializable
{

	@JsonProperty("type")
    private String type;
	@JsonProperty("form")
    private List<Form> form = null;
    @JsonProperty("urlencode")
    private List<Urlencode> urlencode = null;
    @JsonProperty("raw")
    private Raw raw;
    @JsonProperty("attachment")
    private Attachment attachment;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8490795228749108083L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Body() {
    }

    /**
     * 
     * @param type
     * @param form
     * @param attachment
     * @param urlencode
     * @param raw
     */
    public Body(String type, List<Form> form, List<Urlencode> urlencode, Raw raw, Attachment attachment) {
        super();
        this.type = type;
        this.form = form;
        this.urlencode = urlencode;
        this.raw = raw;
        this.attachment = attachment;
    }
    @JsonProperty("type")
    public String getType() {
		return type;
	}
    @JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

    @JsonProperty("form")
    public List<Form> getForm() {
        return form;
    }

    @JsonProperty("form")
    public void setForm(List<Form> form) {
        this.form = form;
    }

    @JsonProperty("urlencode")
    public List<Urlencode> getUrlencode() {
        return urlencode;
    }

    @JsonProperty("urlencode")
    public void setUrlencode(List<Urlencode> urlencode) {
        this.urlencode = urlencode;
    }

    @JsonProperty("raw")
    public Raw getRaw() {
        return raw;
    }

    @JsonProperty("raw")
    public void setRaw(Raw raw) {
        this.raw = raw;
    }

    @JsonProperty("attachment")
    public Attachment getAttachment() {
        return attachment;
    }

    @JsonProperty("attachment")
    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
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
        sb.append(Body.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("form");
        sb.append('=');
        sb.append(((this.form == null)?"<null>":this.form));
        sb.append(',');
        sb.append("urlencode");
        sb.append('=');
        sb.append(((this.urlencode == null)?"<null>":this.urlencode));
        sb.append(',');
        sb.append("raw");
        sb.append('=');
        sb.append(((this.raw == null)?"<null>":this.raw));
        sb.append(',');
        sb.append("attachment");
        sb.append('=');
        sb.append(((this.attachment == null)?"<null>":this.attachment));
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
