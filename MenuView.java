import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Class simply provides the GUI for the main menu of the poker toolkit
 */
public class MenuView extends JFrame
{

    /**
     * Menu header
     */
    private JLabel header = new JLabel("Poker Toolkit", SwingConstants.CENTER);

    /**
     * Button that opens the pot odds calculation frame
     */
    private JButton potoddsB = new JButton("Calculate Pot Odds/MDF");

    /**
     * Puts together the GUI using the class components
     */
    public MenuView()
    {
        setLayout(new GridLayout(2,0));
        header.setOpaque(true);
        header.setBackground(Color.GRAY);
        header.setFont(new Font("Serif", Font.BOLD, 55));
        potoddsB.setFont(new Font("Serif", Font.BOLD, 35));
        add(header);
        add(potoddsB);
        setTitle("Poker Toolkit");
        setSize(500,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * Getter for the potodds button
     * @return the pot odds button
     */
    public JButton getPotoddsB()
    {
        return potoddsB;
    }

    public static void main(String args[])
    {
        MenuController menu = new MenuController(new MenuView());
    }
}
