package com.hcl.soldiers;

public class Soldiers {
	int numberOfSoldiers;
	int[] soldiersList;
	boolean isAlive = true;
	int noSoldiersAlive;
	
	public Soldiers(int numberOfSoldiers) {
		this.numberOfSoldiers = numberOfSoldiers;
		soldiersList = new int[numberOfSoldiers];
		this.noSoldiersAlive = numberOfSoldiers;
	}
	
	public void createSoldiersList() {
		for(int i = 0; i < numberOfSoldiers; i ++) {
			soldiersList[i] = 1;
		}
	}
	
	public void startCollectiveSuicide() {
		while(noSoldiersAlive > 1) {
			for(int i = 0; i < numberOfSoldiers; i++) {
				if(soldiersList[i] == 1) {
					if(isAlive) isAlive = false;
					else {
						soldiersList[i] = 0;
						isAlive = true;
						noSoldiersAlive--;
					}
				}
			}
		}
	}
	
	public int getAliveSoldierPosition() {
		for(int i=0; i<soldiersList.length; i++) {
			if(soldiersList[i] == 1) return i+1;
		}
		return 0;
	}
	
}
