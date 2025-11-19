package Exo1Heritage;

public class Carre extends Height {

    public void carre (){

        for (int j = 1; j <= height; j++) {
            for (int i = 0; i <= height; i++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

}
