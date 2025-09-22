/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("nhap chieu dai : ");
        double chieudai = scanner.nextDouble();
        System.out.println("nhap chieu rong : ");
        double chieurong = scanner.nextDouble();
        System.out.printf("chu vi: %f\n ",(chieudai+chieurong)*2);
        System.out.printf("dien tich la : %f\n ",chieudai*chieurong);
        System.out.printf("canh nho nhat la : %f \n",Math.min(chieudai,chieurong));
        
    }
    
}
