package pack.fade.object;

import javax.swing.*;

public abstract class Duck extends MovingObject {
    private final int score;
    private final int damage;


    public Duck(int lives, boolean direction, ImageIcon imageIcon, int score, int damage, int speed) {
        super(lives, direction, imageIcon, speed);
        this.score = score;
        this.damage = damage;
        System.out.println("IM ALIVE!");
    }

}
