package pack.fade;

import pack.fade.game.GamePane;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    private CardLayout customizedCardLayout;
    private MainMenuPane mainMenuPane;
    private JPanel mainPane;
    private JPanel gamePane;
    private JPanel modePane;
    private JPanel leaderboardPane;

    public GameFrame(){
        mainMenuPane = new MainMenuPane();

        mainPane = new JPanel();
        mainPane.setLayout(customizedCardLayout = new CardLayout());
        mainPane.add(mainMenuPane = new MainMenuPane(),"MAIN_MENU");
        mainPane.add(gamePane = new GamePane(),"MODE_MENU");
        //mainPane.add(modePane = new ModePane(),"MODE_MENU");
        add(mainPane);

        importOptions();


    }
    public void importOptions(){
        setTitle("Honk Enjoyer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(new Dimension(800,600));
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public CardLayout getCustomizedCardLayout() {
        return customizedCardLayout;
    }

    public MainMenuPane getMainMenuPane() {
        return mainMenuPane;
    }

    public JPanel getMainPane() {
        return mainPane;
    }
}
