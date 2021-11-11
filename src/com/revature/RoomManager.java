package com.revature;

public class RoomManager {
	Room startingRoom;
	
	public void init() {
		// {0:north exit Room object , 1:east exit Room object , 2:south exit Room object, 3:west exit Room object}
		//SET UP ROOMS
			    Room foyer = new Room("The Foyer"+" a large foyer"+
						"The two-story entryway of a traditional ranch house. There is a large couch and a piano here. A main door is open to the south, this leads outside." + "\n"
						+ "The hardwood floor leads north into doorway, a staircase that leads up to a second floor is to the east." + "\n"
						+ "To the north is a living space.");
			    Room livingSpace = new Room("Living Space"+" a room to live in."+
				    	"The large entry area of living space. A main door is open to the south, this leads to the foyer." + "\n"
				    	+ "The hardwood floor leads north, a den is to the west." + "\n"
				    	+ "To the north is a living room, where you can see a couch.");
			    Room den = new Room("Den"+"a room to use electronics."+"There is a couch, lazy boy and four computers with desks" + "\n" +
						"An area of computers and big screen television. An opening to the west, this leads to the living space." + "\n"
						+ "The living space is to the east.");
			    Room livingRoom = new Room("Living Room"+" a room to congregate."+
						"The area of living room. A hardwood floor is open to the south, this leads to the living space." + "\n"
						+ "The hardwood floor leads south, a bedroom is to the west." + "\n"
						+ "To the north is a kitchen, where you can see an oven and cabinets.");
			    Room  bedRoom = new Room("Bed Room"+" a room to sleep."+
						"The area of rest. A door is open to the east, this leads to the living room.");
			    Room kitchen = new Room("Kitchen"+" a room to prepare food."+
						"To the south is the living room, to the east is the dinning room.");
			    Room diningRoom = new Room("Dining Room"+" a room to eat food."+
						"There is a grand table and chairs here."+ "\n" +
						" To the east is the kitchen, to the north is the outside dinning area.");
			    Room outsideDiningRoom = new Room("Outside Dining Room"+" a covered and netted space to eat food. There are chairs and tables here."+
						"To the south is the dining area, to the east are stairs that lead up to the hallway.");
				Room librarySouth = new Room("Library Room-south"+" a room to store books."+
						"To the east is the master bed room, to the north is the library north, to the west is the boys bedroom, to the south is the stairs back to the foyer.");	
				Room masterBedRoom = new Room("Master Bed Room"+" a room to sleep."+
						"The area of rest. A door is open to the east, this leads to the library south.");		
				Room boysBedRoom = new Room("Boy's Bed Room"+" a room to sleep for young men."+
						"The area of rest. A door is open to the west, this leads to the library south.");
				Room libraryNorth = new Room("Library Room-north"+" a room to store books."+
						"To the east is the bathroom, to the south is the library south, to the west is the girls bedroom.");
				Room bathRoom = new Room("Bathroom Room"+" a room to bath."+
						"The area of bathing. A door is open to the east, this leads to the library north.");
				Room girlsBedRoom = new Room("Girl's Bed Room"+" a room to sleep for young women."+
						"The area of rest. A door is open to the west, this leads to the library north.");
				Room hallway = new Room("Hallway"+" an entrance to other areas."+
						"There is a door to the north that leads to stairs that go to the out door dining area." + "\n" +
						" To the east is the store room, to the south is the library north, to the west is the toy room.");
				Room storeRoom = new Room("Store Room"+"An area of storage."+
						"A room to store a telescope, extra blankets and pillows." +"\n" + 
						" A door is open to the east, this leads to the hallway.");
				Room toyRoom = new Room("Toy Room"+" a room to play with toys."+
						" The area of play. A door is open to the west, this leads to the hallway.");
				
			    foyer.setExits(livingSpace, librarySouth, null, null);
//					"a large foyer",
//					"The two-story entryway of a traditional ranch house. There is a large couch and a piano here. A main door is open to the south, this leads outside." + "\n"
//					+ "The hardwood floor leads north into doorway, a staircase that leads up to a second floor is to the east." + "\n"
//					+ "To the north is a living space.");
//					rooms[0] = foyer;

//					exits = new Room(1,8, null, null);
//			        foyer.getExit(1,0, null,null);
			    
			    livingSpace.setExits(livingRoom, null, foyer, den);
//			    	"a room to live in.",
//			    	"The large entry area of living space. A main door is open to the south, this leads to the foyer." + "\n"
//			    	+ "The hardwood floor leads north, a den is to the west." + "\n"
//			    	+ "To the north is a living room, where you can see a couch.");
//			    	rooms[1] = livingSpace;
//			    	exits = new Room(3, null,0,2);
//			    	livingSpace.getExit(north, null,south,east);
				
				den.setExits(null, livingSpace, null, null);
//					"a room to use electronics.","There is a couch, lazy boy and four computers with desks" + "\n" +
//					"An area of computers and big screen television. An opening to the west, this leads to the living space." + "\n"
//					+ "The living space is to the east.");
//					rooms[2] = den;
//					exits = new Room(null,1,null,null);
//				den.getExit(null,east,null,null);
				
				livingRoom.setExits(kitchen, bedRoom, livingSpace, null);
//					"a room to congregate.",
//					"The area of living room. A hardwood floor is open to the south, this leads to the living space." + "\n"
//					+ "The hardwood floor leads south, a bedroom is to the west." + "\n"
//					+ "To the north is a kitchen, where you can see an oven and cabinets.");
//					rooms[3] = livingRoom;
//					exits = new Room(5,4,1, null);
//					livingRoom.getExit(north,east,south,null);
				
				bedRoom.setExits(null, livingRoom, null, null);
//					"a room to sleep.",
//					"The area of rest. A door is open to the east, this leads to the living room.");
//					rooms[4] = bedRoom;
//					exits = new Room(null,3,null,null);
//				bedRoom.getExit(null,east,null,null);
				
				kitchen.setExits(null, diningRoom, livingRoom, null);
//					"a room to prepare food.",
//					"To the south is the living room, to the east is the dinning room.");
//					rooms[5] = kitchen;
//					exits = new Room(null,6,3,null);
//				kitchen.getExit(null,east,south,null);
				
				diningRoom.setExits(outsideDiningRoom, kitchen, null, null);
//					"a room to eat food.",
//					"There is a grand table and chairs here."+ "\n" +
//					"To the east is the kitchen, to the north is the outside dinning area.");
//					rooms[6] = diningRoom;
//					exits = new Room(7,5,null,null);
//				diningRoom.getExit(north,east,null,null);
				
				outsideDiningRoom.setExits(null, hallway, diningRoom, null);
//					"a covered and netted space to eat food. There are chairs and tables here.",
//					"To the south is the dining area, to the east are stairs that lead up to the hallway.");
//					rooms[7] = outsideDiningRoom;
//				outsideDiningRoom.getExit(null,east,south,null);
//
				librarySouth.setExits(libraryNorth, boysBedRoom, foyer, masterBedRoom);
//					"a room to store books.",
//					"To the east is the master bed room, to the north is the library north, to the west is the boys bedroom, to the south is the stairs back to the foyer.");
//					rooms[8] = librarySouth;
//					exits = new Room(11,10,0,9);
//				librarySouth.getExit(north,east,south,west);
				
				masterBedRoom.setExits(null, librarySouth, null, null);
//					"a room to sleep.",
//					"The area of rest. A door is open to the east, this leads to the library south.");
//					rooms[9] = masterBedRoom;
//					exits = new Room(null,8,null,null);
//				masterBedRoom.getExit(null,east,south,west);
				
				boysBedRoom.setExits(null, null, null, librarySouth);
//					"a room to sleep for young men.",
//					"The area of rest. A door is open to the west, this leads to the library south.");
//					rooms[10] = boysBedRoom;
//					exits = new Room(null,null,null,8);
//				boysBedRoom.getExit(null,null,null,west);
				
				libraryNorth.setExits(librarySouth, bathRoom, girlsBedRoom, null);
//					"a room to store books.",
//					"To the east is the bathroom, to the south is the library south, to the west is the girls bedroom.");
//					rooms[11] = libraryNorth;
//					exits = new Room(8,12,13,null);
//				libraryNorth.getExit(north,east,south,null);
				
				bathRoom.setExits(null, libraryNorth, null, null);
//					"a room to bath.",
//					"The area of bathing. A door is open to the east, this leads to the library north.");
//					rooms[12] = bathRoom;
//					exits = new Room(null,11,null,null);
//				bathRoom.getExit(null,east,null,null);
				
				girlsBedRoom.setExits(null, null, null, libraryNorth);
//					"a room to sleep for young women.",
//					"The area of rest. A door is open to the west, this leads to the library north.");
//					rooms[13] = girlsBedRoom;
//					exits = new Room(null,null,null,11);
//				girlsBedRoom.getExit(null,null,null,west);
				
				hallway.setExits(outsideDiningRoom, libraryNorth, storeRoom, toyRoom);
//					"an entrance to other areas.",
//					"There is a door to the north that leads to stairs that go to the out door dining area." + "\n" +
//					"To the east is the store room, to the south is the library north, to the west is the toy room.");
//					rooms[14] = hallway;
//					exits = new Room(7,11,15,16);
//					hallway.getExit(north,east,south,west);
				
				storeRoom.setExits(null, hallway, null, null);
//					"An area of storage.",
//					"A room to store a telescope, extra blankets and pillows." +"\n" + 
//					"A door is open to the east, this leads to the hallway.");
//					rooms[15] = storeRoom;
//					exits = new Room(null,14,null,null);
//					storeRoom.getExit(null,east,null,null);
				
				toyRoom.setExits(null, null, null, hallway);
//					"a room to play with toys.",
//					"The area of play. A door is open to the west, this leads to the hallway.");
//					rooms[16] = toyRoom;
//					exits = new Room(null,null,null,14);
//				toyRoom.getExit(null,null,null,west);
				this.startingRoom=foyer;
				}		
		}

