package exo3;

import java.util.Arrays;

public class FormulePalindrome {

    String a;
    public FormulePalindrome (String a){
        this.a = a;
    }
    public void formulePalindrome(){
        char[] tab = a.toCharArray();
        int count = 0;
        for(char i = 0 ; i < tab.length/2 ;i++ ){
            if (tab[i] == tab[tab.length-1-i]){
                count++;
            }
        }
        if (count == tab.length/2){
            System.out.println("c'est un palindrome");
        }
        else {
            System.out.println("ce n'est pas un palindrome");
        }
    }
    // methode 2

    public boolean isPalindrome(int number){

        int originalNumber = number;
        int reverseNumber = 0;

        while (number != 0){
            int lastdigit = number % 10;
            reverseNumber = reverseNumber * 10 + lastdigit;
            number /= 10;
        }
        return originalNumber == reverseNumber;
    }
}
