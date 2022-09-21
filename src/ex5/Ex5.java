/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

import java.util.Scanner;

/**
 *
 * @author Tinip
 */
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ScoreSource source = new ScoreSource();
        Subscriber lis1 = new Subscriber();
        Subscriber lis2 = new Subscriber();
        source.addScoreListener(lis1);
        source.addScoreListener(lis2);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Score:");
        String score = input.nextLine();
        while(!score.equals("")){
            source.setScoreLine(score);
            System.out.print("Enter Score:");
            score = input.nextLine();
        }
    }
    
}
