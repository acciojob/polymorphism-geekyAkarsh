package com.driver;

public class Main {
    static class Product{

        public int product(int x,int y){
            return x+y;
        }

        // @Overload
        public int product(int x,int y,int z){
            return x+y+z;
        }

        // @Overload
        public double product(double x, double y){
            return x+y;
        }

    }

    public static void main(String[] args) {

        Product p = new Product();
        System.out.println(p.product(10,20));
        System.out.println(p.product(10,20,30));
        System.out.println(p.product(1.5,2.5));
    }

}