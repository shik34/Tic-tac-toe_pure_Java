package com.company2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static char [] positions={'.','.','.','.','.','.','.','.','.'};//пустое поле
    int heuristics(int [] pos){
        //пока эвристика случайная
        Random rnd = new Random(System.currentTimeMillis());
        int y=rnd.nextInt(10);
        return y;
    };
    static void outputDesk(){
        System.out.println("вот состояние поля");
        int ij=0;
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(positions[ij]+" ");ij++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //while (true)
        {
            outputDesk();

            System.out.println("Дедайте ход: введите номер строки и номер столбца через пробел");
            int x=sc.nextInt(),y= sc.nextInt();
            positions[3*x+y]='x';

            outputDesk();
        }
    }
}
