package com.problem1;

public class TableFactory {
	public static TableImplementation getTable(int tableNumber, int numberOfSeats) {
		return new TableImplementation(tableNumber, numberOfSeats);
	}

}
