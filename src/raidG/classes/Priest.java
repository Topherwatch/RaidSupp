package raidG.classes;

import raidG.classes.abilities.DivineHymn;

public class Priest extends Wclass {
	String spec="heals";
	String role="healer";
	//Abilities for Priest
	DivineHymn DivineHymn=new DivineHymn();
	
	
	
	
	public Priest() {
		super();
		
	}
	

	@Override
	public void getWClass() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getRole() {
		return this.role;
		
	}

	@Override
	public void getabilities() {
		DivineHymn.use(30);
		
	}

	@Override
	public void printWclass() {
		System.out.println("Priest");
		
	}
	

}
