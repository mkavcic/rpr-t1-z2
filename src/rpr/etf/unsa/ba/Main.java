package rpr.etf.unsa.ba;

import java.util.Scanner;

public class Main {

    public static int sumaCifara(int n){
        int suma=0;
        do{
            suma=suma+n%10;
            n=n/10;
        } while(n!=0);
        return suma;
    }

    public static void main(String[] args) {
        Scanner ulaz= new Scanner(System.in);
        System.out.println("Unesite broj: ");
        int n = ulaz.nextInt();
        for(int i = 1; i<=n; i++){
            if(i%sumaCifara(i)==0) System.out.print(i+" ");
        }
    }

}

