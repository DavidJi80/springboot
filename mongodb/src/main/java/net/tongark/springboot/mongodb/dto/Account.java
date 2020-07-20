package net.tongark.springboot.mongodb.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collation = "account")
public class Account implements Serializable {

    @Id
    private Long id;

    private String name;

    public String getName(){
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                '}';
    }
}
