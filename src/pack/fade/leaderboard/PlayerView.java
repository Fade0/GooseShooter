package pack.fade.leaderboard;

import javax.swing.*;
import java.awt.*;

public class PlayerView extends JPanel {
    private final JLabel player;

    public PlayerView(){
        player = new JLabel();
        add(player);
        setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
    public void setPlayer(Player score){
        player.setText(score.nickName() + " " + score.score());
    }

    public JLabel getPlayer() {
        return player;
    }
}
