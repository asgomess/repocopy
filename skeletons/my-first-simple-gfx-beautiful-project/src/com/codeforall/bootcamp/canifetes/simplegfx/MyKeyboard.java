package com.codeforall.bootcamp.canifetes.simplegfx;

import com.codeforall.simplegraphics.keyboard.Keyboard;
import com.codeforall.simplegraphics.keyboard.KeyboardEvent;
import com.codeforall.simplegraphics.keyboard.KeyboardEventType;
import com.codeforall.simplegraphics.keyboard.KeyboardHandler;

public class MyKeyboard implements KeyboardHandler {
    
    private Keyboard keyboard;
    private PotatoHead potatoHead;
    
    public void init() {
        
        keyboard = new Keyboard(this);
        
        //setup the event
        KeyboardEvent goRight = new KeyboardEvent();
        //set the key to the event
        goRight.setKey(KeyboardEvent.KEY_D);
        goRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        
        //add event to the keyboard
        keyboard.addEventListener(goRight);
        //System.out.println("going right");
        
    }
    
    
    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if(keyboardEvent.getKey() == KeyboardEvent.KEY_D) {
            System.out.println("go right");
            potatoHead.moveRight();
        }
    }
    
    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
    
    }
    
    public void setPotatoHead(PotatoHead potatoHead) {
        this.potatoHead = potatoHead;
    }
}
