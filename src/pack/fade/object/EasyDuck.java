package pack.fade.object;

import pack.fade.Assets;

import javax.swing.*;

public class EasyDuck extends Duck{
    public EasyDuck() {
        super(1, false, Assets.getEasyGooseImage(), 100,1,1);
        //setImageIcon();
        setText("E");
    }
}
