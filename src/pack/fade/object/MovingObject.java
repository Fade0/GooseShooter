package pack.fade.object;

import pack.fade.Assets;
import pack.fade.Main;

import javax.swing.*;

import java.util.Random;

import static java.lang.Thread.sleep;

public class MovingObject extends JButton {

    private int lives;
    private boolean alive;
    private boolean direction;
    private ImageIcon imageIcon;
    private Thread objectThread;
    private int speed;

    public MovingObject(int lives, boolean direction, ImageIcon imageIcon,int speed) {
        this.lives = lives;
        this.alive = true;
        this.direction = direction;
        this.imageIcon = Assets.getGooseGifImage();
        this.speed = speed;
        setBounds(800, new Random().nextInt(420), 50, 50);
        objectThread = new Thread(()->{
            while (alive){
                moveObject();
                try {
                    didHitBounds();
                    sleep(1000/60);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }

            System.out.println("Bbye D:");
            Main.getGameFrame().getGameplayPane().getShootingPane().remove(this);
        });

        objectThread.start();
        Main.getGameFrame().getMainMenuPane().soundClick();
        setText(":D");
    }

    public void moveObject(){
        /*
        jeseli w lewo
            ustawPozycje x -> x - 1 , y
        else
            wymysl cos
         */
        if (direction) //Left to right
        {
            setBounds(getX()+speed,getY(),50,50);

        }
        else //Right to left
        {
            setBounds(getX()-speed,getY(),50,50);
        }

    }

    public void didHitBounds(){
        if(getX()<=0 && !direction){
            lives--;
            alive = false;
        }
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean isDirection() {
        return direction;
    }

    public void setDirection(boolean direction) {
        this.direction = direction;
    }

    public ImageIcon getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    @Override
    public String toString() {
        return "MovingObject{" +
                "lives=" + lives +
                ", alive=" + alive +
                ", direction=" + direction +
                ", imageIcon=" + imageIcon +
                '}';
    }
}
