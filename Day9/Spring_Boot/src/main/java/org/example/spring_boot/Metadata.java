package org.example.spring_boot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix = "app")
public class Metadata {

    private String name;
    private double version;
    private String author;


    public String getName() {
        return name;
    }

    public double getVersion() {
        return version;
    }

    public String getAuthor() {
        return author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @GetMapping("/appinfo")
    @Override
    public String toString() {
        return "Metadata{" +
                "nae='" + name + '\'' +
                ", version=" + version +
                ", author='" + author + '\'' +
                '}';
    }
}
