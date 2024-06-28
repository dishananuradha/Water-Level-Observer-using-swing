import javax.swing.*;
import java.awt.*;

class Splitter extends Device{
    private JLabel lblSplitter;
	
	public Splitter(){
		lblSplitter=new JLabel("  ");
		lblSplitter.setFont(new Font("",1,25));
		add(lblSplitter);
	}

	public void update(int waterLevel){
		lblSplitter.setText(waterLevel>=75 ? "Splitter ON":"Splitter OFF");
	}
}
