package football.league.model;

import java.util.List;

public class Team {

    private String name;
    private List<Player> players;

    public Team(String name){
        this.name = name;
    }

    public void addPlayer(Player player){
        if(!players.contains(player)){
            players.add(player);
            player.setTeam(this);
        }
        else
            System.out.println("Can't have duplicated players!!");
    }

    public String getName(){
        return name;
    }
}
