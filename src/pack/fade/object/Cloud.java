package pack.fade.object;

import pack.fade.Assets;
import pack.fade.Main;
import pack.fade.game.GameplayPane;

import javax.swing.*;
import java.util.Random;

public class Cloud extends MovingObject{

    public Cloud(int lives, boolean direction, ImageIcon imageIcon,int speed){
        super(lives, direction, imageIcon, speed);


    }/*
    public static Cloud spawnCloud(){
        Random random = new Random();
        ImageIcon imageIcon = Assets.getCloudImage();
        boolean direction = random.nextBoolean();
        int max = Main.getGameFrame().getGameplayPane().getShootingPane().getHeight();
        int diff = Main.getGameFrame().getGameplayPane().getHeight() - max;
        Position position;
        if(direction){
            position = new Position(Main.getGameFrame().getGameplayPane().getShootingPane().getHeight(),
                    Main.getGameFrame().getGameplayPane().getShootingPane().getWidth() - diff);
        }
        else{
            position = new Position(0,
                    Main.getGameFrame().getGameplayPane().getShootingPane().getWidth() - diff);
        }

        int speed = random.nextInt(2);

        return new Cloud(999,direction,imageIcon,speed);
    }
*/

}
