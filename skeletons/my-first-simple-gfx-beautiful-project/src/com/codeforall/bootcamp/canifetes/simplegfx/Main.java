package com.codeforall.bootcamp.canifetes.simplegfx;

import com.codeforall.simplegraphics.graphics.Canvas;
import com.codeforall.simplegraphics.graphics.Color;
import com.codeforall.simplegraphics.graphics.Ellipse;
import com.codeforall.simplegraphics.graphics.Rectangle;
import com.codeforall.simplegraphics.pictures.Picture;

public class Main {
    
    public static void main(String[] args) {
        
        Canvas.setMaxX(900);
        Canvas.setMaxY(600);
        
        Rectangle rectangle = new Rectangle(10, 10, 900, 600);
        rectangle.draw();
        
//        Picture potato = new Picture(100, 100, "resources/mrsPotatoHead.jpg");
//        potato.draw();
//        potato.translate(300, 0);
        
        PotatoHead mrsPotato = new PotatoHead(new Picture(100, 100, "resources/mrsPotatoHead.jpg"));
        MyKeyboard myKeyboard = new MyKeyboard();
        myKeyboard.setPotatoHead(mrsPotato);
        myKeyboard.init();
        
    }
    
}
