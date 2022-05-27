package pack.fade;

import pack.fade.game.GamePane;
import pack.fade.game.GameplayPane;
import pack.fade.game.Settings;
import pack.fade.leaderboard.LeaderboardPane;

import javax.swing.*;
import java.awt.*;
import java.util.Set;

public class Main {

    private static GameFrame gameFrame;
    private static Settings settings;

    public static void main(String[] args) {
        settings = new Settings();
        new Assets();


        SwingUtilities.invokeLater(() ->{
            gameFrame = new GameFrame();
        });
    }

    public static GameFrame getGameFrame() {
        return gameFrame;
    }

    public static Settings getSettings() {
        return settings;
    }
    /*public static class GameFrame extends JFrame {

        private CardLayout cardLayout;
        private MainMenuPane mainMenuPane;
        private JPanel mainPane;
        private JPanel gamePane;
        private JPanel modePane;
        private JPanel leaderboardPane;
        private JPanel gameplayPane;


        public GameFrame(){
            mainMenuPane = new MainMenuPane();

            mainPane = new JPanel();
            mainPane.setLayout(cardLayout = new CardLayout());
            mainPane.add(mainMenuPane = new MainMenuPane(),"MAIN_MENU");
            mainPane.add(modePane = new GamePane(),"MODE_MENU");
            mainPane.add(leaderboardPane = new LeaderboardPane(),"LEADERBOARD");
            mainPane.add(gameplayPane = new GameplayPane(),"GAMEPLAY");

            add(mainPane);

            importOptions();
        }
        public void importOptions(){
            setTitle("Honk Enjoyer");
            setSize(new Dimension(800,600));
            setVisible(true);
            setResizable(false);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

        public CardLayout getCardLayout() {
            return cardLayout;
        }

        public MainMenuPane getMainMenuPane() {
            return mainMenuPane;
        }

        public JPanel getMainPane() {
            return mainPane;
        }*/
}
