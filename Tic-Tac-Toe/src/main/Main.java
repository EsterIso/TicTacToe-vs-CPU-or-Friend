package main;

import java.util.*;

import tictacfriend.TicTacFriend;
import tictactoecpu.TicTacToeCpu;


public class Main  {


    public static void main(String[] args) {
       
    	Scanner game = new Scanner(System.in);
    	System.out.println("Hello! Which game would you like to play? Press 1 for TicTacToe vs CPU or 2 for TicTacToe vs Friend");
        int i = game.nextInt();
        
        
        if(i == 1) {
        	TicTacToeCpu ticTacGame = new TicTacToeCpu();
        }else if (i == 2) {
        	TicTacFriend titacGame2 = new TicTacFriend();
        }else {
        	System.out.println("Incorrect input!!! (1 or 2)");
        }
        
        game.close();
	}
}