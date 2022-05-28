package pack.fade.object;

import pack.fade.Assets;

import javax.swing.*;

public class HardDuck extends Duck{
    public HardDuck(){

        super(3, false, Assets.getGooseGifImage2(), 200,3,5);


        setText("H");
    }
}
