package com.softwareag.connectors.cloudpi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter
public class PiHeader {
	public PiHeader() {
		super();
	}
	public PiHeader(String key, String value) {
		super();
		this.key = key;
		this.value = value;
	}
	String key;
    String value;

}
