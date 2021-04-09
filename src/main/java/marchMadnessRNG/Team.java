package main.java.marchMadnessRNG;

/**
 * @author Tyler Quist
 *
 */
public class Team {

	private int seed, region; //region 1 = midwest, 2 = south, 3 = east, 4 = west
	private String name;
	
	/**
	 * Constructs a team class with name region and seed of the team
	 * 
	 * @param name name of team 
	 * @param seed seed of team 
	 * @param region region of team
	 */
	public Team(String name,int seed, int region) {
		this.seed = seed;
		this.region = region;
		this.name = name;
	}
	
	/**
	 * sets the seed of the team 
	 * 
	 * @param seed seed of team 
	 */
	public void setSeed(int seed) {
		this.seed = seed;
	}
	
	/**
	 * sets the region of the team 
	 * 
	 * @param region region of team 
	 */
	public void setRegion(int region) {
		this.region = region;
	}
	
	/**
	 * sets the name of the team 
	 * 
	 * @param name name of team 
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * returns the seed of a team
	 * 
	 * @return seed of team 
	 */
	public int getSeed() {
		return seed;
	}
	
	/**
	 * returns the region of a team
	 * 
	 * @return region of team 
	 */
	public int getRegion() {
		return region;
	}
	
	/**
	 * returns the name of a team
	 * 
	 * @return name of team 
	 */
	public String getName() {
		return name;
	}
}

