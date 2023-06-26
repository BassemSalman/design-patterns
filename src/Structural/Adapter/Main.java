package Structural.Adapter;


public class Main {
    public static void main(String[] args) {
        RoundHole rh = new RoundHole(5);

        RoundPeg rp = new RoundPeg(4);
        RoundPeg rp2 = new RoundPeg(19);

        System.out.println(rh.fits(rp));
        System.out.println(rh.fits(rp2));


        SquarePeg sp = new SquarePeg(4);
        SquarePeg sp2 = new SquarePeg(9);

        Adapter a = new Adapter(sp);
        System.out.println(rh.fits(a));

        System.out.println(rh.fits(rp2));
    }
 }
