------------------------Learning from this Project-------------

1. Model = Model allows us to share information between Controllers and view pages(Thymeleaf)
2. @Valid= It Tell MVC to perform validation 
3. @ModelAttribute= Read the form data from the attribute that  was submitted by the HTML form.
4. BindingResult= it holds the result of the validation 
5. @InitBinder annotation work as a pre=processor, it will pre process each web request to our controller.
6. @InitBinder:it will use this to trim String
            Remove leading and trailing white space.
            if string has only white space then trim it to Null

7. Spring MVC validation - @Min and @Max annotation.
8. Spring MVC validation with regular Expression(@Pattern) -- A sequence of characters that define a search pattern.
9. Handling custom errors messages -- add to messages.properties inside resources, this file is a special file that spring MVC will use during validation
10. Creation of New Annotation i.e, (@CourseCode) and modifying it according to our requirement.