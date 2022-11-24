// Underneath is the description of the practice problem in Bosnian
/*
Napraviti program u Javi koji ce za unesenu nominalnu vrijednost
elektricnog otpora i toleranciju, ispisati raspon vrijednosti koje
realni otpornik moze imati. Na primjer, za otpornik od 100Ω i
toleranciju ±5% raspon vrijednosti je od 95Ω do 105Ω. Kreirati metodu
koja ima dva parametra, v i t. Prikazati navedene raspone za otpornike.
Nadalje, izracunati koje granice moze imati struja, uzevsi u obzir da
se takav otpor spaja na napon 24V. Neka klasa Struja nasljeduje klasu
Otpor.
 */

class Otpor {
    double otpor1 = 0;
    double otpor2 = 0;

    public String rasponOtpora(double v, double t) {
        double goreDole = twoDecimalRound(v * t / 100);

        this.otpor1 = v - goreDole;
        this.otpor2 = v + goreDole;

        return "Za otpornik od " + v + "Ω i tolerancije ±" + t + "% raspon vrijednosti je od " + this.otpor1 + "Ω do " + this.otpor2 + "Ω";
    }

    protected double twoDecimalRound(double value) {
        return Math.round(value * 100) / 100.00;
    }
}

class Struja extends Otpor {
    double napon = 24;
    public String rasponStruje() {
        double struja1 = super.twoDecimalRound(this.napon / super.otpor1);
        double struja2 = super.twoDecimalRound(this.napon / super.otpor2);

        return "Granice struje za otpornik ciji je raspon od " + this.otpor1 + "Ω do " + this.otpor2 + "Ω je od " + struja1 + "A do " + struja2 + "A";
    }
}

public class Otpornik {
    public static void main(String[] args) {
        Otpor otpor = new Otpor();
        System.out.println(otpor.rasponOtpora(100, 5));

        Struja struja = new Struja();
        System.out.println(struja.rasponOtpora(100, 5));
        System.out.println(struja.rasponStruje());
    }
}
