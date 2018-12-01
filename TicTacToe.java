/**
 * Java. Level 1* Lesson 4. Homework 4.
 *
 * @author Petrov Nikolay
 * @version dated Dec 1, 2018
 */

import java.awt.*;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    final int SIZE=3;
    final char DOT_X='x';
    final char DOT_O='o';
    final char DOT_EMPTY='.';
    char[][] map = new char[SIZE][SIZE];
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    void game(){
        initMap();
        try {
            while (true) {
                humanTurn();
                if (checkWin(DOT_X)) {
                    System.out.println("YOU WON!");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Sorry, DRAW!");
                    break;
                }
                aiTurn();
                if (checkWin(DOT_O)) {
                    System.out.println("AI WON!");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Sorry, DRAW!");
                    break;
                }
                printMap();
            }
        }
        catch(InputMismatchException inp){
            System.out.println("Введите число!");
            new TicTacToe().game();
        }
        System.out.println("GAME OVER");
        printMap();
    }

    void initMap(){
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                map[i][j]=DOT_EMPTY;
            }
        }
    }

     void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    void humanTurn()throws InputMismatchException {
        int x,y;
        do{
            System.out.println("Enter X and Y(1..3):");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        }while(!isCellValid(x,y));
        map[y][x] = DOT_X;
    }

    void aiTurn(){
        int x,y;
        do{
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        }while(!isCellValid(x,y));
        map[y][x] = DOT_O;
    }

    /**
     * Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.
     * @param dot
     * @return boolean
     */
    boolean checkWin(char dot){

       for(int i = 0; i < SIZE; i++){
                if (map[i][0] == dot && map[i][1] == dot && map[i][2] == dot) return true; //check horizontals
                if (map[0][i] == dot && map[1][i] == dot && map[2][i] == dot) return true; //check vetricals
        }

        //check  first diagonals
        int fd=0;
        for(int i = 0; i < SIZE; i++){
            if(map[i][i] == dot) {
                fd++;
            }
        }
        if(fd==3) return  true;

        //check  second diagonals
        int sd=0;
        for(int i = 0; i < SIZE; i++){
            if(map[i][(SIZE-1)-i] == dot) {
                sd++;
            }
        }
        if(sd==3) return true;
        return false;
    }

    boolean isMapFull(){
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                if(map[i][j]==DOT_EMPTY)
                    return false;
            }
        }
        return true;
    }

    boolean isCellValid(int x, int y){
        if(x < 0 || y < 0 || x>=SIZE ||y>=SIZE){
            return false;
        }
        return map[y][x] ==DOT_EMPTY;
    }
    public static void main(String[]args){
        new TicTacToe().game();
    }
}
