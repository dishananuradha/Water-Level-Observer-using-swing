import java.util.ArrayList;

class ControlRoom{
    private ArrayList<DeviceInterface>deviceList=new ArrayList<>();
	private int waterLevel;

	public void addDevice(DeviceInterface device){
		deviceList.add(device);
	}

	public void setWaterLevel(int waterLevel){
		if(this.waterLevel!=waterLevel){
			this.waterLevel=waterLevel;
			notifyDevices();
		}
	}

	public void notifyDevices(){
		for(DeviceInterface device : deviceList){
			device.update(waterLevel);
		}
	}
}
