package com.github.sejoung.learning.beanvalidation;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class ValidationTest {
    public static void main(String[] args) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        User user  = new User();
        user.setId("123");
        user.setName("123");

        Set<ConstraintViolation<User>> validate = validator.validate(user);
        validate.forEach(error -> System.out.println(error.getMessage()));

    }
}
