package pack.fade.game;

public class Settings {
    private int playerLives;
    private int gameTime;
    private int score;
    private int modeSelected;

    public Settings() {
        this.playerLives = 10;
        this.gameTime = 0;
        this.score = 0;
        this.modeSelected = 0;

    }

    public int getPlayerLives() {
        return playerLives;
    }

    public void setPlayerLives(int playerLives) {
        this.playerLives = playerLives;
    }

    public int getGameTime() {
        return gameTime;
    }

    public void setGameTime(int gameTime) {
        this.gameTime = gameTime;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getModeSelected() {
        return modeSelected;
    }

    public void setModeSelected(int modeSelected) {
        this.modeSelected = modeSelected;
    }
}
