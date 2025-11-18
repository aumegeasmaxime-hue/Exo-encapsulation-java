import exo2.ReportCard;
import exo2.TableauDeNote;

public class Main {
    public static void main(String[] args){
        //Tableau tab = new Tableau();
        //tab.creatTab();

        TableauDeNote noteE1 = new TableauDeNote();
        ReportCard eleve1 = new ReportCard("Bob","Lamotte",3,noteE1.elev1);
        ReportCard eleve2 = new ReportCard("Francis","Lamotte",3,noteE1.elev2);
        ReportCard eleve3 = new ReportCard("Mirette","Lamotte",3,noteE1.elev3);
        eleve1.printBulletin();
        eleve2.printBulletin();
        eleve3.printBulletin();
    }
}
