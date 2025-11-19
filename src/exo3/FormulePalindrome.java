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
}
