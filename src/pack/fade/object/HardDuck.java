package pack.fade.object;

import pack.fade.Assets;

public class HardDuck extends Duck{
    public HardDuck(){
        super(3, false, Assets.getGooseGifImage(), 200,3,5);
        setText("H");
    }
}
