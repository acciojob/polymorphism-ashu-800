package com.driver;

public class Main {
    static class Product{
        public int product(int x, int y){
            return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
        }
    }
    public static void main(String[] args){
          Product p = new Product();
          int x=5;
          int y=6;
          int z=8;
          double a=5.0;
          double b=4.0;
          p.product(x,y);
          p.product(x,y,z);
          p.product(a,b);
    }
}