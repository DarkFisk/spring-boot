package com.epam.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Drudyak on 7/25/16.
 */
@Entity
public class Product {
    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private  String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "id=" + getId() +
                ", name=" + getName();
    }
}
