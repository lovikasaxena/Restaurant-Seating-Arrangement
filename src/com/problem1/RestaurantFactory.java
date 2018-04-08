package com.problem1;

import java.util.ArrayList;

public class RestaurantFactory {

	static public RestaurantImplementation getRestaurant(ArrayList<Table> listOfTables) {
		return new RestaurantImplementation(listOfTables);
	}

}
