// Underneath is the description of the practice problem in Bosnian
/*
Potrebno je napisati program u Javi, koji ce imati naziv TrenutnaVrijednost,
a sluzice da se izracunaju trenutne vrijednosti napona gradske mreze opisanog
izrazom u = 311 * sin314 * t V za trenutke: t=0s, t=0.0025s, t=0.005s, t=0.0075s,
t=0.01s

Kreirati metodu koja koristi jedan parametar, t. U konzoli neka se ispise rezultat
koja je vrijednost napona za svaki navedeni trenutak. Na primjer: "Za trenutak t=0s,
trenutna vrijednost napona je u=0V"
 */

public class TrenutnaVrijednost {
    public static void main(String[] args) {
        double[] ts = {0, 0.0025, 0.005, 0.0075, 0.01};

        for(double t : ts) {
            System.out.println(izracunajNaponString(t));
        }
    }

    private static String izracunajNaponString(double t) {
        return "Za trenutak t=" + t + "s, trenutna vrijednost napona je u=" + izracunajNapon(t) + "V";
    }

    private static double izracunajNapon(double t) {
        return Math.round(311 * Math.sin(314 *  t));
    }
}