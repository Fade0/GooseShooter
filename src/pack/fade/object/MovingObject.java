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
        super(imageIcon);
        this.lives = lives;
        this.alive = true;
        this.direction = direction;
        this.speed = speed;
        setBounds(800, new Random().nextInt(420), 125, 150);
        setOpaque(false);
        setContentAreaFilled(false);
        objectThread = new Thread(()->{
            while (alive){
                moveObject();
                try {
                    didHitBounds();
                    sleep(1000/60);
                } catch (InterruptedException e) {
                    //e.printStackTrace();
                    System.out.println("kaczka = ded");
                    break;
                }
            }

            Main.getGameFrame().getGameplayPane().getShootingPane().remove(this);
        });

        objectThread.start();
        Main.getGameFrame().getMainMenuPane().soundClick();

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
            setBounds(getX()+speed,getY(),120,152);

        }
        else //Right to left
        {
            setBounds(getX()-speed,getY(),120,152);
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

    public Thread getObjectThread() {
        return objectThread;
    }

    public void setObjectThread(Thread objectThread) {
        this.objectThread = objectThread;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
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
