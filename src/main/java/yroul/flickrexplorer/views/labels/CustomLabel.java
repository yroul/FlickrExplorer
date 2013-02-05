package yroul.flickrexplorer.views.labels;

import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public  class CustomLabel extends JLabel {

	
	private static final long serialVersionUID = -6947109896152203455L;

	public CustomLabel(String iconeName) {
		super();
		this.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("images/flickr_logo.png"))));
	}
	
}
