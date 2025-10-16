import java.lang.*;

/**
Andrew Daily
March 26, 2018
Player class that uses the weapons made
**/

public class Player
{
	public static void main(String[] args)
	{
		Player p1 = new Player("Hello");
        System.out.println(p1);

		p1.cycleForward();
        System.out.println(p1);

        p1.cycleBackward();
        System.out.println(p1);
	}

	//Attriutes
	private String name;
	private Weapon[] arsenal;
	private Weapon currentWeapon;
	private int currentWeaponIndex = 0;

	//Constructors
	Player()
	{
		this.name = "Andrew Daily";
		this.arsenal = new Weapon[4];
		this.arsenal[0] = new Knife();
		this.arsenal[1] = new Sword();
		this.arsenal[2] = new Pistol();
		this.arsenal[3] = new Rifle();

		currentWeapon = arsenal[currentWeaponIndex];
	}//end default player

	Player(String name)
	{
		this.name = name;
		this.arsenal = new Weapon[4];
		this.arsenal[0] = new Knife();
		this.arsenal[1] = new Sword();
		this.arsenal[2] = new Pistol();
		this.arsenal[3] = new Rifle();

		currentWeapon = arsenal[currentWeaponIndex];
	}//end user name

	//Operation
	public String getName()
	{
		return this.name;
	}//end getName

	public void setName(String name)
	{
		this.name = name;
	}//end setName

	public Weapon getCurrentWeapon()
	{
		return this.currentWeapon;
	}

	public int getCurrentWeaponIndex()
	{
		return this.currentWeaponIndex;
	}//end getCurrentWeaponIndex

	public String toString()
	{
		return "PLAYER: " + name + "\n" + "CURRENT WEAPON: " + currentWeapon + "\n" + "INVENTORY: " + arsenal[0] + " | " + arsenal[1] + " | " + arsenal[2] + " | " + arsenal[3];

	}//end toString

	public void cycleForward()
	{
		this.currentWeaponIndex += 1;

		if (currentWeaponIndex == 4)
		{
			currentWeaponIndex = 0;
		}

		currentWeapon = arsenal[currentWeaponIndex];
	}								//end cycleForward

	public void cycleBackward()
	{
		this.currentWeaponIndex -= 1;

		if (currentWeaponIndex == -1)
		{
			currentWeaponIndex = 3;
		}

		currentWeapon = arsenal[currentWeaponIndex];
	}								//end cycleBackward

}//end player