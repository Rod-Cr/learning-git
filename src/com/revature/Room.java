package com.revature;

public class Room {
	public String name,shortdescription, longdescription;
	public Room[] exits = new Room[4];
	//{0:north exit Room object, 1:east exit Room object, 2:south exit Room object, 3:west exit Room object
	
	public Room (String name) {
		this.name = name;
		this.exits = exits;
//		this.getExit = getExit;
	}
	public void print() {
		System.out.println("Room: "+this.name);
	}
	//getters and setters
	public void setExits(Room north, Room east, Room south, Room west) {
		exits[0]=north;
		exits[1]=east;
		exits[2]=south;
		exits[3]=west;
	}
	public Room getExit(String direction) {
		switch(direction.toLowerCase().trim()) {
		case "north":
			return exits[0];
		case "east":
			return exits[1];
		case "south":
			return exits[2];
		case "west":
			return exits[3];
		default:
			return null;
		}
	}
}
