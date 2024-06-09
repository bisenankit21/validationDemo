package com.example.springDemo.mvc.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
//CourseCodeConstraintValidator.class is a helper class that contains business rules/ validation logic
@Target({ElementType.METHOD,ElementType.FIELD})   //can apply our annotation to a method or field.
@Retention(RetentionPolicy.RUNTIME)  //Retain this annotation in the Java class file, process it at run time
public @interface CourseCode {

    //definedefault course code
    public String value() default "LUV";

    //defone defoult error message
    public String message() default "Must Start with LUV";

    //define defaoult ghroups
    public Class<?>[] groups() default {};

    //define default paylods
    public Class<? extends Payload>[] payload() default {};  //payload customs details about validation failure

}
