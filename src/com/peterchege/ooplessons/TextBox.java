package com.peterchege.ooplessons;

public class TextBox extends UIControl {
    private String text;

//    public TextBox() {
//        super(true);
//        text = "";
//        System.out.println("TextBox");
//    }


    @Override
    public void render() {
        System.out.println("Render TextBox");
    }

    @Override
    public String toString(){
        return text;
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
