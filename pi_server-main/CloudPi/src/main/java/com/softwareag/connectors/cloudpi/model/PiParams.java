package com.softwareag.connectors.cloudpi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter
public class PiParams {
    String key;
    String value;
}
