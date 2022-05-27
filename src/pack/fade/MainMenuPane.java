package pack.fade;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class MainMenuPane extends JPanel {
    private ImageIcon titleImage;
    private ImageIcon startButtonImage;
    private ImageIcon leaderboardButtonImage;
    private ImageIcon exitButtonImage;
    private ImageIcon backgroundImage;
    private ImageIcon creditsButtonImage;

    public  MainMenuPane() {
        //importing Images
        startButtonImage = Assets.getStartButton();
        leaderboardButtonImage = Assets.getLeaderboardButton();
        exitButtonImage = Assets.getExitButton();
        titleImage = Assets.getTitleImage();
        backgroundImage = Assets.getBackgroundImage();
        creditsButtonImage = Assets.getCreditsButtonImage();

        //Creating Elements
        //Button - Title
        JButton titleButton = new JButton(titleImage);
        titleButton.setBorder(BorderFactory.createEmptyBorder());
        titleButton.setContentAreaFilled(false);

        //Button - Start
        JButton startButton = new JButton(startButtonImage);
        startButton.setBorder(BorderFactory.createEmptyBorder());
        startButton.setContentAreaFilled(false);

        //Button - Leaderboard
        JButton leaderboardsButton = new JButton(leaderboardButtonImage);
        leaderboardsButton.setBorder(BorderFactory.createEmptyBorder());
        leaderboardsButton.setContentAreaFilled(false);

        //Button - Exit
        JButton exitButton = new JButton(exitButtonImage);
        exitButton.setBorder(BorderFactory.createEmptyBorder());
        exitButton.setContentAreaFilled(false);

        //Button - Credits
        JButton creditsButton = new JButton(creditsButtonImage);
        creditsButton.setBorder(BorderFactory.createEmptyBorder());
        creditsButton.setContentAreaFilled(false);

        //LayoutMain
        setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = GridBagConstraints.NORTH;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 0;
        gridBagConstraints.ipady = 0;

        //TitleButtonMain
        add(titleButton, gridBagConstraints);
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridx = 0;

        //InnerPane
        JPanel innerPane = new JPanel();
        innerPane.setOpaque(false);
        add(innerPane, gridBagConstraints);
        innerPane.setLayout(new GridBagLayout());
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = GridBagConstraints.CENTER;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 0;
        gridBagConstraints.ipady = 0;

            //StartButton in InnerPane
            innerPane.add(startButton, gridBagConstraints);
            gridBagConstraints.gridy = 1;
            //LeaderboardButton in InnerPane
            innerPane.add(leaderboardsButton, gridBagConstraints);
            gridBagConstraints.gridy = 2;
            //CreditsButton in InnerPane
            innerPane.add(creditsButton, gridBagConstraints);
            gridBagConstraints.gridy = 3;
            //ExitButton in InnerPane
            innerPane.add(exitButton, gridBagConstraints);
            gridBagConstraints.gridy = 4;


            //ActionListeners
            titleButton.addActionListener(e ->{
                getGoosed();
                System.out.println("MainMenu/titleButton");
            });
            startButton.addActionListener(e ->{
                System.out.println("MainMenu/startButton");
                Main.getGameFrame().getCardLayout().show(Main.getGameFrame().getMainPane(),"MODE_MENU");
            });
            leaderboardsButton.addActionListener(e ->{
                System.out.println("MainMenu/leaderboardButton");
                Main.getGameFrame().getCardLayout().show(Main.getGameFrame().getMainPane(),"LEADERBOARD");
            });
            creditsButton.addActionListener(e ->{
                System.out.println("MainMenu/creditsButton");
                
            });
            exitButton.addActionListener(e ->{
                System.out.println("MainMenu/exitButton");
                System.exit(0);
            });
    }
    //Background
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage.getImage(), 0, 0, this);
    }

    public void soundClick(){
        try{
            File s = new File("resources/audio/honk1s.wav");
            Clip c = AudioSystem.getClip();
            c.open(AudioSystem.getAudioInputStream(s));
            c.start();
        }
        catch (Exception e ){
            e.printStackTrace();
        }
    }

    public void getGoosed(){
        System.out.println("Honk!");
        soundClick();
        System.out.print("                                   ___\n" +
                "                               ,-\"\"   `.\n" +
                "                             ,'  _   e )`-._\n" +
                "                            /  ,' `-._<.===-'\n" +
                "                           /  /\n" +
                "                          /  ;\n" +
                "              _          /   ;\n" +
                " (`._    _.-\"\" \"\"--..__,'    |\n" +
                " <_  `-\"\"                     \\\n" +
                "  <`-                          :\n" +
                "   (__   <__.                  ;\n" +
                "     `-.   '-.__.      _.'    /\n" +
                "        \\      `-.__,-'    _,'\n" +
                "         `._    ,    /__,-'\n" +
                "            \"\"._\\__,'< <____\n" +
                "                 | |  `----.`.\n" +
                "                 | |        \\ `.\n" +
                "                 ; |___      \\-``\n" +
                "                 \\   --<\n" +
                "                  `.`.<\n" +
                "                    `-'\n");
        System.out.println("Honk!");
    }


}
