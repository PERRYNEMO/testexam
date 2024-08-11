package be.perrynemo;

public class Enfant extends Maman {
    public int x = 5;

    @Override
    public void setX(int x) {
        this.x = x+1;
    }
}
