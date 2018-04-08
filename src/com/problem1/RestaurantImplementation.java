package com.problem1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class RestaurantImplementation implements Restaurant{
private ArrayList<Table> listOfTables;


public RestaurantImplementation(ArrayList<Table> listOfTables) {
	super();
	this.listOfTables = listOfTables;
}

public ArrayList<Table> getListOfTables() {
	return listOfTables;
}

public void setListOfTables(ArrayList<Table> listOfTables) {
	this.listOfTables = listOfTables;
}

public ArrayList<Integer> getTableForCustomer(int requestedSeats, char isSeatingTogetherRequired){
	ArrayList<Integer> tablesOccupied = new ArrayList<>();
	if(isSeatingTogetherRequired == 'y' || isSeatingTogetherRequired == 'Y'){
		tablesOccupied.add(this.TableForRequestedSeats(requestedSeats));
		return tablesOccupied;
	}
	else if(isSeatingTogetherRequired == 'n' || isSeatingTogetherRequired == 'N'){
		if(this.getSumOfAllTableSeats(listOfTables) < requestedSeats){
			return null;
		}
		else{
			return fillTablesForN(requestedSeats);
		}
	}
	return null;
}

public ArrayList<Integer> fillTablesForN(int requestedSeats) {
	// TODO Auto-generated method stub
	int sum = 0;
	ArrayList<Integer> tablesOccupied = new ArrayList<>();
	Collections.sort(listOfTables);
	Collections.reverse(listOfTables);
	for (Iterator iterator = listOfTables.iterator(); iterator.hasNext();) {
		TableImplementation table = (TableImplementation) iterator.next();
		if(sum < requestedSeats){
			sum += table.getNumberOfSeats();
			tablesOccupied.add(table.getTableNumber());
		}
		else{
			return tablesOccupied;
		}
	}
	return tablesOccupied;
}

public int TableForRequestedSeats(int requestSeats){
	Collections.sort(listOfTables);
	for (Iterator iterator = listOfTables.iterator(); iterator.hasNext();) {
		TableImplementation table = (TableImplementation) iterator.next();
		if(table.getNumberOfSeats() >= requestSeats) {
			 return table.getTableNumber();
		}
	}
	return 0;
}
public int getSumOfAllTableSeats(ArrayList<Table> listOfTables){
	int sum = 0;
	for (Iterator iterator = listOfTables.iterator(); iterator.hasNext();) {
		Table table = (Table) iterator.next();
		sum += table.getNumberOfSeats();
	}
	return sum;
	
	
}
}
