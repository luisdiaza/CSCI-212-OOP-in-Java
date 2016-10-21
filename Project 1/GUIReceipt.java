import java.awt.*;
import javax.swing.*;

public class GUIReceipt {
	
public GUIReceipt(String[] receipt, int count){
	JFrame Window = new JFrame("GUI");
	Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Window.setSize(100,100);
	Window.setLocation(100,100); 
	
	Container holder = Window.getContentPane();
	TextArea text = new TextArea(); 
	holder.add(text);
	
	
	for (int i = 0; i < count; i++){
		text.append(receipt[i]);
	}
	
	Window.setVisible(true);
	
	}
}
