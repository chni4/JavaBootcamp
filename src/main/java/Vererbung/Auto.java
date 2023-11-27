package Vererbung;

public class Auto extends Fahrzeuge {
    private int Türen;
    private int PS;
    public static void Fahrzeugausgabe(String Hersteller, String Modell, int Baujahr, int Türen, int PS) {


        System.out.println("Hersetller " + Hersteller + " Modell " + Modell + " Baujahr " + Baujahr + " Türenanzahl: " + Türen + " PS anzahl: " + PS);


    }

    public int getPS() {
        return this.PS;
    }

    public int getTüren() {
        return this.Türen;

    }

    public void setPS(int PS) {
        this.PS = PS;
    }

    public void setTüren(int türen) {
        Türen = türen;
    }
}
