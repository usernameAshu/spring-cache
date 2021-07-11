package com.mohanty.springcache.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
public class Student implements Serializable {

    private static final long serialVersionUID = 6226054793349716708L;

    private String id;
    private String fname ;
    private String lname;
    private String age;
    private Address address;
    private Major major;

}
