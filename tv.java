package pack1;

public class tv {
	int channel=1;
	int volume=1;
	boolean onTv=false;
	
	//constructor:
	public tv() {}
	
	//method
	public void turnOn(){
		onTv=true;
	}
	public void turnOff() {
		onTv=false;
	}
	public void setchannelUp(int newChannel) {
		if (onTv==true && newChannel>0 && newChannel<20) {
			channel=newChannel;
		}
	}
	public void setvolumeUp(int newVolume) {
		if (onTv==true && newVolume>0 && newVolume<=10) {
			volume=newVolume;
		}
	}
	public void addChannel() {
		if (onTv==true && channel<20) {
			channel++;
		}
	}
	public void deChannel() {
		if (onTv==true && channel>0) {
			channel--;
		}
	}
	public void addVolume() {
		if (onTv==true && volume<10) {
			volume++;
		}
	}
	public void deVolume() {
		if (onTv==true && volume>0) {
			volume--;
		}	

}}
