package pack.fade;

import pack.fade.game.GamePane;
import pack.fade.leaderboard.LeaderboardPane;

import javax.swing.*;
import java.awt.*;

public class Main {

    private static GameFrame gameFrame;

    public static void main(String[] args) {

        new Assets();


        SwingUtilities.invokeLater(() ->{
            gameFrame = new GameFrame();
        });
    }

    public static pack.fade.Main.GameFrame getGameFrame(){
        return gameFrame;
    }


    public static class GameFrame extends JFrame {

        private CardLayout cardLayout;
        private MainMenuPane mainMenuPane;
        private JPanel mainPane;
        private JPanel gamePane;
        private JPanel modePane;
        private JPanel leaderboardPane;


        public GameFrame(){
            mainMenuPane = new MainMenuPane();

            mainPane = new JPanel();
            mainPane.setLayout(cardLayout = new CardLayout());
            mainPane.add(mainMenuPane = new MainMenuPane(),"MAIN_MENU");
            mainPane.add(modePane = new GamePane(),"MODE_MENU");
            mainPane.add(leaderboardPane = new LeaderboardPane(),"LEADERBOARD");
            //mainPane.add(GameplayPane = new GameplayPane(),"GAMEPLAY");

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
        }
    }
}
