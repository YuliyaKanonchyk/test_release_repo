package com.dev;


import service.UserService;

public class AppRunner {
    public static void main(String[] args) {
        var userService = new UserService();

        System.out.println("Hello from service main - " /*+ userService.getUserDao(25l)*/);
    }
}
