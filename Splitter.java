import javax.swing.*;
import java.awt.*;

class Splitter extends Device{
    private JLabel lblSplitter;
	
	public Splitter(JFrame watertank){
        setTitle("Splitter");
		lblSplitter=new JLabel("  ");
		lblSplitter.setFont(new Font("",1,25));
        int xOffset = 300;
        int yOffset = 300;
        Point parentLocation = watertank.getLocation();
        setLocation(parentLocation.x + xOffset, parentLocation.y + yOffset);
		add(lblSplitter);
	}

	public void update(int waterLevel){
		lblSplitter.setText(waterLevel>=75 ? "Splitter ON":"Splitter OFF");
	}
}
