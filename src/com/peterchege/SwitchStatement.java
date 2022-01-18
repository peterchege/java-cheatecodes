package com.peterchege;

public class SwitchStatement {
    public static void main(String[] args){
        String role = "admin";
        switch (role){
            case "admin":
                System.out.println("You're an admin");
                break;
            case "moderator":
                System.out.println("You're an moderator");
                break;
            case "user":
                System.out.println("You're a normal user");
                break;
            default:
                System.out.println("You're a guest");
        }

    }
}
