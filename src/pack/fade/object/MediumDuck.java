package pack.fade.object;

import pack.fade.Assets;

public class MediumDuck extends Duck{
    public MediumDuck(){
        super(2, false, Assets.getGooseGifImage(), 150,2,3);
        setText("M");
    }
}
