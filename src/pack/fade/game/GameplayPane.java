package pack.fade.game;

import pack.fade.MainMenuPane;

import javax.swing.*;
import java.awt.*;

public class GameplayPane extends JPanel {
    private CardLayout cardLayout;
    private JPanel leaderboardPane;
    private int lives;
    private int time;
    private int ammo;
    private int spawnRate;
    private double speed;
    private int magazineLevel;
    private int gameModeSelected;
    private int score;

    private ImageIcon titleImage;
    private ImageIcon testIcon1;
    private ImageIcon testIcon2;
    private ImageIcon testIcon3;
    private ImageIcon backgroundImage;
    private ImageIcon bg3;

    public GameplayPane(){
    titleImage = new ImageIcon("resources/img/returnButton.png");
    testIcon1 = new ImageIcon("resources/img/testButton1.png");
    testIcon2 = new ImageIcon("resources/img/testButton2.png");
    testIcon3 = new ImageIcon("resources/img/testButton3.png");
    backgroundImage = new ImageIcon("resources/img/background.gif");
    bg3 = new ImageIcon("resources/img/bg3.png");

    //Button - Title
    JButton titleButton = new JButton(titleImage);
    titleButton.setBorder(BorderFactory.createEmptyBorder());
    titleButton.setContentAreaFilled(false);

    //timeButton
    JButton timeButton = new JButton(testIcon1);
    timeButton.setBorder(BorderFactory.createEmptyBorder());
    timeButton.setContentAreaFilled(false);
    timeButton.setHorizontalTextPosition(JButton.CENTER);
    timeButton.setVerticalTextPosition(JButton.CENTER);

    //liveButton
    JButton liveButton = new JButton(testIcon2);
    liveButton.setBorder(BorderFactory.createEmptyBorder());
    liveButton.setContentAreaFilled(false);
    liveButton.setHorizontalTextPosition(JButton.CENTER);
    liveButton.setVerticalTextPosition(JButton.CENTER);

    //scoreButton
    JButton scoreButton = new JButton(testIcon3);
    scoreButton.setBorder(BorderFactory.createEmptyBorder());
    scoreButton.setContentAreaFilled(false);
    scoreButton.setHorizontalTextPosition(JButton.CENTER);
    scoreButton.setVerticalTextPosition(JButton.CENTER);

    //ammoButton
    JButton ammoButton = new JButton(testIcon1);
    ammoButton.setBorder(BorderFactory.createEmptyBorder());
    ammoButton.setContentAreaFilled(false);
    ammoButton.setHorizontalTextPosition(JButton.CENTER);
    ammoButton.setVerticalTextPosition(JButton.CENTER);

    //reloardButton
    JButton reloardButton = new JButton(testIcon2);
    reloardButton.setBorder(BorderFactory.createEmptyBorder());
    reloardButton.setContentAreaFilled(false);
    reloardButton.setText("Reload!");
    reloardButton.setHorizontalTextPosition(JButton.CENTER);
    reloardButton.setVerticalTextPosition(JButton.CENTER);

    //upgradeButton
    JButton upgradeButton = new JButton(testIcon3);
    upgradeButton.setBorder(BorderFactory.createEmptyBorder());
    upgradeButton.setContentAreaFilled(false);
    upgradeButton.setText("Upgrade!");
    upgradeButton.setHorizontalTextPosition(JButton.CENTER);
    upgradeButton.setVerticalTextPosition(JButton.CENTER);

        //bg3Button
        JButton bg3Button = new JButton(bg3);
        bg3Button.setBorder(BorderFactory.createEmptyBorder());
        bg3Button.setContentAreaFilled(false);
        bg3Button.setText("Upgrade!");
        bg3Button.setHorizontalTextPosition(JButton.CENTER);
        bg3Button.setVerticalTextPosition(JButton.CENTER);

        //LayoutMain
        setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = GridBagConstraints.NORTH;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 0;
        gridBagConstraints.ipady = 0;


        //TitleButton
        add(titleButton, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        //StartButton
        add(timeButton, gridBagConstraints);
        gridBagConstraints.gridx = 2;
        //LeaderboardButton
        add(scoreButton, gridBagConstraints);
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        //CreditsButton
        add(liveButton, gridBagConstraints);

        gridBagConstraints.gridx = 6;


        //bg3
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridx = 0;
        add(bg3Button,gridBagConstraints);

        gridBagConstraints.gridx = 2;
//        //InnerPane
//        JPanel innerPane = new JPanel();
//        innerPane.setOpaque(false);
//
//        add(innerPane, gridBagConstraints);
//        innerPane.setLayout(new GridBagLayout());
//        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
//        gridBagConstraints.anchor = GridBagConstraints.CENTER;
//        gridBagConstraints.gridx = 0;
//        gridBagConstraints.gridy = 0;
//        gridBagConstraints.ipadx = 0;
//        gridBagConstraints.ipady = 0;
//
//        //StartButton in InnerPane
//        innerPane.add(ammoButton, gridBagConstraints);
//        gridBagConstraints.gridx = 1;
//        //LeaderboardButton in InnerPane
//        innerPane.add(reloardButton, gridBagConstraints);
//        gridBagConstraints.gridx = 2;
//        //CreditsButton in InnerPane
//        innerPane.add(upgradeButton, gridBagConstraints);
//        gridBagConstraints.gridx = 3;




    }
    void setGameSettings(){
        switch (gameModeSelected){
            //Hard
            case 2:
            {
                lives = 1;
                ammo = 5;
                spawnRate = 10;
                speed = 3;
                magazineLevel = 1;
            }
            //Medium
            case 1:
            {
                lives = 3;
                ammo = 7;
                spawnRate = 8;
                speed = 2;
                magazineLevel = 1;
            }
            //Easy
            default:
            {
                lives = 5;
                ammo = 50;
                spawnRate = 5;
                speed = 1;
                magazineLevel = 1;
            }



        }
    }
    void upgradeMagazine(){
        magazineLevel++;
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage.getImage(), 0, 0, this);
    }
}
