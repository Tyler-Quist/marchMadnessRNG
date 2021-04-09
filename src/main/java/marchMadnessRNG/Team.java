package main.java.marchMadnessRNG;

public class Team {

	private int seed, region; //region 1 = midwest, 2 = south, 3 east, 4 = west
	private String name;
	
	public Team(String name,int seed, int region) {
		this.seed = seed;
		this.region = region;
		this.name = name;
	}
	
	public void setSeed(int seed) {
		this.seed = seed;
	}
	
	public void setRegion(int region) {
		this.region = region;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSeed() {
		return seed;
	}
	
	public int getRegion() {
		return region;
	}
	
	public String getName() {
		return name;
	}
}

