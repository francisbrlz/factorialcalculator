/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.facto;

/**
 *
 * @author Student
 */
public class calculatefacto {

     private int n;

    public calculatefacto(int n) {
        this.n = n;
    }

    public long calculation() {
        if (n == 0) {
            return 1;
        }

        long facto = 1;
        for (int i = 1; i <= n; i++) {
            facto *= i;
        }
        return facto;
    }

    public void displayResult() {
        System.out.println("The factorial of: " + n + "\n is: " + calculation());
    }


    
}
