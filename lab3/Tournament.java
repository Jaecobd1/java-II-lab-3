package lab3;
import java.util.Random;
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;
public class Tournament {
	
	private FootballTeam[] teams;
	private static Random random = new Random();

	public Tournament() 
	{
		// Empty Constructor for a tournament
		this.teams = null;
	}
	
	public Tournament(int numberOfTeams) 
	{
		// Constructor given the number of teams.
		// Updates the teams array to contain the number
		// provided.
		// Loop over the new length and sets the value
		// to an empty football team.
		this.teams = new FootballTeam[numberOfTeams];
		for(int i = 0; i < teams.length; i++) 
		{
			this.teams[i] = new FootballTeam();
		}
	}
	
	public void Read(String fileName) {
		// Updates the attributes within the teams objects
		// from a given a filename.
		File file = new File(fileName);
		try (Scanner scan = new Scanner(file))
		{
			for(int i = 0; i < teams.length; i++) 
			{
				teams[i].Read(scan);
				scan.nextLine();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void Write(String fileName)
	{
		// Write a new file with the provided name
		// Loops through the teams array & writes each
		// team to the file. 
		File file = new File(fileName);
		try (FileWriter fileWriter = new FileWriter(file))
		{
			for(int i = 0; i < teams.length; i++) 
				teams[i].Write(fileWriter);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void Output() 
	{
		// Loops over the length of the teams array
		// and prints out each team.
		for(int i = 0; i < teams.length; i++) 
			System.out.println(teams[i].toString());
	}
	
	public void season()
	{
		// Simulates a season, loops through each 
		// object in the teams array & adds a random
		// number of wins to each team.
		for(int i = 0; i < teams.length; i++) 
		{
			int wins = random.nextInt(10);
			teams[i].AddWins(wins);
		}
		Arrays.sort(teams);
	}
}
