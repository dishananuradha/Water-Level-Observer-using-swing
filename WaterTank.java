import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

class WaterTank extends JFrame{
    private JSlider waterLevelSlider;

    public WaterTank(ControlRoomInterface controlRoom){
        setTitle("Water Tank");
        setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());

        waterLevelSlider=new JSlider(JSlider.VERTICAL,0,100,50);
		waterLevelSlider.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent evt){
				controlRoom.updateDevices(waterLevelSlider.getValue());
			}
		});
		add(waterLevelSlider);
    }
}
