package raidG;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import raidG.classes.Priest;
import raidG.classes.Wclass;
import raidG.classes.abilities.DivineHymn;
import raidG.classes.abilities.abilities;

public class Raid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RaidG raid=new RaidG();
		
		raid.setRaidG(createRaidTest());
		raid.raidGroup.get(1).getWclass().getabilities();
	

		try {
			String s="yo yo yo";
			File f=new File("RaidSupp.txt");
		raid.write(s, f);
		}
		catch(IOException e) {
			
			}
		}
		


	
	
	public static ArrayList<player> createRaidTest(){
		
		ArrayList<player> players=new ArrayList<player>();
		Wclass Priest=new Priest();
		player jessie=new player("healer",Priest);
		player spiffy=new player("healer",Priest);
		player zombie=new player("healer",Priest);
		player cotton=new player("healer",Priest);
		players.add(jessie);
		players.add(spiffy);
		players.add(zombie);
		players.add(cotton);
		return players;
		
	}

}
