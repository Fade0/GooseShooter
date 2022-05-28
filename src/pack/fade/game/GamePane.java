package pack.fade.game;

import pack.fade.Assets;
import pack.fade.Main;

import javax.swing.*;
import java.awt.*;

public class GamePane extends JPanel {

    private ImageIcon titleImage;
    private ImageIcon easyButtonImage;
    private ImageIcon mediumButtonImage;
    private ImageIcon hardButtonImage;
    private ImageIcon returnButtonImage;
    private ImageIcon backgroundImage;
    private int modeSelected;

    public GamePane(){
        //Importing Images
        easyButtonImage = Assets.getEasyButtonImage();
        mediumButtonImage = Assets.getMediumButtonImage();
        hardButtonImage = Assets.getHardButtonImage();
        titleImage = Assets.getTitleImage();
        backgroundImage = Assets.getBackgroundImage();
        returnButtonImage = Assets.getReturnButtonImage();
        modeSelected = 0;

        //Button - Title
        JButton titleButton = new JButton(titleImage);
        titleButton.setBorder(BorderFactory.createEmptyBorder());
        titleButton.setContentAreaFilled(false);

        //Button - Easy
        JButton easyDiffButton = new JButton(easyButtonImage);
        easyDiffButton.setBorder(BorderFactory.createEmptyBorder());
        easyDiffButton.setContentAreaFilled(false);



        //Button - Medium
        JButton mediumDiffButton = new JButton(mediumButtonImage);
        mediumDiffButton.setBorder(BorderFactory.createEmptyBorder());
        mediumDiffButton.setContentAreaFilled(false);


        //Button - Hard
        JButton hardDiffButton = new JButton(hardButtonImage);
        hardDiffButton.setBorder(BorderFactory.createEmptyBorder());
        hardDiffButton.setContentAreaFilled(false);


        //Button - Return
        JButton returnButton = new JButton(returnButtonImage);
        returnButton.setBorder(BorderFactory.createEmptyBorder());
        returnButton.setContentAreaFilled(false);


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

        //easyDiffButton in InnerPane
        innerPane.add(easyDiffButton, gridBagConstraints);
        gridBagConstraints.gridy = 1;
        //madiumDiffButton in InnerPane
        innerPane.add(mediumDiffButton, gridBagConstraints);
        gridBagConstraints.gridy = 2;
        //hardDiffButton in InnerPane
        innerPane.add(hardDiffButton, gridBagConstraints);
        gridBagConstraints.gridy = 3;
        //returnButton in InnerPane
        innerPane.add(returnButton, gridBagConstraints);
        gridBagConstraints.gridy = 4;
        //ActionListeners
        titleButton.addActionListener(e ->{
            Main.getGameFrame().getMainMenuPane().getGoosed();
            System.out.println("MainMenu/ModeMenu/titleButton");
        });
        easyDiffButton.addActionListener(e ->{
            System.out.println("MainMenu/ModeMenu/easyButton");
            Main.getGameFrame().getCardLayout().show(Main.getGameFrame().getMainPane(),"GAMEPLAY");
            setModeSelected(0);



        });
        mediumDiffButton.addActionListener(e ->{
            System.out.println("MainMenu/ModeMenu/mediumButton");
            Main.getGameFrame().getCardLayout().show(Main.getGameFrame().getMainPane(),"GAMEPLAY");
            setModeSelected(1);


        });
        hardDiffButton.addActionListener(e ->{
            System.out.println("MainMenu/ModeMenu/hardButton");
            Main.getGameFrame().getCardLayout().show(Main.getGameFrame().getMainPane(),"GAMEPLAY");
            setModeSelected(2);

        });
        returnButton.addActionListener(e ->{
            System.out.println("MainMenu/returnButton");
            System.out.println("Returned from ModeMenu");
            Main.getGameFrame().getCardLayout().show(Main.getGameFrame().getMainPane(),"MAIN_MENU");
        });

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage.getImage(), 0, 0, this);
    }


    public void setModeSelected(int modeSelected) {
        this.modeSelected = modeSelected;
    }

    public void getModeSelected(int modeSelected){
        this.modeSelected = modeSelected;

        /*
        switch (modeSelected){
            case 2:
                System.out.println("Hard Mode");
                break;
            case 1:
                System.out.println("Medium Mode");
                break;
            case 0:
                System.out.println("Easy Mode");
                break;
        }
        */
        switch (modeSelected){
            case 2 -> {
                    setModeSelected(2);
            }
        }

    }


}
