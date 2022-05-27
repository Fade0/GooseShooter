package pack.fade;

import pack.fade.game.GamePane;
import pack.fade.game.GameplayPane;
import pack.fade.leaderboard.LeaderboardPane;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    private CardLayout cardLayout;
    private MainMenuPane mainMenuPane;
    private JPanel mainPane;
    private GamePane modePane;
    private LeaderboardPane leaderboardPane;
    private GameplayPane gameplayPane;

    public GameFrame(){
        mainMenuPane = new MainMenuPane();

        mainPane = new JPanel();
        mainPane.setLayout(cardLayout = new CardLayout());
        mainPane.add(mainMenuPane = new MainMenuPane(),"MAIN_MENU");
        mainPane.add(modePane = new GamePane(),"MODE_MENU");
        mainPane.add(leaderboardPane = new LeaderboardPane(),"LEADERBOARD");
        mainPane.add(gameplayPane = new GameplayPane(),"GAMEPLAY");
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

    public CardLayout getCardLayout() {
        return cardLayout;
    }

    public MainMenuPane getMainMenuPane() {
        return mainMenuPane;
    }

    public JPanel getMainPane() {
        return mainPane;
    }

    public GamePane getModePane() {
        return modePane;
    }

    public LeaderboardPane getLeaderboardPane() {
        return leaderboardPane;
    }

    public GameplayPane getGameplayPane() {
        return gameplayPane;
    }
}
