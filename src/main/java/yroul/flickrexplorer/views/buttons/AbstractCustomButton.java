package yroul.flickrexplorer.views.buttons;

import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public abstract class AbstractCustomButton extends JButton {

	

	private static final long serialVersionUID = 8682243322390635833L;

	public AbstractCustomButton(String iconeName,String text) {
		super();
		this.setText(text);
		this.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("images/"+iconeName))));
		
	}
	
}
