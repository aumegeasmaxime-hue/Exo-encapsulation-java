import java.util.Arrays;


public class Tableau {
    public char[] array = new char[26];
    public int a = 0;

    public void creatTab (){
        for (char i = 'a' ; i <= 'z' ; i++){
            array[a] = i;
            a++;
        }
        System.out.println(Arrays.toString(array)); // methode pour sout un tableau sans boucle for
    }
}
