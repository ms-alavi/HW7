package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i,j,r;
        System.out.print("Input number of rows (half of the diamond) : ");
        Scanner in = new Scanner(System.in);
        r = in.nextInt();

        for(i=0;i<=r;i++)
        {
            for(j=1;j<=r-i;j++)
                System.out.print(" ");
            for(j=1;j<=2*i+1;j++)
                System.out.print("*");
            System.out.print("\n");
        }

        for(i=r-1;i>=0;i--)
        {
            for(j=1;j<=r-i;j++)
                System.out.print(" ");
            for(j=1;j<=2*i+1;j++)
                System.out.print("*");
            System.out.println();
        }
    }
    private static int[] numberOfRawStars(int n){
        int[] stars=new int[n] ;
        for (int i = 0,j=1; i <n ; i++,j+=2) {
            stars[0]=j;
        }
        return stars;
    }
    private static int sideForOddNumber(int n){
      int[] stars = numberOfRawStars(n);
      int rawOfSide=((n+1)/2-1);
      return stars[rawOfSide];
    }
private  int[][] diamondMatrix(int n) {
    int[][] diamond = new int[n][n];
    int cnt = 0;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (cnt <= n) {
                diamond[i][j] = 1;
            }
        }
    }
    return null;
}


}
