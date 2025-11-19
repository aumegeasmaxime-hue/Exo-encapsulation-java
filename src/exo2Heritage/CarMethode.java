package exo2Heritage;

public class CarMethode extends GeneralCar{
        public void weightHp(){
            double report = weight / hp;
            System.out.println("le rapport poid / puissance est de: " + report + " kilos par cheval");
        }
        public void clutter (){
            double clutter = width * length;
            System.out.println("l'encombrement de la voiture est de: " + clutter + " m²");
        }





}
