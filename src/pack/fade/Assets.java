package pack.fade;

import javax.swing.*;
import java.util.MissingResourceException;

public class Assets{

    private static ImageIcon startButton;
    private static ImageIcon leaderboardButton;
    private static ImageIcon titleImage;
    private static ImageIcon easyButtonImage;
    private static ImageIcon mediumButtonImage;
    private static ImageIcon hardButtonImage;
    private static ImageIcon returnButtonImage;
    private static ImageIcon exitButton;
    private static ImageIcon gooseGifImage;
    private static ImageIcon backgroundImage;
    private static ImageIcon creditsButtonImage;

    public Assets(){
        loadGraphics();

    }

    void loadGraphics(){
        try{
            startButton = new ImageIcon("resources/img/newGameButton.png");
            leaderboardButton = new ImageIcon("resources/img/leaderboardButton.png");
            exitButton = new ImageIcon("resources/img/exitButton.png");
            titleImage = new ImageIcon("resources/img/titleButton.png");
            gooseGifImage = new ImageIcon("resources/img/goose.gif");
            //backgroundImage = new ImageIcon("resources/img/background.png");
            //backgroundImage = new ImageIcon("resources/img/background.gif");
            backgroundImage = new ImageIcon("resources/img/bg2.png");
            //https://giventofly.github.io/pixelit/#examples

            easyButtonImage = new ImageIcon("resources/img/easyButton.png");
            mediumButtonImage = new ImageIcon("resources/img/mediumButton.png");
            hardButtonImage = new ImageIcon("resources/img/hardButton.png");
            returnButtonImage = new ImageIcon("resources/img/returnButton.png");
            creditsButtonImage = new ImageIcon("resources/img/creditButton.png");
        }

        catch (MissingResourceException exception){
            System.out.println("Failed to load graphics");
        }

    }

    public static ImageIcon getReturnButtonImage() {
        return returnButtonImage;
    }

    public static ImageIcon getCreditsButtonImage() {
        return creditsButtonImage;
    }

    public static ImageIcon getEasyButtonImage() {
        return easyButtonImage;
    }

    public static ImageIcon getMediumButtonImage() {
        return mediumButtonImage;
    }

    public static ImageIcon getHardButtonImage() {
        return hardButtonImage;
    }

    public static ImageIcon getStartButton() {
        return startButton;
    }

    public static ImageIcon getLeaderboardButton() {
        return leaderboardButton;
    }

    public static ImageIcon getExitButton() {
        return exitButton;
    }

    public static ImageIcon getTitleImage() {
        return titleImage;
    }

    public static ImageIcon getBackgroundImage() {
        return backgroundImage;
    }

    public static ImageIcon getGooseGifImage() {
        return gooseGifImage;
    }

    public static ImageIcon getReturnButton() {
        return returnButtonImage;
    }
}
