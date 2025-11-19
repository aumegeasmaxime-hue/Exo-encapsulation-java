import exo1Heritage.Carre;
import exo1Heritage.Triangle;
import exo2Heritage.Break;
import exo2Heritage.Chopped;
import exo3Heritage.User;

public class Main {
    public static void main(String[] args){
/*
        Tableau.Tableau tab = new Tableau.Tableau();
        tab.creatTab();

 */
/*
    //  Exo 2
        TableauDeNote noteE1 = new TableauDeNote();
        ReportCard eleve1 = new ReportCard("Bob","Lamotte",3,noteE1.elev1);
        ReportCard eleve2 = new ReportCard("Francis","Lamotte",3,noteE1.elev2);
        ReportCard eleve3 = new ReportCard("Mirette","Lamotte",3,noteE1.elev3);
        eleve1.printBulletin();
        eleve2.printBulletin();
        eleve3.printBulletin();
  */
/*
    // Exo 3
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
*/
/*
        // heritage Simple
        B b = new B();// la class B herite speed de la class A
        b.bike();

        //heritage Multi niveau
        Child child = new Child();
        child.play();
        child.work(); // heritage simple de Father
        child.love(); // heritage multi niveau de GrandFather
*/
 /*
        // heritage hiérarchique Child1 n'hérite pas de Child2 mais les 2 hérite de Parent
        Child1 child1 = new Child1();
        Child2 child2 = new Child2();

        child1.property();
        child1.child1property();

        child2.property();
        child2.child2property();
*/
/*
        // heritage multiple grace aux interfaces
        Person person = new Person();
        person.coding();
        person.dancing();

 */
  /*
        //heritage hybride d'une class et d'interface

        Individuel individuel = new Individuel();
        individuel.humain();
        individuel.drive();
        individuel.slip();

   */

        //Exo 1 heritage
        Carre c1 = new Carre();
        c1.carre();
        Triangle t1 = new Triangle();
        t1.triangle();


        //Exo 2 heritage
        Chopped chopped1 = new Chopped(1550,250,2.3,5);
        chopped1.weightHp();
        chopped1.clutter();

        Break break1 = new Break(3000 ,200,2.5,5.5);
        break1.weightHp();
        break1.clutter();

        //Exo 3 heritage
        User user1 = new User("Mirette","Latrine",100.20,50.10,120.30);
        user1.credit();
        user1.debits();

        User user2 = new User("Bob","lamotte",100.10,0.50,70.00);
        user2.credit();
        user2.debits();



    }
}



