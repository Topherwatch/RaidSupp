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
		raid.createPlayer("jessie",1);
		raid.getRaidG().get(0).wowclass.getabilities();
		raid.getRaidG().get(0).wowclass.printWclass();
		raid.createPlayer("jessie",2);
		raid.getRaidG().get(1).wowclass.printWclass();
		System.out.println(raid.getRaidG().size());


		

		
		
	

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
		Wclass Priest2=new Priest();
		Wclass Priest3=new Priest();
		Wclass Priest4=new Priest();
		player jessie=new player("healer",Priest);
		player spiffy=new player("healer",Priest2);
		player zombie=new player("healer",Priest3);
		player cotton=new player("healer",Priest4);
		players.add(jessie);
		players.add(spiffy);
		players.add(zombie);
		players.add(cotton);
		return players;
		
	}

}
