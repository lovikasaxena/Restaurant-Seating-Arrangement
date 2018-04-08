package com.problem1;

public abstract class Table implements Comparable {
	int tableNumber;
	int numberOfSeats;

	public Table(int tableNumber, int numberOfSeats) {
		super();
		this.tableNumber = tableNumber;
		this.numberOfSeats = numberOfSeats;
	}

	public Table(int tableNumber) {
		super();
		this.tableNumber = tableNumber;
	}

	public int getNumberOfSeats(){
		return numberOfSeats;
	}

	public int getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}

}
