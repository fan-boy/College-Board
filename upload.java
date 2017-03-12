package com.ueuo.helloworld.p2f;

/**
 * Created by Aaditya on 07-03-2017.
 */

public class upload {

    public String name;
    public String url;
    public String username;

    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)
    public upload() {
    }

    public upload(String name, String url,String username) {
        this.name = name;
        this.url= url;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername(){ return username;}
}
