package exo2;

import java.util.Arrays;

public class ReportCard {
    public String lastname;
    public String name;
    public int classroom;
    public String[][] bulletinTab;

    public ReportCard (String lastname,String name,int classroom,String[][] bulletinTab){
        this.lastname = lastname;
        this.name = name;
        this.classroom = classroom;
        this.bulletinTab = bulletinTab;
    }
    public void printBulletin () {

        System.out.println();
        System.out.println("éleve: " + lastname + " " + name + "  Classe: " + classroom);

        for (int i=0;i< bulletinTab.length;i++){
            for (int z=0;z< bulletinTab.length;z++)
            System.out.print(bulletinTab[z][i] + "   ");
            System.out.println();
        }
    }






















}
