// Underneath is the description of the practice problem in Bosnian
/*
Potrebno je napraviti program u Javi, koji ce obracunati cijenu paketa,
na nacin da je potrebno zadati osnovnu vrijednost u konvertibilnim
markama, te masu paketa, a kao rezultat program bi nam ispisao ukupan
iznos koji kupac placa, sa navedenim pojedinacnim stavkama. Pojedinacne
stavke su: osnovna vrijednost, iznos PDV-a koji je 17%, te cijena dostave,
ako je paket manje mase od 10kg, dostava iznosi 8KM, a ako je veci do 10kg,
dostava je 10KM. Primjer, paket je vrijednosti 100KM, mase 7kg. Program nam
treba dati rezultat, ukupan iznos koji kupac placa je 125KM, od cega je 100KM
osnovna vrijednost, PDV je iznosa 17KM, a dostava je 8KM jer je paket manje
mase od 10kg. Napraviti metodu koja prihvata dva parametra, v i m.
 */

public class CijenaPaketa {
    public static void main(String[] args) {
        izracunajCijenu(100, 7);
    }

    private static void izracunajCijenu(double v, double m) {
        double pdv = Math.round(17 / v * 10000) / 100.00;
        int masaNaplata = (m < 10)? 8 : 10;
        double result = v + pdv + masaNaplata;

        System.out.println("Ukupan iznos koji kupac placa je " + result + "KM");
        System.out.println("Od cega je " + v + "KM osnovna vrijednost");
        System.out.println("PDV je iznosa " + pdv + "KM");
        System.out.print("Dostava je " + masaNaplata + "KM jer je paket");
        if(masaNaplata == 8) {
            System.out.println("manje mase od 10kg");
        } else {
            System.out.println("vece mase od 10kg");
        }
    }
}
