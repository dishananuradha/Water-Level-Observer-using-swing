import javax.swing.*;
import java.awt.*;

class Alarm extends Device{
    private JLabel lblAlarm;
	
	public Alarm(JFrame watertank){
        setTitle("Alarm");
		lblAlarm=new JLabel("  ");
		lblAlarm.setFont(new Font("",1,25));
        int xOffset = 300;
        int yOffset = 150;
        Point parentLocation = watertank.getLocation();
        setLocation(parentLocation.x + xOffset, parentLocation.y + yOffset);
		add(lblAlarm);
	}

	public void update(int waterLevel){
		lblAlarm.setText(waterLevel>=50 ? "Alarm ON":"Alarm OFF");
	}
}
