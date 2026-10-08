package com.center.island;

import com.center.common.Friend;

public class App {

    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Friend friend = new Friend("island");
        System.out.println(new App().getGreeting() + friend.getName());
    }
}
