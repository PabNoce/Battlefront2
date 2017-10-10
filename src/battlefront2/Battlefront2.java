/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battlefront2;

import java.util.Scanner;

/**
 *
 * @author pnocedalopez
 */
public class Battlefront2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char pay, play, dlc;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Play? y/n");
            play = scan.next().charAt(0);
            if (play == 'y') {
                System.out.println("Buy DLC? y/n");
                dlc = scan.next().charAt(0);
                if(dlc=='y'){
                    dlc='!';
                }else{
                    dlc=' ';
                }
                System.out.println("Pay? y/n");
                pay = scan.next().charAt(0);
                if (pay == 'y') {
                    System.out.println("You win"+dlc);
                } else {
                    System.out.println("You lose"+dlc);
                }
            }
        } while (play == 'y');
        System.out.println("Game Over");
    }

}
