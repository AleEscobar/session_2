package com.hcl.soldiers;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Soldiers soldiers = new Soldiers(3);
		soldiers.createSoldiersList();
		soldiers.startCollectiveSuicide();
		
		System.out.println(soldiers.getAliveSoldierPosition());

	}

}