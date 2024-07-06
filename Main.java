class Main{
    public static WaterTank waterTank = WaterTank.getInstance();
    public static ControlRoom controlRoom = waterTank.getControlRoom();
    public static void main(String[] args){
        waterTank.setVisible(true);
        controlRoom.addDevice(new Display(waterTank));
        controlRoom.addDevice(new Alarm(waterTank));
        controlRoom.addDevice(new Splitter(waterTank));
    }
}