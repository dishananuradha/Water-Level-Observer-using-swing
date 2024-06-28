import javax.swing.*;
import java.awt.*;

class Alarm extends Device{
    private JLabel lblAlarm;
	
	public Alarm(){
		lblAlarm=new JLabel("  ");
		lblAlarm.setFont(new Font("",1,25));
		add(lblAlarm);
	}

	public void update(int waterLevel){
		lblAlarm.setText(waterLevel>=50 ? "Alarm ON":"Alarm OFF");
	}
}
