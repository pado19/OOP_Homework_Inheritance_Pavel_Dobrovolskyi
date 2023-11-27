package Inheritance;

public class Animals {

    public static int count;

    public Animals(){
        count++;
    }

    private int runDistance;
    private int swimDistance;

    public int getRunDistance() {
        return runDistance;
    }

    public void setRunDistance(int runDistance) {
        this.runDistance = runDistance;
    }

    public int getSwimDistance() {
        return swimDistance;
    }

    public void setSwimDistance(int swimDistance) {
        this.swimDistance = swimDistance;
    }
}
