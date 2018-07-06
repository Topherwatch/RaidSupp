package raidG;

import java.util.ArrayList;
import java.util.*;
import java.io.*;
import java.lang.*;

public class RaidG {
	private Formatter x;
	ArrayList<player> raidGroup = new ArrayList<player>();
	File f=new File("C:\\Users\\596937\\Documents\\RaidSupp.txt");
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
	
	
		public void write(String s, File f)throws IOException{
				FileWriter fw = new FileWriter(f,true);
				BufferedWriter writer = new BufferedWriter(fw);
				writer.write(s);
				writer.newLine();
				writer.flush();
				writer.close();
		
	}
}
