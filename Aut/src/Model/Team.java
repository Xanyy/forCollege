package Model;

public class Team extends Player {
	
	String manager, jerseyColour;
	Object Player;
	
	Team(String firstName, String middleName, String lastName, String email, String phone, int goals, boolean goalie, String jerseyColour, String manager) {
		super(firstName, middleName, lastName, email, phone, goals, goalie);
		this.jerseyColour = jerseyColour;
		this.manager = manager;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getJerseyColour() {
		return jerseyColour;
	}

	public void setJerseyColour(String jerseyColour) {
		this.jerseyColour = jerseyColour;
	}
	
	
	
	
	
	
}
