package exo3Heritage;

public class Method extends Bank implements Credit,Debits{

    @Override
    public void credit() {
        double newSold = 0;
        newSold = initialSold + credit;
        initialSold = newSold;
        System.out.println("le solde initial est de: " + initialSold + " le nouveau solde est de: " + newSold);
    }

    @Override
    public void debits() {
        double newSold = 0;
        newSold = initialSold - debit;
        initialSold = newSold;
        System.out.println("le solde initial est de: " + initialSold + " le nouveau solde est de: " + newSold);
    }


}
