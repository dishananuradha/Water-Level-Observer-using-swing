import javax.swing.*;
import java.awt.*;

class Display extends Device{
    private JLabel lblDisplay;
	
	public Display(JFrame watertank){
        setTitle("Display");
		lblDisplay=new JLabel("  ");
		lblDisplay.setFont(new Font("",1,25));
        int xOffset = 300;
        int yOffset = 0;
        Point parentLocation = watertank.getLocation();
        setLocation(parentLocation.x + xOffset, parentLocation.y + yOffset);
		add(lblDisplay);
	}
    
	public void update(int waterLevel){
		lblDisplay.setText(String.valueOf(waterLevel));
	}
}
