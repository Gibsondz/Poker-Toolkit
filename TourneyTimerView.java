import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * GUI for the Tourney Timer
 */
public class TourneyTimerView extends JFrame{
    /**
     * Title, Timer label, and Button for the basic timer.
     */
    private JLabel title = new JLabel("Tournament Timer", SwingConstants.CENTER);
    private JLabel timer = new JLabel("", SwingConstants.CENTER);
    private JButton enterTimeButton = new JButton("Set Time");

    /**
     * Constructs the GUI using class components
     */
    public TourneyTimerView()
    {
        JPanel timerpanel = new JPanel();
        timerpanel.setLayout(new BorderLayout());

        timerpanel.add(title, BorderLayout.PAGE_START);
        timerpanel.add(timer, BorderLayout.CENTER);
        timerpanel.add(enterTimeButton, BorderLayout.PAGE_END);

        timer.setFont(new Font("Serif", Font.BOLD, 125));

        this.add(timerpanel);


        setSize(400,200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * getters and setters for components
     */
    public JButton getEnterTimeButton()
    {
        return enterTimeButton;
    }
    public JLabel getTimer()
    {
        return timer;
    }
}
