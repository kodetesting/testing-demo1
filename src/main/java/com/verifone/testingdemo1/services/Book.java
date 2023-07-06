package com.verifone.testingdemo1.services;

import lombok.Data;

@Data
public class Book {
    String name;
    String author;

    public String getDetail() {
        return this.name + " " + this.author;
    }
}
