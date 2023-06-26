package Structural.Adapter;

public class Adapter extends RoundPeg{
    private SquarePeg squarePeg;

    public Adapter(SquarePeg squarePeg) {
        super(0);
        this.squarePeg = squarePeg;
    }

    public double getRadius() { // notice were getting radius of squarepeg
        return squarePeg.getSide() * Math.sqrt(2) / 2;
    }
}
