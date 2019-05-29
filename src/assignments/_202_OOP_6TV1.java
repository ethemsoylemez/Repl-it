package assignments;


//public class for main method
public class _202_OOP_6TV1 {
	public static void main(String[] args) {
		TV tv = new TV("Vestel");
		tv.setChannel(60);
		tv.setVolumeLevel(6);
		System.out.println("Brand: " + tv.getBrand());
		System.out.println("Channel: "+tv.getChannel());
		System.out.println("Volume: "+tv.getVolumeLevel());
	}
}

//Class
class TV {

	// instance variables
	int channel = 1;
	int volumeLevel = 1;
	boolean on = false;
	String brand = "undefined";

	// constructors
	public TV() {
		System.out.println("Creating TV object using no Args- constructor");
	}

	public TV(String brand) {
		System.out.println("Creating TV object using 1 arg - constructor");
		this.brand = brand;
	}

	// getters and setters
	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		 if(channel>1 && channel<120&& isOn()==true){
		      this.channel = channel;
		    }else{
		       System.out.println("ERROR: TV is either OFF or invalid Channel");
		    }
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(int volumeLevel) {
		if (volumeLevel >= 1 && volumeLevel <= 7 && isOn() == true) {
			this.volumeLevel = volumeLevel;
		} else {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		}
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	// custom methods
	public int channelUp() {
		return channel++;
	}

	public int channelDown() {
		return channel--;
	}

	public int volumeUp() {
		return volumeLevel++;
	}

	public int volumeDown() {
		return volumeLevel--;
	}

	public boolean isOn() {
		return on;
	}

	public boolean turnOn() {
		if (on) {
			System.out.println("TV is already ON");
		} else {
			on = true;
		}
		return on;
	}

	public boolean turnOff() {
		if (!on) {
			System.out.println("TV is already OFF");
		} else {
			on = false;
		}
		return on;
	}
}
