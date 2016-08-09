package com.jinjiang.springcloud.service.domain;

import java.io.Serializable;

/**
 * Created by Laoer on 16/8/8.
 */
public class User implements Serializable {

    private static final long serialVersionUID = 2857335915440317846L;

    public Long id;

    public String name;

    public String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
