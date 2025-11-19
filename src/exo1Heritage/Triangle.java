package exo1Heritage;

public class Triangle extends Height {
    public void triangle(){
        for (int j = 0; j <= height; j++) {

            for (int a = 0; a < height - j; a++) {
                System.out.print(" ");
            }
            for (int i = 0; i <= j; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
