package com.driver;

import java.util.Scanner;

public class Main {
    public static class Product{

        public int product(int x,int y){
            return x*y;
        }

        // @Overload
        public int product(int x,int y,int z){
            return x*y*z;
        }

        // @Overload
        public double product(double x, double y){
            return x*y;
        }

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        int z = scn.nextInt();
        double a  = scn.nextDouble();
        double b = scn.nextDouble();
        Product p = new Product();
        p.product(x,y);
        p.product(x,y,z);
        p.product(a,b);
    }

}