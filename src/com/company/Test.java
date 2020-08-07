package com.company;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[][] diamond = diamondWithAHollowSquare(n);
   /*     for (int[]  raw:diamond
             ) {
            for (int column:raw
                 ) {
                System.out.print(column);
            }
            System.out.println();
        }*/
        
    }

    private static int[][] diamond(int n) {

        int[][] diamond=new int[2*n+1][2*n+1];
        int starOfRaw=1;
        int index=0;
        for (int i = 0; i <n+1 ; i++) {
            index++;
            int cnt=0;
            for (int j = 0; j <starOfRaw; j++) {

                diamond[i][j]=1;
            }
            starOfRaw+=2;

        }
        starOfRaw-=2;
        for (int i = index; i <2*n+1 ; i++) {
            starOfRaw-=2;
            for (int j = 0; j <starOfRaw; j++) {
                diamond[i][j]=1;
            }

        }
        return diamond;
    }

private static int[][] diamondWithAHollowSquare(int n){
        int[][] dia=diamond( n);
    int starOfRaw=1;
    int index=0;
    for (int i = 0; i <n+1 ; i++) {
        index++;
        int cnt=0;
        for (int j = 0; j <starOfRaw; j++) {
                if (i>=((n+1)/2)){

                    int numberOfVisibleStars=(numberOfStars(n,i)-n)/2;
                    if((j<numberOfVisibleStars||j>=n+numberOfVisibleStars))dia[i][j]=1;
                    else{
                        dia[i][j]=0;
                        cnt++;
                    }


                }
                else
            dia[i][j]=1;
            System.out.print(dia[i][j]);
        }
        starOfRaw+=2;
        System.out.println();
    }
    starOfRaw-=2;
    int x=(2*n)-(n+1/2);
    for (int i = index; i <2*n+1 ; i++) {
        starOfRaw-=2;
        for (int j = 0; j <starOfRaw; j++) {
            if (i<=x){

                int numberOfVisibleStars=(numberOfStars(n,i)-n)/2;
                if((j<numberOfVisibleStars||j>=n+numberOfVisibleStars))dia[i][j]=1;
                else{
                    dia[i][j]=0;
                }
            }
            else
            dia[i][j]=1;
            System.out.print(dia[i][j]);
        }
        System.out.println();
    }
    return dia;
}


    private static int numberOfStars(int n,int i){
        int[][] diamond=diamond(n);
        int cnt =0;

            for (int k = 0; k <2*n+1 ; k++) {
                if (diamond[i][k]==1)cnt++;
            }
        return cnt;

    }
}
