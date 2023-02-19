package com.hackerman.springapp.kuba;

public class SimpleMethods {


    public static String fullName(String name, boolean isOkay){
        if (isOkay){
            return "Correct";

        }
        String fullName = name + " Smith";

        return fullName;
    }
}

//fullName("John");
