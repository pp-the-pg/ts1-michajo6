package cz.cvut.fel.ts1;

public class Main {
    public static int factorial(int x){if(x>=1)return(x*factorial(x-1));else return 1;}

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}