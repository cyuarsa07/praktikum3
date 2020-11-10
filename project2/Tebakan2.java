/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.util.Scanner;

/**
 *
 * @author Chiesa
 */
public class Tebakan2 {
    int tebak;
    int jawab;
    int score;
    
    void input(){
        tebak = (int) (Math.random() * 101 ); //acak angka dari 0-100
        score = 100;
        Scanner input = new Scanner(System.in);
        System.out.println("Hai... Nama saya Mr. Lappie, saya telah memiliki sebuah bilangan bulat secara acak antara 0s/d 100.");
        System.out.println("Silakan tebak ya!!!");
        while(tebak != jawab){
            System.out.print("Tebakan Anda : ");
            jawab = input.nextInt();
            if (jawab < tebak) {
                score -= 2;
                System.out.println("Hehehee... Tebakan anda terlalu kecil");
            }
            else if (jawab > tebak){
                score -= 2;
                System.out.println("Hehehee... Tebakan anda terlalu besar");
            }
            else {
                score += 2;
                System.out.println("Yeeee... Bilangan tebakan anda BENAR");
            }
            if (score == 0){
                break;
            }
        }
    }
    
    void output(){
        System.out.println("--------------------------------------------------------");
        System.out.println("Score       : " + score);
        if (jawab == tebak && score >= 92){
            score += 50;
            System.out.println("Bonus       : 50");
            System.out.println("Total Score : " + score);
        }
        else {
            System.out.println("Total Score : " + score);
        }
    }
}
