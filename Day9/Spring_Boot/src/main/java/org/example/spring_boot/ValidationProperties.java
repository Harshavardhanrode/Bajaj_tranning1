package org.example.spring_boot;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@ConfigurationProperties(prefix = "app")
@Component
@Validated
@RestController
public class ValidationProperties{

    @Email
    private String email;

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Min(1000)
    @Max(10000)
    private int timeout;

    @GetMapping("/details")
    public String getDetails(){
        return email + " "+timeout;

    }

}
