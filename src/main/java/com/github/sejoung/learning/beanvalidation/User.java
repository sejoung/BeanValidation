package com.github.sejoung.learning.beanvalidation;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Data
public class User {

    @NotNull
    private String id;

    @Null
    private String name;


}
