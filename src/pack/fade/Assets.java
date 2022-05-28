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
    private static ImageIcon gooseGifImage2;
    private static ImageIcon easyGooseImage;
    private static ImageIcon mediumGooseImage;
    private static ImageIcon hardGooseImage;
    private static ImageIcon cloudImage;
    private static ImageIcon treeImage;
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
            gooseGifImage2 = new ImageIcon("resources/img/goose.png");
            easyGooseImage = new ImageIcon("resources/img/goose.png");
            mediumGooseImage = new ImageIcon("resources/img/mediumGoose.png");
            hardGooseImage = new ImageIcon("resources/img/hardGoose.png");
            backgroundImage = new ImageIcon("resources/img/bg2.png");
            cloudImage = new ImageIcon("resources/img/cloudImage.png");
            treeImage = new ImageIcon("resources/img/treeImage.png");

            //https://giventofly.github.io/pixelit/#examples
            //backgroundImage = new ImageIcon("resources/img/background.png");
            //backgroundImage = new ImageIcon("resources/img/background.gif");

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

    public static ImageIcon getTreeImage() {
        return treeImage;
    }

    public static ImageIcon getCloudImage() {
        return cloudImage;
    }

    public static ImageIcon getEasyGooseImage() {
        return easyGooseImage;
    }

    public static ImageIcon getMediumGooseImage() {
        return mediumGooseImage;
    }

    public static ImageIcon getHardGooseImage() {
        return hardGooseImage;
    }

    public static ImageIcon getGooseGifImage2() {
        return gooseGifImage2;
    }

    public static void setGooseGifImage2(ImageIcon gooseGifImage2) {
        Assets.gooseGifImage2 = gooseGifImage2;
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
