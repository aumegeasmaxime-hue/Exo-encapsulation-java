import exo2.ReportCard;
import exo2.TableauDeNote;
import exo3.FormulePalindrome;

public class Main {
    public static void main(String[] args){
        //Tableau tab = new Tableau();
        //tab.creatTab();
/*      //  Exo2
        TableauDeNote noteE1 = new TableauDeNote();
        ReportCard eleve1 = new ReportCard("Bob","Lamotte",3,noteE1.elev1);
        ReportCard eleve2 = new ReportCard("Francis","Lamotte",3,noteE1.elev2);
        ReportCard eleve3 = new ReportCard("Mirette","Lamotte",3,noteE1.elev3);
        eleve1.printBulletin();
        eleve2.printBulletin();
        eleve3.printBulletin();
  */

        FormulePalindrome pal1 = new FormulePalindrome("123");
        FormulePalindrome pal2 = new FormulePalindrome("121");
        FormulePalindrome pal3 = new FormulePalindrome("abba");
        FormulePalindrome pal4 = new FormulePalindrome("1231421");
        FormulePalindrome pal5 = new FormulePalindrome("12AA21");

        pal1.formulePalindrome();
        pal2.formulePalindrome();
        pal3.formulePalindrome();
        pal4.formulePalindrome();
        pal5.formulePalindrome();

        System.out.println(pal1.isPalindrome(123));



    }

}