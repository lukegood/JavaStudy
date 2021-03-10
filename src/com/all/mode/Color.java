package com.all.mode;

public class Color {
    private final static Color YELLOW = new Color("黄色");
    private final static Color RED  = new Color("红色");
    private final static Color BLUE = new Color("蓝色");
    private String title;

    private Color(String title){
        this.title = title;
    }

    public String getString(){
        return title;
    }

    public static Color getInstance(int n){
        switch(n){
            case 1:
                return YELLOW;
            case 2:
                return RED;
            case 3:
                return BLUE;
            default:
                return null;
        }
    }
}
