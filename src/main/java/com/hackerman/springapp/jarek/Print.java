package com.hackerman.springapp.jarek;

public class Print {
    public String printName(char initialLetter) throws IllegalStateException {
        switch (initialLetter){
            case 'r':
                return "rafal";
            case 'j':
                return "jarek";
            case 'k':
                return "kuba";
            case 'l':
                return "leon";
            default:
                throw new IllegalStateException("Unexpected value: " + initialLetter);
        }
    }
}
