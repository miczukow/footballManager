package football.league;

import football.league.files.FilesFacade;
import football.league.model.Player;
import football.league.model.Team;

import java.util.*;

public class Application {
    public static void main(String[] args) {

        FilesFacade filesFacade = new FilesFacade();
        List<String> playersFromFile = filesFacade.readFile("players.csv");
        List<String> teamsFromFile = filesFacade.readFile("teams.csv");
        Set<Team> teams = new HashSet<>();
        Set<Player> players = new TreeSet<>();

        for(String line : teamsFromFile){
            teams.add(new Team(line));
        }
        for(Team t : teams){
            System.out.println(t.getName());
//            System.out.println(teams.indexOf(t));
        }

        for (String line : playersFromFile) {
            String[] tmpStrArr = line.split(";");
            teams.stream()
                    .filter(team -> team.getName().equals(tmpStrArr[2]))
                    .findFirst()
                    .get()
                    .addPlayer(new Player(tmpStrArr[0], tmpStrArr[1]));
        }

        for (Team t : teams) {
            t.playersSet().stream()
                    .forEach(p -> System.out.println(p.toString()));
        }

    }
}
