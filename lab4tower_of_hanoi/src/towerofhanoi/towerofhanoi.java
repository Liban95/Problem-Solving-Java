package towerofhanoi;

import java.util.Scanner;

public class towerofhanoi {
	
	static Scanner input = new Scanner(System.in);
	static int moves = 0;
	
	public static void main(String[] args)
	{
		System.out.print("Enter number of disks: ");
		int n = input.nextInt();
		
		System.out.print("\nThe moves are:\n");
		moveDisks(n, 'A', 'B', 'C');
		
		System.out.print("\nMoves: " + moves);
	}

	public static void moveDisks(int n, char fromTower, char toTower, char spareTower)
	{
		++moves;
		if (n == 1) //Stop condition
		{
			System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
		}
		else //The recursive method 
		{
			moveDisks(n - 1, fromTower, spareTower, toTower);
			System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
			moveDisks(n - 1, spareTower, toTower, fromTower);
		}
	}
}
