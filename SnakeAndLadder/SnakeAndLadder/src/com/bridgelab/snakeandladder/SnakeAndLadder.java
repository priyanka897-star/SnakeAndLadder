package com.bridgelab.snakeandladder;

public class SnakeAndLadder {
	public static void main(String[] args) {
		 System.out.println("Welcome to Snake and Ladder Game");
		 System.out.println("Player is at 0 Position");
		 int dice = (int) Math.floor(Math.random() * 6 + 1);
		System.out.println("The number on dice is " + dice);
	}
}
