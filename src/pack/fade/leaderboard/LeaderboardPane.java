package pack.fade.leaderboard;

import pack.fade.Assets;
import pack.fade.Main;

import javax.swing.*;
import java.awt.*;

public class LeaderboardPane extends JPanel{
    private JList<Player> playerJlist;
    private ImageIcon titleImage;
    private ImageIcon returnButtonImage;
    private ImageIcon backgroundImage;

    public LeaderboardPane(){
        //Importing Images

        titleImage = Assets.getTitleImage();
        backgroundImage = Assets.getBackgroundImage();
        returnButtonImage = Assets.getReturnButtonImage();

        //Button - Title
        JButton titleButton = new JButton(titleImage);
        titleButton.setBorder(BorderFactory.createEmptyBorder());
        titleButton.setContentAreaFilled(false);

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

        //JList in InnerPane TO ADD
        innerPane.add(titleButton, gridBagConstraints);
        gridBagConstraints.gridy = 1;

        //returnDiffButton in InnerPane
        innerPane.add(returnButton, gridBagConstraints);
        gridBagConstraints.gridy = 2;

        returnButton.addActionListener(e ->{
            System.out.println("MainMenu/LeaderboardMenu/returnButton");
            System.out.println("Returned from LeaderboardMenu");
            Main.getGameFrame().getCardLayout().show(Main.getGameFrame().getMainPane(),"MAIN_MENU");
        });

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage.getImage(), 0, 0, this);
    }
}
