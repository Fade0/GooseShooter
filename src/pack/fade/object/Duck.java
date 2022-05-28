package pack.fade.object;

import javax.swing.*;
import java.awt.event.ActionEvent;

public abstract class Duck extends MovingObject {
    private final int score;
    private final int damage;


    public Duck(int lives, boolean direction, ImageIcon imageIcon, int score, int damage, int speed) {
        super(lives, direction, imageIcon, speed);
        this.score = score;
        this.damage = damage;
        imageIcon = new ImageIcon("resources/img/goose.png");
        System.out.println("IM ALIVE!");

        addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isNotDead();
            }
        });
    }
    public void isNotDead(){
        if(getLives() >= 0){
            System.out.println("oof");
            setLives(getLives()-1);
        }
        else{
            getObjectThread().interrupt();
        }

    }

}
