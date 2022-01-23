package com.peterchege.ooplessons;

public class TextBox {
    public String getText;
    private String text;

    public TextBox() {
        text = "";
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
