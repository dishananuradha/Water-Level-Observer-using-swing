import javax.swing.*;
import java.awt.*;

class Alarm extends JFrame implements DeviceInterface{
    private JLabel lblAlarm;
	
	public Alarm(JFrame watertank){
        setSize(300,100);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(new FlowLayout());
		setVisible(true);
        setTitle("Alarm");
        int xOffset = 300;
        int yOffset = 150;
        Point parentLocation = watertank.getLocation();
        setLocation(parentLocation.x + xOffset, parentLocation.y + yOffset);

        lblAlarm=new JLabel("  ");
		lblAlarm.setFont(new Font("",1,25));
		add(lblAlarm);
	}

	public void update(int waterLevel){
		lblAlarm.setText(waterLevel>=50 ? "Alarm ON":"Alarm OFF");
	}
}
