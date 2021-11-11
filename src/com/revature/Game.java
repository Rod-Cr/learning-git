package com.revature;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		RoomManager rm = new RoomManager();
		rm.init();
		Room currentRoom = rm.startingRoom;
		String input ="";
		while(!input.equals("quit")) {
			currentRoom.print();
			System.out.println("Which direction do you want to go north, east, south or west?");
			input = scanner.nextLine();
			Room nextRoom = currentRoom.getExit(input);
			if(nextRoom != null)
				currentRoom = nextRoom;
		}
	}
}
