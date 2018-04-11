/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolok1.zad3;
import java.util.*;
/**
 *
 * @author student
 */
public class Zadanie3 {
   private int[] tab = new int[10];
 Scanner sc = new Scanner(System.in);
    public Zadanie3() {
    }

public void wprowadzLiczbe(){
    int k;
    for(int i=0;i<10;i++)
    {
        k=sc.nextInt();
        tab[i]=k;
    }
}
public void pokazTablice(){
    for(int i=0;i<10;i++){
        System.out.println(tab[i]);
    }
}
public void srednia(){
    int s=0;
    for(int i=0;i<10;i++)
    {
        s+=tab[i];
    }
    System.out.println(s);
}
    
   
}
