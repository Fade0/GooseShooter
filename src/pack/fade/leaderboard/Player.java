package pack.fade.leaderboard;

import java.io.Serializable;

public record Player(String nickName, int score, int time) implements Serializable {
    @Override
    public String toString() {
        return "Player{" +
                "nickName='" + nickName + '\'' +
                ", score=" + score +
                ", time=" + time +
                '}';
    }
}
