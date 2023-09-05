package lab3;

public class Main {

	public static void main(String[] args) {
		FootballTeam team1 = new FootballTeam("IUPUI", "Indianapolis", 4);
		FootballTeam team2 = new FootballTeam();
		team1.Write("team1.txt");
		team2.Write("team2.txt");
		team1.Read("team1.txt");
		team2.Read("team2.txt");
		Tournament tournament = new Tournament(10);
		tournament.Read("teams.txt");
		tournament.Output();
		tournament.season();
		tournament.Write("newTeams.txt");
	}

}
