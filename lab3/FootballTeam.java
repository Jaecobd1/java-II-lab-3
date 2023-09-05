package lab3;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FootballTeam implements Comparable<FootballTeam> 
{
	private String name, location;
	private int numberWins;

	public FootballTeam()
	{
		// Empty constructor
		// Creates a blank team
		this.name = "";
		this.location = "";
		this.numberWins = 0;
	}
	public FootballTeam(String name, String location, int numberWins) 
	{
		// Constructor with all attributes provided.
		this.name = name;
		this.location = location;
		this.numberWins = numberWins;
	}
	@Override
	public int compareTo(FootballTeam other) 
	{
		// Returns the difference between the number
		// of wins of two teams.
		return this.numberWins - other.numberWins;
	}
	
	public void AddWins(int n) 
	{
		// Increases the number of wins by
		// the provided number
		this.numberWins += n;
	}
	public void Read(String fileName) 
	{
		// Updates the current object's attributes
		// to the attributes within the provided
		// file
		try {
			File file = new File(fileName);
			Scanner scan = new Scanner(file);
			name = scan.nextLine();
			location = scan.nextLine();
			numberWins = scan.nextInt();
			scan.close();
			
		} catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	public void Read(Scanner scan) 
	{
		// Updates the current object's attributes
		// to the attributes provided in the
		// given scanner.
		this.name = scan.nextLine();
		this.location = scan.nextLine();
		this.numberWins = scan.nextInt();
	}
	public void Write(String fileName) {
		// Writes the object's 
		// attributes to a new 
		// file with the provided 
		// file name.
		try {
			File file = new File(fileName);
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(this.name + "\n" + this.location + "\n" + this.numberWins);
			fileWriter.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void Write(FileWriter fileWriter) 
	{
		// Using the FileWriter provided,
		// Write the info from the object 
		// to the file.
			try {
				fileWriter.write(this.name + "\n" + this.location + "\n" + this.numberWins + "\n");
			} catch(Exception e) {
				e.printStackTrace();
			}
		
	}
	@Override
	public String toString() {
		// Helps with output function of tournament
		// Displays the information on a line
		return "Name: " + this.name + ", Location: " + this.location + ", Wins: " + this.numberWins;
	}
}
