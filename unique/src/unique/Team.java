package unique;
import java.util.*;
public class Team {
	private int teamNumber;
	private String teamName;
	private player playerObj;
	private player[] playerArrObject;

	Team(int tno, String tname, player captain, player[] plist) {
		teamNumber=tno;
		teamName=tname;
		playerObj=captain;
		playerArrObject=plist;
		
	}

	public Team getPlist() {
		
		return null;
	}

	@Override
	public String toString() {
		return "Team [teamNumber=" + teamNumber + ", teamName=" + teamName + ", playerObj=" + playerObj
				+ ", playerArrObject=" + Arrays.toString(playerArrObject) + "]";
	}

	
	
}
