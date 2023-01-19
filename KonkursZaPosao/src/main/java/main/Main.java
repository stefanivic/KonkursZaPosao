package main;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Kandidat> kandidati = new ArrayList<Kandidat>();

        String prekid = "";
        while(!prekid.equals("Prekid")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Uneti ime, prezime i godine kandidata: ");
            String unetoIme = scanner.next();
            String unetoPrezime = scanner.next();
            int uneteGodine = scanner.nextInt();

            System.out.println("Uneti podaci o kandidatu su: " + unetoIme + " " + unetoPrezime + " " + uneteGodine);
            System.out.println("Ukoliko zelite da unesete novog kandidata upisite 'Unesi', a ukoliko zelite da prekinete sa unosom, napisite 'Prekid'.");


            Kandidat dodavanjeKandidata = new Kandidat(unetoIme, unetoPrezime, uneteGodine);
            Kandidat unosKandidata = dodavanjeKandidata;




//            for (int i = 0; i < kandidati.size(); i++) {
//                if (kandidati.equals(kandidati.get(i))) {
//                    System.out.println("Ovaj kandidat vec postoji u bazi podataka!");
//                } else {
//                    kandidati.add(unosKandidata);
//                }
//            }

            String noviPrekid = scanner.next();
            prekid = noviPrekid;

        }

        System.out.println("Ispis unetih kandidata: ");
        for (int i = 0; i < kandidati.size(); i++) {
            System.out.println("Podaci o kandidatu: " + kandidati.get(i));
        }
    }
}
