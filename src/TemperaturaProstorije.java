// Underneath is the description of the practice problem in Bosnian
/*
Napraviti program u Javi koji ce komentarisati temperaturu prostorije
na sljedeci nacin. Ako unesemo temperaturu od 20 do 24 °C u konzoli
ce biti poruka "Temperatura je idealna". Ako unesemo temperaturu manju
od 19 °C ispisace nam poruku "Potrebno je ukljuciti grijanje", a ukoliko
unesemo temperaturu vecu od 24 °C ispisace nam poruku "Pretoplo je u
prostoriji".
 */

import java.util.Scanner;

public class TemperaturaProstorije {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesi temperaturu prostorije: ");
        double temp = scanner.nextDouble();
        System.out.println(provjeraTemperature(temp));

        scanner.close();
    }

    private static String provjeraTemperature(double temp) {
        if(temp >= 20 && temp <= 24)  return "Temperatura je idealna";
        else if (temp < 20) return "Potrebno je ukljuciti grijanje";
        return "Pretoplo je u prostoriji";
    }
}
