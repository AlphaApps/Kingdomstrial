import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

public class SpielPanel extends JPanel implements MouseListener
{
    private int mx = 10;
	private int my = 10;
    private Image img;

    SpielPanel ()
    {
        this.addMouseListener(this);
        URL dateiname = getClass().getResource("/image/background.png");
        img = Toolkit.getDefaultToolkit().getImage(dateiname);
        repaint();
    }

    @Override
    public void paint(Graphics gr) 
    {
        super.paint(gr);
        gr.drawImage(img, mx, my, null);
    }

    @Override
    public void mouseClicked(MouseEvent e) 
    {
        
        
    }

    @Override
    public void mousePressed(MouseEvent e) 
    {
        
        
    }

    @Override
    public void mouseReleased(MouseEvent e) 
    {
        
        
    }

    @Override
    public void mouseEntered(MouseEvent e) 
    {
        
        
    }

    @Override
    public void mouseExited(MouseEvent e) 
    {
        
        
    }
    
}
