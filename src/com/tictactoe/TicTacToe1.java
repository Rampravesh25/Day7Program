package com.tictactoe;

public class TicTacToe1 {

    public static void main(String[] args) {
        System.out.println("Welcome to this  program :-");

        char[] ch = new char[10];
        TicTacToe1 tic1 = new TicTacToe1();
        tic1.uc1(ch);
    }

    void uc1(char[] ch) {
        for (int i = 1; i <= 9; i++) {
            ch[i] = ' ';
        }

    }
}
