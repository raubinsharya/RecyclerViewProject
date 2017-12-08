package com.example.raubinsharya.myapplication;

/**
 * Created by Raubinsh Arya on 08-12-2017.
 */

public class Student {
    private String name;
    private String trade;
    private String rollNo;
    private String imageURL;
    private String collge;
    public Student(String name, String trade, String rollNo,String collge, String imageURL) {
        this.name = name;
        this.trade = trade;
        this.rollNo = rollNo;
        this.imageURL = imageURL;
        this.collge=collge;
    }

    public String getName() {return name;}

    public String getTrade() {
        return trade;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getImageURL() {
        return imageURL;
    }
    public String getCollge(){return collge; }
}
