package football.league.model;

import java.util.HashSet;
import java.util.Set;

public class Team {

    private String name;
    private Set<Player> players = new HashSet<>();

    public Team(String name) {
        this.name = name;
    }

    public void addPlayer(Player player) {
        if (!players.contains(player)) {
            players.add(player);
            player.setTeam(this);
        } else
            System.out.println("Can't have duplicated players!!");
    }

    public String getName() {
        return name;
    }

    public Set<Player> playersSet() {
        return players;
    }

    public void playersList() {
        for (Player p : players)
            System.out.println(p.toString());
    }
}
