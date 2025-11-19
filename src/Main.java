import HeritageMultiple.Person;
import heritageHybride.Individuel;
import hierarchicalInheritance.Child1;
import hierarchicalInheritance.Child2;
import inheritanceMultiNiveau.Child;
import inheritanceSinple.B;

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
/*
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
        //heritage hybride d'une class et d'interface

        Individuel individuel = new Individuel();
        individuel.humain();
        individuel.drive();
        individuel.slip();

    }

}



