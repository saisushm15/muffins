/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muffuins;

import java.util.Scanner;

/**
 *
 * @author konda babu
 */
public class Muffuins {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int t=input.nextInt();
        while(t>0)
        {
            int n=input.nextInt();
            if(n%2==0)
            {
                System.out.println((n+2)/2);
            }
            else
            {
                System.out.println((n+1)/2);
            }
        }
        t--;
    }
    
}
