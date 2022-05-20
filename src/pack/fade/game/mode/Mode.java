package pack.fade.game.mode;

public class Mode {
    private int modeSelected;

    public Mode(){
        int modeSelected = getModeSelected();
            whichModeSelected(modeSelected);

    }
    public void whichModeSelected(int modeSelected){
        this.modeSelected = modeSelected;
        switch (modeSelected){
            case 2:
                System.out.println("Hard Mode");
            case 1:
                System.out.println("Medium Mode");
            default:
                System.out.println("Easy Mode");
        }
        return;

    }

    public int getModeSelected() {
        return modeSelected;
    }

    public void setModeSelected(int modeSelected) {
        this.modeSelected = modeSelected;
    }
}
