package Model;

public class Player extends Person {
	
	private int goals;
	boolean goalie = false;
	
	public Player(String firstName,String middleName, String lastName, String email, String phone, int goals, boolean goalie) {
		super(firstName, middleName, lastName, email, phone);
		this.goals = goals;
		this.goalie = goalie;
		
	}
	
	
	
	public int getGoals() {
		return goals;
	}
	public void setGoals(int goals) {
		this.goals = goals;
	}
	public boolean isGoalie() {
		return goalie;
	}
	public void setGoalie(boolean goalie) {
		this.goalie = goalie;
	}
	
	

}
