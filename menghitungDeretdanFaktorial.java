/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPersonal2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class menghitungDeretdanFaktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char opsi;
        
        System.out.println("Belajar Deret Aritmatika, Geometri dan menghitung Faktorial");
        
        do{
            int banyak_deret;
            do{
                System.out.print("Masukkan banyak angka yang mau dicetak [2..10] : ");
                banyak_deret = input.nextInt();
            } while(banyak_deret < 2 || banyak_deret > 10);
            
            int beda;
            do{
                System.out.print("Masukkan beda masing-masing angka [2..9] : ");
                beda = input.nextInt();
            } while(beda < 2 || beda > 9);
            
            System.out.println("Deret Aritmatika :");
            for(int i = 1; i <= banyak_deret; i++){
                int bil = 1 + (i - 1) * beda;
                System.out.print(bil + " ");
            }
            System.out.println();
            
            System.out.println("Deret Geometri :");
            for(int i = 1; i <= banyak_deret; i++){
                int bil = (int) Math.pow(beda, i - 1);
                System.out.print(bil + " ");
            }
            System.out.println();
            
            int faktorial = 1;
            System.out.print("Faktorial dari " + banyak_deret + " = ");
            System.out.println();
            
            for(int i = banyak_deret; i >= 1; i--){
                System.out.print(i);
                if(i > 1){
                    System.out.print(" * ");
                }
                faktorial *= i;
            }
            
            System.out.println(" = " + faktorial);
            
            System.out.print("Anda mau ulang [y/t] : ");
            opsi = input.next().charAt(0);
        } while(opsi == 'Y' || opsi == 'y');
    }
}
