package football.league.model;

public class Player {

    private String firstName;
    private String lastName;
    private Team team;

    public Player(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setTeam(Team team){
        this.team = team;
    }
}
