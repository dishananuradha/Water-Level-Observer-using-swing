import javax.swing.*;
import java.awt.*;

class Display extends Device{
    private JLabel lblDisplay;
	
	public Display(){
		lblDisplay=new JLabel("  ");
		lblDisplay.setFont(new Font("",1,25));
		add(lblDisplay);
	}
    
	public void update(int waterLevel){
		lblDisplay.setText(String.valueOf(waterLevel));
	}
}
