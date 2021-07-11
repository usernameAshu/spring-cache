package com.mohanty.springcache.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
public class Address implements Serializable {

    private static final long serialVersionUID = 6728048499029476342L;

    private String doorNo;
    private String street;
    private String city;
    private String state;
    private String zipcode;
}
