package raidG.classes.abilities;

public class PowerWordBarrier extends abilities{
	
	//time in seconds until usable.
	int cooldown=180;
	
	//time in seconds when ready to be used(starts at 0);
	int readyToUse=0;
	
	//returns if ability is ready to be used or not.
	boolean ussable=true;
	
	//Id of skill for ERT note
	int skillId=62618;
	
	public void use(int time) {

		readyToUse=time+cooldown;
		System.out.println("PowerWordBarrier used at: "+time);
		
	}
	
	public int getCooldown() {
		return this.cooldown;
	}
	
	public void setCooldown(int cooldown) {
		this.cooldown=cooldown;
	
	}
	
	public boolean isUsable(int time) {
		if(time>=readyToUse) {
			this.ussable=true;
		}
		else if (time<readyToUse) {
			System.out.println("not useable until:"+readyToUse);
			this.ussable=false;
		}
		return this.ussable;
	}
	
	public void setUssibility(boolean variable) {
		this.readyToUse=0;
		this.ussable=variable;
	}

}
