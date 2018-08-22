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
        List<Team> teams = new ArrayList<>();
        Set<Player> players = new TreeSet<>();

        for(String line : teamsFromFile){
            teams.add(new Team(line));
        }
        for(Team t : teams){
            System.out.println(t.getName());
            System.out.println(teams.indexOf(t));
        }

        String[] tmpStrArr;
        for(String line : playersFromFile){
            tmpStrArr = line.split(";");
            Player p = new Player(tmpStrArr[0], tmpStrArr[1]);
            teams.stream().map(Team::getName).filter(name -> name.equals(tmpStrArr[2])
//            teams.get(teams.indexOf(tmpStrArr[2])).addPlayer(new Player(tmpStrArr[0], tmpStrArr[1]));
        }

    }
}
