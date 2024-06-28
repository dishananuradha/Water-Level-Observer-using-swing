import javax.swing.*;
import java.awt.*;

class Device extends JFrame{

    public Device(){
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setVisible(true);
	}

    public void update(int waterLevel){
		//
	}
}
