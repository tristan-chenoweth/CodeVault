import java.util.*;
import java.lang.*;
import java.math.*;
import java.text.*;

public class Player
{
	// Main Method
	public static void main (String [] args)
	{
		Player p = new Player("Tristan");
		System.out.println(p);
	}

	// Attributes

	String name;
	Weapon [] arsenal = new Weapon[4];
	Weapon currentWeapon;
	int currentWeaponIndex = 0;

	Knife k = new Knife();
	Sword s = new Sword();
	Pistol pi = new Pistol();
	Rifle r = new Rifle();

	// Constructors

	Player() //knife sword pistol rifle
	{
		name = "Player 1";

		arsenal[0] = k;
		arsenal[1] = s;
		arsenal[2] = pi;
		arsenal[3] = r;

		currentWeapon = arsenal[currentWeaponIndex];
	}

	Player(String name_in)
	{
		name = name_in;

		arsenal[0] = k;
		arsenal[1] = s;
		arsenal[2] = pi;
		arsenal[3] = r;

		currentWeapon = arsenal[currentWeaponIndex];
	}

	// Operations

	public String getName()
	{
		return name;
	}

	public void setName(String name_in)
	{
		name = name_in;
	}

	public Weapon getCurrentWeapon()
	{
		return currentWeapon;
	}

	public int getCurrentWeaponIndex()
	{
		return currentWeaponIndex;
	}

	public String toString()
	{
		return "Player: " + name + "\n" + "Current Weapon: " + currentWeapon + "\n" + "Inventory: " + arsenal[0] + " | " + arsenal[1] + " | " + arsenal[2] + " | " + arsenal[3];
	}

	public void cycleForward()
	{
		this.currentWeaponIndex += 1;

		if (currentWeaponIndex == 4)
		{
			currentWeaponIndex = 0;
		}

		currentWeapon = arsenal[currentWeaponIndex];
	}

	public void cycleBackward()
	{
		this.currentWeaponIndex -= 1;

		if (currentWeaponIndex == -1)
		{
			currentWeaponIndex = 3;
		}

		currentWeapon = arsenal[currentWeaponIndex];
	}
}