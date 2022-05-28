package pack.fade.game;

public class GameTime extends Thread {

    private int counter;

    public GameTime(){
        counter = 0;
    }

    @Override
    public void run() {
        super.run();
        while(!isInterrupted()){
            try {
                sleep(1000);
                counter++;
                System.out.println(counter);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }

    public int getCounter() {
        return counter;
    }
}
