package model.score;

public class Score
{
	public double score;
	
	/**
	 * ctor Creates an Object of Score
	 */
	public Score()
	{
		this.score = 0;
		
	}
	
	/**
	 * @return the score
	 */
	public double getScore() {
		return score;
	}
	
	/**
	 * Adds the given Double to the total
	 * @param toAdd - The Double which should be added to the Total Score
	 */
	public void addScore(double toAdd)
	{
		this.score += toAdd;
	}
	
}
