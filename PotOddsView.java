import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * GUI for the PotOdds/MDF calculator
 */
public class PotOddsView extends JFrame {
    /**
     * Labels for the GUI
     */
    private JLabel betAmount = new JLabel("Bet Amount To Call: ");
    private JLabel potSize = new JLabel("Pot Size (Before Bet): ");
    private JLabel potOdds = new JLabel("Pot Odds: ");
    private JLabel mdf = new JLabel("Minimum Defense Frequency: ");
    /**
     * Text fields for the GUI
     */
    private JTextField betAmountEntry = new JTextField();
    private JTextField potSizeEntry = new JTextField();
    private JTextField potOddsResults = new JTextField();
    private JTextField mdfResults = new JTextField();
    /**
     * Panels needed
     */
    private JPanel gridpanel = new JPanel();
    private JPanel fullpanel = new JPanel();
    /**
     * Button to calculate
     */
    private JButton calculateB = new JButton("Calculate");

    /**
     * Constructs the GUI using the class components
     */
    public PotOddsView()
    {

        gridpanel.setLayout(new GridLayout(5,0,20,20));
        fullpanel.setLayout(new BorderLayout(0,0));
        betAmount.setOpaque(true);
        betAmount.setFont(new Font("Serif", Font.BOLD, 20));

        potSize.setOpaque(true);
        potSize.setFont(new Font("Serif", Font.BOLD, 20));

        potOdds.setOpaque(true);
        potOdds.setFont(new Font("Serif", Font.BOLD, 20));

        mdf.setOpaque(true);
        mdf.setFont(new Font("Serif", Font.BOLD, 20));

        Dimension d = new Dimension(200,20);
        betAmountEntry.setPreferredSize(d);
        potSizeEntry.setPreferredSize(d);
        potOddsResults.setPreferredSize(d);
        mdfResults.setPreferredSize(d);

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();
        p1.add(betAmountEntry);
        p2.add(potSizeEntry);
        p3.add(potOddsResults);
        p4.add(mdfResults);
        calculateB.setAlignmentX(Component.CENTER_ALIGNMENT);
        p5.add(calculateB);

        gridpanel.add(betAmount);
        gridpanel.add(p1);
        gridpanel.add(potSize);
        gridpanel.add(p2);
        gridpanel.add(potOdds);
        gridpanel.add(p3);
        gridpanel.add(mdf);
        gridpanel.add(p4);
        fullpanel.add(gridpanel, BorderLayout.CENTER);
        fullpanel.add(p5, BorderLayout.PAGE_END);

        add(fullpanel);

        betAmountEntry.setEditable(true);
        potSizeEntry.setEditable(true);
        potOddsResults.setEditable(false);
        mdfResults.setEditable(false);

        setTitle("Pot Odds Calculator");
        setSize(550,335);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * Getters and Setters for the GUI
     */
    public JButton getCalculateB()
    {
        return calculateB;
    }

    public JTextField getBetAmountEntry()
    {
        return betAmountEntry;
    }

    public JTextField getPotSizeEntry()
    {
        return potSizeEntry;
    }

    public void setPotOddsResults(String d)
    {
        potOddsResults.setText(d);
    }
    public void setMdfResults(String d)
    {
        mdfResults.setText(d);
    }
}
