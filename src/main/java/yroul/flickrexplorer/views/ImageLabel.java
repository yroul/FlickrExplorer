package yroul.flickrexplorer.views;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
/**
 * 
 * @author yroul
 *
 * Custom label for image displaying
 */
public class ImageLabel extends JLabel implements ActionListener {

	
	private static final long serialVersionUID = -4257281394875681367L;
	private BufferedImage image = null;
	private String imageId;
	private final static Logger LOGGER = Logger.getLogger(ImageLabel.class.getName());
	
	
	/**
     * Constructeur
     * @param file filename
     */
    public ImageLabel(String fileURL,String id) {
    	LOGGER.setLevel(Level.INFO);
    	try {                
            image = ImageIO.read(new URL(fileURL));
            this.setIcon(new ImageIcon(image));
            this.imageId = id;
         } catch (Exception e) {
        	 
        	
        	 try {
				image = ImageIO.read(new URL("http://l.yimg.com/g/images/photo_unavailable.gif"));
				this.setIcon(new ImageIcon(image));
				LOGGER.info("Place holder correctement ajouté");
			} catch (IOException e1) {
				LOGGER.severe("Erreur lors de la lecture de l'image : "+fileURL);
			}
         }
        
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this){
			LOGGER.info("clicked on photo !");
		}
		
	}
	/**
	 * 
	 * @return the image's flick API ID
	 */
	public String getImageId(){
		return this.imageId;
	}
   
}
