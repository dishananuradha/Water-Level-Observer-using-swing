import java.util.ArrayList;

class ControlRoom {
    private ArrayList<Device>deviceList=new ArrayList<>();
	private int waterLevel;

	public void addDevice(Device device){
		deviceList.add(device);
	}

	public void setWaterLevel(int waterLevel){
		if(this.waterLevel!=waterLevel){
			this.waterLevel=waterLevel;
			notifyDevices();
		}
	}

	public void notifyDevices(){
		for(Device device : deviceList){
			device.update(waterLevel);
		}
	}
}
