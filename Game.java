package project4;

import java.util.GregorianCalendar;

/**********************************************************************
 * Creates a Game to be rented 
 * 
 * @author Jarod Collier and Ben Burger
 * @version 7/7/18
 *********************************************************************/
public class Game extends DVD {
	
	/** Saves a DVD object as a binary file */
	private static final long serialVersionUID = 1L;
	
	/** Represents the type of player */
	private PlayerType player; 
	
	/******************************************************************
	 * Creates an empty Game object
	 *****************************************************************/
	public Game() {
	}
	
	/******************************************************************
	 * Returns the type of the player used for playing the game
	 * @return player - the type of player used for playing the game
	 *****************************************************************/
	public PlayerType getPlayer() {
		return player;
	}

	/******************************************************************
	 * Sets the type of the player using for renting games
	 * @param player - sets the type of player the games
	 *****************************************************************/
	public void setPlayer(PlayerType player) {
		this.player = player;
	}
	
	/******************************************************************
	 * Figures out the cost of the game upon returning it
	 * $5 if returned on time and $15 if late
	 * @param date - the date that the user returns the game
	 * @return a double of the cost of renting the game
	 *****************************************************************/
	public double getCost(GregorianCalendar date) {
		if (date.compareTo(dueBack) <= 0)	
			return 5.00;
		else
			return 15.00;
	}

	/******************************************************************
	 * Takes the game object and returns the details of it
	 * @return String of the details of the game object
	 *****************************************************************/
	public String toString() {
		return "Name: " + nameOfRenter + ", Title: " + title +
				", rented on: " + convertDateToString(bought) +
				", Due back on: " + convertDateToString(dueBack)
				+ ", Game Player: " + player;
	}
	
	/******************************************************************
	 * Takes the DVD object and returns the details of it with tabs
	 * @return String of the details of the DVD object
	 *****************************************************************/
	public String toStringSave() {
		return nameOfRenter + "\t" + title + "\t" +
				convertDateToString(bought) + "\t" + 
				convertDateToString(dueBack) + "\t" +
				player;
	}
}
