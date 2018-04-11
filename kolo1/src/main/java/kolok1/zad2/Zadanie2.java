/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolok1.zad2;

/**
 *
 * @author student
 */
public class Zadanie2 {

    int n;

    public Zadanie2(int n) {
        this.n = n;
    }

    public int Fibb(int n) {
        if (n < 3) {
            return 1;
        }
        return Fibb(n - 2) + Fibb(n - 1);
    }
}
