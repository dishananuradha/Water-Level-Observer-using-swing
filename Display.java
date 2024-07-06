import javax.swing.*;
import java.awt.*;

class Display extends JFrame implements DeviceInterface{
    private JLabel lblDisplay;
	
	public Display(JFrame watertank){
        setSize(300,100);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(new FlowLayout());
		setVisible(true);
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
