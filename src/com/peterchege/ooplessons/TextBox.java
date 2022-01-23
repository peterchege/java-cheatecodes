package com.peterchege.ooplessons;

public class TextBox extends UIControl {
    private String text;

    public TextBox() {
        super(true);
        text = "";
        System.out.println("TextBox");
    }

    public void setText(String text){
        this.text = text;
    }
    public String getText(){
        return text;
    }
    public void clear(){
        text = "";
    }
}
