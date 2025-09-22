/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Ho va ten : ");
        String Hoten = scanner.nextLine();
        System.out.println("Diem TB : ");
        double diemTB = scanner.nextDouble();
        System.out.printf("%s %f Diem",Hoten,diemTB);
       
        
        
        
     }
}