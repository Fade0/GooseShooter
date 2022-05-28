package pack.fade.game;

import pack.fade.Assets;
import pack.fade.Main;
import pack.fade.MainMenuPane;
import pack.fade.object.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


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
    private ImageIcon timeButtonImage;
    private ImageIcon scoreButtonImage;
    private ImageIcon livesButtonImage;
    private ImageIcon reloadButtonImage;
    private ImageIcon ammoButtonImage;
    private ImageIcon upgradeButtonImage;
    private ImageIcon levelButtonImage;
    private ImageIcon backgroundImage;
    private ImageIcon bg3;

    private GameTime gameTime;
    private JPanel shootingPane;

    private JLabel timeLabel;
    private JLabel lviesLabel;
    private JLabel scoreLabel;
    /*
    wywalic wszystkie zmienne typu button przed konstruktor
    np
    Jbutton reloadBUtton;
     */

    public GameplayPane(){
        titleImage = new ImageIcon("resources/img/GameButtonTop1.png");
        timeButtonImage = new ImageIcon("resources/img/GameButtonTop2.png");
        scoreButtonImage = new ImageIcon("resources/img/GameButtonTop4.png");
        livesButtonImage = new ImageIcon("resources/img/GameButtonTop3.png");
        reloadButtonImage = new ImageIcon("resources/img/GameButtonBottom1.png");
        ammoButtonImage = new ImageIcon("resources/img/GameButtonBottom2.png");
        upgradeButtonImage = new ImageIcon("resources/img/GameButtonBottom3.png");
        levelButtonImage = new ImageIcon("resources/img/GameButtonBottom4.png");
        backgroundImage = new ImageIcon("resources/img/background.gif");
        bg3 = new ImageIcon("resources/img/bg3.png");

        gameTime = new GameTime();

        timeLabel = new JLabel("time");
        //Button - Title
        JButton titleButton = new JButton(titleImage);
        titleButton.setBorder(BorderFactory.createEmptyBorder());
        titleButton.setContentAreaFilled(false);

        //timeButton
        JButton timeButton = new JButton(timeButtonImage);
        timeButton.setBorder(BorderFactory.createEmptyBorder());
        timeButton.setContentAreaFilled(false);
        timeButton.setHorizontalTextPosition(JButton.HORIZONTAL);
        timeButton.setVerticalTextPosition(JButton.CENTER);
        //timeButton.setText();

        //liveButton
        JButton liveButton = new JButton(livesButtonImage);
        liveButton.setBorder(BorderFactory.createEmptyBorder());
        liveButton.setContentAreaFilled(false);
        liveButton.setText("live!");
        liveButton.setHorizontalTextPosition(JButton.CENTER);
        liveButton.setVerticalTextPosition(JButton.CENTER);

        //scoreButton
        JButton scoreButton = new JButton(scoreButtonImage);
        scoreButton.setBorder(BorderFactory.createEmptyBorder());
        scoreButton.setContentAreaFilled(false);
        scoreButton.setText("score!");
        scoreButton.setHorizontalTextPosition(JButton.CENTER);
        scoreButton.setVerticalTextPosition(JButton.CENTER);

        //ammoButton
        JButton ammoButton = new JButton(ammoButtonImage);
        ammoButton.setBorder(BorderFactory.createEmptyBorder());
        ammoButton.setContentAreaFilled(false);
        ammoButton.setText("ammo!");
        ammoButton.setHorizontalTextPosition(JButton.CENTER);
        ammoButton.setVerticalTextPosition(JButton.CENTER);

        //reloardButton
        JButton reloadButton = new JButton(reloadButtonImage);
        reloadButton.setBorder(BorderFactory.createEmptyBorder());
        reloadButton.setContentAreaFilled(false);
        reloadButton.setText("Reload!");
        reloadButton.setHorizontalTextPosition(JButton.CENTER);
        reloadButton.setVerticalTextPosition(JButton.CENTER);

        //upgradeButton
        JButton upgradeButton = new JButton(upgradeButtonImage);
        upgradeButton.setBorder(BorderFactory.createEmptyBorder());
        upgradeButton.setContentAreaFilled(false);
        upgradeButton.setText("Upgrade!");
        upgradeButton.setHorizontalTextPosition(JButton.CENTER);
        upgradeButton.setVerticalTextPosition(JButton.CENTER);

        //levelButton
        JButton testbutton2 = new JButton(levelButtonImage);
        testbutton2.setBorder(BorderFactory.createEmptyBorder());
        testbutton2.setContentAreaFilled(false);
        testbutton2.setText("testbutton2");
        testbutton2.setHorizontalTextPosition(JButton.CENTER);
        testbutton2.setVerticalTextPosition(JButton.CENTER);

        //bg3Button
        JButton bg3Button = new JButton(bg3);
        bg3Button.setBorder(BorderFactory.createEmptyBorder());
        bg3Button.setContentAreaFilled(false);
        bg3Button.setText("bg");
        bg3Button.setHorizontalTextPosition(JButton.CENTER);
        bg3Button.setVerticalTextPosition(JButton.CENTER);

        shootingPane = new JPanel();
        shootingPane.setPreferredSize(new Dimension(800,420));
        shootingPane.setMinimumSize(new Dimension(800,420));
        shootingPane.setOpaque(false);

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
        add(liveButton, gridBagConstraints);
        gridBagConstraints.gridx = 3;
        //CreditsButton
        add(scoreButton, gridBagConstraints);

        //bg3
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridwidth = 4;
        add(shootingPane,gridBagConstraints);
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 1;
        //TitleButton
        add(reloadButton, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        //StartButton
        add(ammoButton, gridBagConstraints);
        gridBagConstraints.gridx = 2;
        //LeaderboardButton
        add(upgradeButton, gridBagConstraints);
        gridBagConstraints.gridx = 3;
        //CreditsButton
        add(testbutton2, gridBagConstraints);
        upgradeButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Cloud cloud = new Cloud(9999,false,Assets.getCloudImage(),1);
                shootingPane.add(cloud);
            }
        });

        ammoButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                Tree tree = new Tree();
                System.out.println(tree.getHeight());
                shootingPane.add(tree);

            }
        });

        reloadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println(Main.getGameTime().getCounter());
                spawnRate = Main.getSettings().getModeSelected();
                System.out.println(spawnRate);
                Random random = new Random();
                int rand = (random.nextInt(100));
                System.out.println(rand);
                if(rand <= 10){
                    Duck duck = new HardDuck();
                    shootingPane.add(duck);
                }
                else if(rand <= 50){
                    Duck duck = new MediumDuck();
                    shootingPane.add(duck);
                }
                else if(rand <= 100){
                    Duck duck = new EasyDuck();
                    shootingPane.add(duck);
                }

            }
        });

    }

    void setGameSettings(){
        switch (gameModeSelected){
            //Hard
            case 2:
            {
                lives = 1;
                ammo = 5;
                spawnRate = 3;
                speed = 3;
                magazineLevel = 1;
            }
            //Medium
            case 1:
            {
                lives = 3;
                ammo = 7;
                spawnRate = 2;
                speed = 2;
                magazineLevel = 1;
            }
            //Easy
            default:
            {
                lives = 5;
                ammo = 9;
                spawnRate = 1;
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

    public JPanel getShootingPane() {
        return shootingPane;
    }

    public void setShootingPane(JPanel shootingPane) {
        this.shootingPane = shootingPane;
    }

}
