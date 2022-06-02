package com.tictactoe;

import java.util.Scanner;

public class TicTacToe2 {

    public static void main(String[] args) {
        System.out.println("Welcome to this program");

        char[] ch = new char[10];
        TicTacToe2 t1 = new TicTacToe2();
        t1.uc1(ch);

        char choice = t1.uc2();
        char choices1, choices2;

        if (choice == 'X') {
            System.out.println("Player chooses X and computer O");
            choices1 = choice;
            choices2 = 'O';
        } else {
            System.out.println("Player chooses O and computer chooses X");
            choices1 = choice;
            choices2 = 'X';
        }

    }

    void uc1(char[] ch) {
        for (int i = 1; i < 10; i++) {
            ch[i] = ' ';
        }
    }

    char uc2() {
        System.out.print("Enter X or O : ");
        Scanner sc = new Scanner(System.in);
        return sc.next().charAt(0);
    }

}
