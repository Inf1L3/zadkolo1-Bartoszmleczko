/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolok1.zad4;
import java.util.*;
/**
 *
 * @author student
 */
public class Osoba {
    private String imie;
    private String nazwisko;
    private int wiek;
    private int waga;
    private int wzrost;
    Scanner sc = new Scanner(System.in);
    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Osoba(int wiek, int waga, int wzrost) {
        this.wiek = wiek;
        this.waga = waga;
        this.wzrost = wzrost;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public int getWaga() {
        return waga;
    }

    public int getWzrost() {
        return wzrost;
    }

    public void setData() {
        imie=sc.nextLine();
        nazwisko =sc.nextLine();
         wiek = sc.nextInt();
         waga = sc.nextInt();
         wzrost = sc.nextInt();
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.waga = waga;
        this.wzrost = wzrost;
    }

    @Override
    public String toString() {
        return "Osoba{" + "imie=" + imie + ", nazwisko=" + nazwisko + ", wiek=" + wiek + ", waga=" + waga + ", wzrost=" + wzrost + '}';
    }
    
    
}
