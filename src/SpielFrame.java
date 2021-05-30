import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SpielFrame extends JFrame implements ActionListener
{
    SpielPanel sPanel;
    JButton nextButton = new JButton("Weiter");
    BorderLayout layout = new BorderLayout();

    public SpielFrame()
    {
        this.setLayout(layout);

        this.sPanel = new SpielPanel();
        this.add(BorderLayout.CENTER, this.sPanel);

        this.add(BorderLayout.SOUTH, nextButton);
        nextButton.addActionListener(this);

        this.setSize(600, 450);
        this.setLocationRelativeTo(null);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    @Override
    public void actionPerformed(ActionEvent e) 
    {
        
        if( e.getSource() == nextButton)
        {
            this.dispose();
            new SpielFrame();
        }
    }

}
