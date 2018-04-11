package pl.edu.ur.kolo1;
import kolok1.zad1.Zadanie1;
import kolok1.zad2.Zadanie2;
import kolok1.zad3.Zadanie3;
import kolok1.zad4.Osoba;
import java.util.*;
/**
 *
 * @author mchyla
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO Uruchomienie zadań/stworzenie i działanie na obiektach
     Scanner sc = new Scanner(System.in);
     int n;
     Zadanie1 obiekt = new Zadanie1();
     obiekt.Zadanie1();
     n = sc.nextInt();
     Zadanie2 ciag = new Zadanie2(n);
        System.out.println(ciag.Fibb(n));
     Zadanie3 tablica = new Zadanie3();
     tablica.wprowadzLiczbe();
     tablica.pokazTablice();
     tablica.srednia();
     Osoba osoba = new Osoba("Bartosz","Mleczko");
     osoba.setData();
        System.out.println(osoba.toString());
    }
    
}
