package com.problem1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class RestaurantSeatingArrangement {
	public static void main(String[] args) {
		RestaurantSeatingArrangement restaurantSeatingArrangement = new RestaurantSeatingArrangement();
		Scanner input = new Scanner(System.in);
		int numberOfTables = input.nextInt();
		int[] tableSizeArray = new int[numberOfTables];
		for (int i = 0; i < tableSizeArray.length; i++) {
			tableSizeArray[i] = input.nextInt();
		}
		int requestedSeats = input.nextInt();
		char isSeatingTogetherRequired = input.next().charAt(0);
		ArrayList<Table> listOfTables = restaurantSeatingArrangement.createTables(numberOfTables, tableSizeArray);
		Restaurant restaurant = RestaurantFactory.getRestaurant(listOfTables);
		// Restaurant restaurant = new RestaurantImplementation(listOfTables);
		ArrayList<Integer> tablesOccupied = restaurant.getTableForCustomer(requestedSeats, isSeatingTogetherRequired);
		restaurantSeatingArrangement.printTablesOccupied(tablesOccupied);

	}

	public void printTablesOccupied(ArrayList<Integer> tablesOccupied) {
		Collections.sort(tablesOccupied);
		if ((tablesOccupied.size() == 1 && tablesOccupied.get(0) == 0) || tablesOccupied == null) {
			System.out.println("Not Possible");
			return;
		}
		for (Iterator iterator = tablesOccupied.iterator(); iterator.hasNext();) {
			Integer tableNumber = (Integer) iterator.next();
			System.out.print("table " + tableNumber);
			if (iterator.hasNext()) {
				System.out.print(", ");
			}
		}
	}

	private ArrayList<Table> createTables(int numberOfTables, int[] tableSizeArray) {
		int i = 1, index = 0;
		ArrayList<Table> listOfTables = new ArrayList<Table>();
		while (index < tableSizeArray.length && numberOfTables > 0) {
			//Table table1 = new TableImplementation(i, tableSizeArray[index]);
			Table table1 = TableFactory.getTable(i, tableSizeArray[index]);
			listOfTables.add(table1);
			i++;
			index++;
		}
		return listOfTables;
	}
}

/* inputs
2
5 10
7
y

2
5 10
17
y


2
5 10
12
n
*/
