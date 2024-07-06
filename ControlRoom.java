import java.util.ArrayList;

class ControlRoom{
    private ArrayList<DeviceInterface>deviceList=new ArrayList<>();

	public void addDevice(DeviceInterface device){
		deviceList.add(device);
	}

	public void updateDevices(int waterLevel){
        for(DeviceInterface device : deviceList){
			device.update(waterLevel);
		}
	}
}
