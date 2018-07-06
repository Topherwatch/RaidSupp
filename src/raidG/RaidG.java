package raidG;

import java.util.ArrayList;

import raidG.classes.DeathKnight;
import raidG.classes.DemonHunter;
import raidG.classes.Druid;
import raidG.classes.Hunter;
import raidG.classes.Mage;
import raidG.classes.Monk;
import raidG.classes.Paladin;
import raidG.classes.Priest;
import raidG.classes.Rogue;
import raidG.classes.Shaman;
import raidG.classes.Warlock;
import raidG.classes.Warrior;
import raidG.classes.Wclass;

import java.util.*;
import java.io.*;
import java.lang.*;

public class RaidG {
	ArrayList<player> raidGroup = new ArrayList<player>();
	File f=new File("C:\\Users\\596937\\Documents\\RaidSupp.txt");
	Wclass cClass= null;
	int healers=0;
	int dps=0;
	int tanks=0;
	
	
	//Initiation of the Raid Group object.
	public RaidG() {
		System.out.println("Raid group initiated");
	}
	
	//This sets the objects current RaidGroup
	public void setRaidG(ArrayList<player> raid) {
		raidGroup=raid;
	}
	
	//This Returns the arraylist of raiders commonly known as the RaidGroup
	public ArrayList<player> getRaidG(){
		return raidGroup;
	}
	
	
	//Gets the role count of the raid to display composition.
	public void getRoleCount() {
	for(int i=0;i<raidGroup.size();i++) {
		if(raidGroup.get(i).wowclass.getRole().equals("healer")) {
			healers++;
		}
		else if(raidGroup.get(i).wowclass.getRole().equals("dps")) {
			dps++;
		}
		else if(raidGroup.get(i).wowclass.getRole().equals("tank")) {
			tanks++;
		}
		
	}
	System.out.println("Healers:" + healers+ " DPS:" + dps + " tanks" + tanks);
	}
	
	
	//Adds the player to the txt file (mock db temporarly)
		public void write(String s, File f)throws IOException{
				FileWriter fw = new FileWriter(f,true);
				BufferedWriter writer = new BufferedWriter(fw);
				writer.write(s);
				writer.newLine();
				writer.flush();
				writer.close();
		
	}
		//Creates a player to add to the raidGroup 
		public void createPlayer(String Name, int a) {
			assignClass(a);
			player player=new player(Name,cClass);
			raidGroup.add(player);
			
		
		}
		
		//Helper method to help determine which class to create.
		public void assignClass(int a) {	
			if(a==1) {
				this.cClass =new Priest();		
			}
			if(a==2) {
				this.cClass =new Druid();		
			}
			if(a==3) {
				this.cClass =new Shaman();		
			}
			if(a==4) {
				this.cClass =new Monk();		
			}
			if(a==5) {
				this.cClass =new Paladin();		
			}
			if(a==6) {
				this.cClass =new Rogue();		
			}
			if(a==7) {
				this.cClass =new Mage();		
			}
			if(a==8) {
				this.cClass =new Warlock();		
			}
			if(a==9) {
				this.cClass =new Warrior();		
			}
			if(a==10) {
				this.cClass =new Hunter();		
			}
			if(a==11) {
				this.cClass =new DemonHunter();		
			}
			if(a==12) {
				this.cClass =new DeathKnight();		
			}
		}
}
