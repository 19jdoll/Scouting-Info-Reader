public class Match
{
	private Team[] redAlliance;
	private Team[] blueAlliance;
	private int blueTeamScore;
	private int redTeamScore;
	private String winningAlliance;
	private String predictedWinningAlliance;
	
	public Match()
	{
		redAlliance = new Team[3];
		blueAlliance = new Team[3];
		
		redTeamScore = 0;
		blueTeamScore = 0;
		
		winningAlliance = "Rue";
		predictedWinningAlliance = "Rue";
	}
	public Team[] getRedAlliance()
	{
		return redAlliance;
	}
	public void setRedAlliance(Team[] redAlliance)
	{
		this.redAlliance = redAlliance;
	}
	public Team[] getBlueAlliance()
	{
		return blueAlliance;
	}
	public void setBlueAlliance(Team[] blueAlliance)
	{
		this.blueAlliance = blueAlliance;
	}
	public int getBlueTeamScore()
	{
		return blueTeamScore;
	}
	public void setBlueTeamScore(int blueTeamScore)
	{
		this.blueTeamScore = blueTeamScore;
	}
	public int getRedTeamScore()
	{
		return redTeamScore;
	}
	public void setRedTeamScore(int redTeamScore)
	{
		this.redTeamScore = redTeamScore;
	}
	public String getWinningAlliance()
	{
		return winningAlliance;
	}
	public void setWinningAlliance(String winningAlliance)
	{
		this.winningAlliance = winningAlliance;
	}
	public String getPredictedWinningAlliance()
	{
		return predictedWinningAlliance;
	}
	public void setPredictedWinningAlliance(String predictedWinningAlliance)
	{
		this.predictedWinningAlliance = predictedWinningAlliance;
	}
	
	public void readSchedule()
	{
		
	}
	
	public void predictWinner()
	{
		if( redAlliance[0].getAverageScore() + redAlliance[1].getAverageScore() + redAlliance[2].getAverageScore()
				< blueAlliance[0].getAverageScore() + blueAlliance[1].getAverageScore() + blueAlliance[2].getAverageScore() )
			predictedWinningAlliance = "BLUE";
		else
			predictedWinningAlliance = "RED";
	}
}
