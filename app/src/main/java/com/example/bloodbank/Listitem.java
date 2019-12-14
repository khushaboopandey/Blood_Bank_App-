package com.example.bloodbank;

public class Listitem {
    String name;
    String Contact;
    String imageUrl;



    public Listitem(String name, String contact) {
        this.name = name;
        Contact = contact;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return Contact;
    }


    public void setContact(String contact) {
        Contact = contact;

    }
}
