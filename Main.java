class Main{
    private static WaterTank waterTank = WaterTank.getInstance();
    public static void main(String[] args){
        waterTank.setVisible(true);
        addDevices();
    }

    public static void addDevices(){
        ControlRoom controlRoom = waterTank.getControlRoom();
        controlRoom.addDevice(new Display(waterTank));
        controlRoom.addDevice(new Alarm(waterTank));
        controlRoom.addDevice(new Splitter(waterTank));
    }
}