# bee004
Spring Boot 3 and java 17 Application
## Start
* Change the blank Git project to a a Spring Boot 3 RESTful application
* Use java 17
>Set JDK version -> Java 17

>Set Maven
## Vulnerabilities
* ### CVEs, that are reported vulnerabilities:
> *  CVE-2022-41854 (Out-of-bounds Write vulnerability) and 
> * CVE-2022-1471 (Deserialization of Untrusted Data vulnerability)  
* ### Additional mitigations:
> * Isolation: If the vulnerable component is part of a microservice or module that can be isolated, ensure that it's exposed to minimal untrusted input.
> * Input Validation: Ensure that any data passed to the vulnerable component (in this case, any YAML processed by snakeyaml) is strictly validated.
> * Monitoring and Logging: Enhance monitoring on any component using the vulnerable library to detect potential attacks.

* ### Regular Scans

> Continuously integrate vulnerability scanning into your CI/CD process. Tools like Checkmarx, Snyk, and others can help identify vulnerable dependencies early in the development lifecycle.


## Using Properties
* @Value
> *  you can access values from application.yaml (or application.properties) using the @Value annotation 
* @ConfigurationProperties 
> * This is more useful when you have a group of related properties
> * Important Note: Ensure you have spring-boot-configuration-processor in your classpath for better type-safety and IDE support when using @ConfigurationProperties.
* PropertySourceFactory
> * Using PropertySourceFactory with @Configuration
    @PropertySource to use custom yaml for properties