/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("nhap aa :");
        double a = scanner.nextDouble();
        System.out.println("nhap b :");
        double b = scanner.nextDouble();
        System.out.println("nhap c :");
        double c = scanner.nextDouble();
        double delta = Math.pow(b,2)-4*a*c;
        System.out.println("Delta la :"+delta);
        System.out.println("can delta la : "+ Math.sqrt(delta));
    }
    
           
}
