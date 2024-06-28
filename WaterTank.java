import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

class WaterTank extends JFrame{
    private static WaterTank waterTank;
    private ControlRoom controlRoom;
    private JSlider waterLevelSlider;

    private WaterTank(){
        setSize(200,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());

        controlRoom = new ControlRoom();
        controlRoom.addDevice(new Display(WaterTank.this));
        controlRoom.addDevice(new Alarm(WaterTank.this));
        controlRoom.addDevice(new Splitter(WaterTank.this));

        waterLevelSlider=new JSlider(JSlider.VERTICAL,0,100,50);
		waterLevelSlider.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent evt){
				controlRoom.setWaterLevel(waterLevelSlider.getValue());
			}
		});
		add(waterLevelSlider);
    }

    public static WaterTank getInstance(){
        if(waterTank==null){
            waterTank=new WaterTank();
        }
        return waterTank;
    }
}
