/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;
import java.util.Scanner;

/**
 *
 * @author Chiesa
 */
public class Tebakan1 {
   int tebak;
    int jawab;
    void input(){
        tebak = (int) (Math.random() * 101 );
        Scanner input = new Scanner(System.in);
        System.out.println("Hai... Nama saya Mr. Lappie, saya telah memiliki sebuah bilangan bulat secara acak antara 0s/d 100.");
        System.out.println("Silakan tebak ya!!!");
        while(tebak != jawab){
            System.out.print("Tebakan Anda : ");
            jawab = input.nextInt();
            if (jawab < tebak) {
                System.out.println("Hehehee... Tebakan anda terlalu kecil");
            }
            else if (jawab > tebak){
                System.out.println("Hehehee... Tebakan anda terlalu besar");
            }
            else {
                System.out.println("Yeeee... Bilangan tebakan anda BENAR");
            }
        }
        
    }
    
}
