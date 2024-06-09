package com.example.springDemo.mvc;

import com.example.springDemo.mvc.validation.CourseCode;
import jakarta.validation.constraints.*;

public class Customer {

    @NotNull(message = "is Required")
    @Min(value = 0, message = "Must be greater then or equal to zero")
    @Max(value = 10, message = "Must be lesser then or equal to 10")
    private Integer freePasses;
   @Pattern(regexp = "^[a-zA-Z0-9]{5}",message = "Only 5 chars/digits")
    private String postalCode;


   @CourseCode(value = "TOPS", message = "Must start with TOPS")
   private String courseCode;

    //add validation rule
    private String firstName;
    @NotNull(message = "is Required")
    @Size(min=1, message = "is Required")
    private String lastName="";

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
