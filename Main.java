class Main{
    public static void main(String[] args){
        ControlRoom controlRoom = new ControlRoom();
        WaterTank waterTank = new WaterTank(controlRoom);
        waterTank.setVisible(true);

        controlRoom.addDevice(new Display(waterTank));
        controlRoom.addDevice(new Alarm(waterTank));
        controlRoom.addDevice(new Splitter(waterTank));
    }
}