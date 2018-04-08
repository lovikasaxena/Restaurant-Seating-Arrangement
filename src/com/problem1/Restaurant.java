package com.problem1;

import java.util.ArrayList;

public interface Restaurant {
	public ArrayList<Table> getListOfTables();
	public void setListOfTables(ArrayList<Table> listOfTables);
	public ArrayList<Integer> getTableForCustomer(int requestedSeats, char isSeatingTogetherRequired);
	public ArrayList<Integer> fillTablesForN(int requestedSeats);
	public int TableForRequestedSeats(int requestSeats);
	public int getSumOfAllTableSeats(ArrayList<Table> listOfTables);

}
