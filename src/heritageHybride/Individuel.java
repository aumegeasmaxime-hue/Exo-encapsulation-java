package heritageHybride;

public class Individuel extends Humain implements Drive,Slip  {
    @Override
    public void drive() {
        System.out.println("Drive");
    }

    @Override
    public void slip() {
        System.out.println("Slip");
    }
}
