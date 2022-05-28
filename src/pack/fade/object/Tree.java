package pack.fade.object;

import pack.fade.Assets;

import javax.swing.*;

public class Tree extends MovingObject{
    private ImageIcon imageIcon;
    public Tree(){
        super(999,false, Assets.getTreeImage(),1);
        imageIcon = new ImageIcon("resources/img/treeImage.png");
    }


}
