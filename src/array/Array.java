package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Array {

    public static void main () {
        // array declaration
        int[] numbers = new int[5];
        // array 2 lignes
        int[][] num = new int[1][2];
        // array 3 lignes
        int[][][] num1 = new int[1][2][3];

        // array avec objet
        String[] names = new String[3];
        String[] name = {"Bob", "Maurice"};

        // ajouter un element au tableau
        int[] number = new int[5];
        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        number[3] = 40;
        number[4] = 50;

        int[] newNumber = Arrays.copyOf(number,10);
        newNumber[newNumber.length-1] = 60;

        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.toString(newNumber));

        // convertion une list en tableau
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        // arraylist converti en objet[] array
        Object[] objarr = list.toArray();

        System.out.println(Arrays.toString(objarr));

        for (Object obj : objarr){
            // utiliser un cast pour effectuer une addition
            System.out.println((Integer)obj+1);
        }
        int randomValue = list.get(new Random().nextInt(list.size()));
    }
}
