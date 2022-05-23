package pack.fade.object;

public abstract class Duck {
    private int lives;
    private final int score;
    private final int damage;
    private boolean alive;

    protected Duck(int lives, int score, int damage, boolean alive) {
        this.lives = lives;
        this.score = score;
        this.damage = damage;
        this.alive = true;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getLives() {
        return lives;
    }

    public int getScore() {
        return score;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isAlive() {
        return alive;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "lives=" + lives +
                ", score=" + score +
                ", damage=" + damage +
                ", alive=" + alive +
                '}';
    }
}
