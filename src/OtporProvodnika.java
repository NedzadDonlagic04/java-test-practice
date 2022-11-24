// Underneath is the description of the practice problem in Bosnian
/*
Napisati program u Javi koji ce racunati elektricni otpor provodnika, ako je poznata
povrsina poprecnog presjeka, duzina provodnika te vrsta materijala u vidu specificnog
otpora. Neka je materijal bakar, a povrsina poprecnog presjeka 0.75mm^2. Kreirati
metodu sa jednim parametrom l, te zatim pronaci otpore zice cija je duzina 500m,
1500m, 2000m, 2500m i 3000m. Specificni otpor bakra je 0.0172 Ohm * mm^2 / m.

                            R = p * l / s
 */

public class OtporProvodnika {
    public static void main(String[] args) {
        int[] lenghts = {500, 1500, 2000, 2500, 3000};

        for(int length : lenghts) {
            System.out.println(izracunajOtpor(length));
        }
    }

    private static String izracunajOtpor(int l) {
        double result = Math.round(0.0172 * l / 0.75 * 100) / 100.00;

        return "Elektricni otpor provodnika, koji je napravljen od bakra, za duzinu " + l + "m je " + result + " Ω";
    }
}
