// Underneath is the description of the practice problem in Bosnian
/*
Napisati program u Javi koji ce za uneseni ugao u stepenima definisati
koji je ugao u radijanima. Neka se to odjednom napravi za uglove 15°,
30°, 45°, 60°, 90°. Kreirati metodu sa jednim parametrom r. Izraz koji
povezuje stepene i radijane je:
                        2pi * radijana = 360°

                        Prevodenje formule:
                        2pi * radijana = 360° / : 2pi
                        radijana = 360° / 2pi
                        radijana = 180° / pi
                        radijana = pi / 180°
 */
public class StepenURad {
    public static void main(String[] args) {
        int[] stepeni = {15, 30, 45, 60, 90};

        for(int stepen: stepeni) {
            System.out.println(pretvoriURadijane(stepen));
        }
    }

    private static String pretvoriURadijane(int r) {
        double result = Math.round((r / 180.00) * 100) / 100.00;

        return r + "° u radijanima je " + result + "pi";
    }
}
