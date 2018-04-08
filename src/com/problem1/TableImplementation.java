package com.problem1;

public class TableImplementation extends Table {

	public TableImplementation(int tableNumber, int numberOfSeats) {
		super(tableNumber, numberOfSeats);
		// TODO Auto-generated constructor stub
	}

	public int getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		TableImplementation tableImpl = (TableImplementation) o;
		if (this.getNumberOfSeats() < tableImpl.getNumberOfSeats()) {
			return -1;
		} else if (this.getNumberOfSeats() == tableImpl.getNumberOfSeats()) {
			return 0;
		}
		return 1;
	}

	@Override
	public int getNumberOfSeats() {
		// TODO Auto-generated method stub
		return numberOfSeats;
	}

}
