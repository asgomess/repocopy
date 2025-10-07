package com.codeforall.bootcamp.canifetes.simplegfx;

import com.codeforall.simplegraphics.pictures.Picture;

public class PotatoHead {
    
    private Picture picture;
    
    public PotatoHead(Picture picture) {
        this.picture = picture;
        this.picture.draw();
    }
    
    public void moveRight() {
        picture.translate(10, 0);
    }
    
    
}
