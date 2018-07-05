package raidG;

import java.util.ArrayList;

public class RaidG {
	ArrayList<player> places = new ArrayList<player>();
	int healers=0;
	int dps=0;
	int tanks=0;
	
	
	public RaidG() {
		System.out.println("Raid group initiated");
	}
	
	public void setRaidG(ArrayList<player> raid) {
		places=raid;
	}
	
	public ArrayList<player> getRaidG(){
		return places;
	}
	
	public void getRoleCount() {
	for(int i=0;i<places.size();i++) {
		if(places.get(i).wowclass.getRole().equals("healer")) {
			healers++;
		}
		else if(places.get(i).wowclass.getRole().equals("dps")) {
			dps++;
		}
		else if(places.get(i).wowclass.getRole().equals("tank")) {
			tanks++;
		}
		
	}
	System.out.println("Healers:" + healers+ " DPS:" + dps + " tanks" + tanks);
	}
	
	
}
