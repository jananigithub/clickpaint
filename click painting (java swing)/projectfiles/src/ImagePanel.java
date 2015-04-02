import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Path;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class ImagePanel extends JPanel
{
    
    //public BufferedImage image=new BufferedImage(610,600, BufferedImage.TYPE_3BYTE_BGR);
    Image image1;
    Image image;
    Image open;
    public JFileChooser fileDialog;
    int a=10,b=10;
    int c=100;
    int d=100;
    int currentX;
    int currentY;
    public boolean showimage=true;
    Graphics2D gg;
    
 public ImagePanel()
 {	  
	 addMouseListener(new MouseAdapter(){
		 public void mouseClicked(MouseEvent e){
			  
			  a=e.getX();
			  b=e.getY();
			//Graphics graphics=cpanel.getGraphics();
			 if(showimage==true)
			 {
				 
				 gg.drawImage(image1,a,b,100,100,null);
				 repaint();
			 }   
			 else
			 {
				 gg.setColor(getBackground());
				 gg.fillRect(a, b, 50, 50);
				 repaint();
				 
			 }
		 }
	 }); 
   
 }
 public void set(Color c){
	  gg.setColor(c);
	  gg.fillRect(0,0,710,600);
	  repaint();
 }
 
 public void setStamp(String img) {
     image1 = new ImageIcon(((new ImageIcon(img)).getImage()).getScaledInstance(100,100,java.awt.Image.SCALE_SMOOTH)).getImage();
   }

public void zoomin()
{
	
	gg.setColor(getBackground());
	gg.fillRect(a, b, c, d);
	c=c+10;
	d=d+10;	
	gg.drawImage(image1,a,b,c,d,null);
	repaint();
}
public void zoomout()
{
	gg.setColor(getBackground());
	gg.fillRect(a, b, c, d);
	c=c-10;
	d=d-10;
	gg.drawImage(image1,a,b,c,d,null);
	repaint();
}
public void open(JPanel c)
{
    fileDialog = new JFileChooser();
    
          int returnVal = fileDialog.showOpenDialog(c);
          if (returnVal == JFileChooser.APPROVE_OPTION) {
             java.io.File file = fileDialog.getSelectedFile();
             try{
             open=ImageIO.read(file);
             gg.drawImage(open,0,0,500,500,null);
             repaint();
                }
             catch(Exception e){
                    }
             }
}

 



public void save(JPanel c)
{
	BufferedImage im = new BufferedImage(c.getWidth(), c.getHeight(), BufferedImage.TYPE_INT_ARGB);
    JFileChooser jFile = new JFileChooser();
    jFile.showSaveDialog(null);
    try{
    Path pth = jFile.getSelectedFile().toPath();
    JOptionPane.showMessageDialog(null, pth.toString());
    c.paint(im.createGraphics());
	 
	 ImageIO.write(im,"PNG", new File(pth.toString()));

	 }
	 catch(Exception e)
	 {
		 
	 }
	 }

public void paintComponent(Graphics g) {
	 
	 super.paintComponent(g);
	 if(image == null){
		 	image = createImage(getSize().width, getSize().height);
			gg = (Graphics2D)image.getGraphics();
			gg.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			//clear();

		}
		g.drawImage(image, 0, 0, null);
	    
}
}