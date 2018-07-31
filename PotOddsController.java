import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Controller for the pot odds/mdf calculator frame.
 */
public class PotOddsController implements ActionListener {
    /**
     * GUI for the pot odds/mdf calculator
     */
    PotOddsView view;
    /**
     * model for the pot odds/mdf calculator
     */
    PotOddsModel model;

    /**
     * Connects the view and model to the controller and sets the controller as
     * an action listener for anything on the model
     * @param v view
     * @param m model
     */
    PotOddsController(PotOddsView v, PotOddsModel m)
    {
        view = v;
        model = m;
        view.getCalculateB().addActionListener(this);
    }

    /**
     * Checks to see if the calculate button is pressed. If it is it will send the inputs to the model as long
     * as they are valid then set the views result fields to what the model returns.
     * @param e event
     */
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource().equals(view.getCalculateB()))
        {
            try
            {
                String odds = model.calculatePotOdds(Double.parseDouble(view.getBetAmountEntry().getText()), Double.parseDouble(view.getPotSizeEntry().getText()));
                String mdf = model.calculateMDF(Double.parseDouble(view.getBetAmountEntry().getText()), Double.parseDouble(view.getPotSizeEntry().getText()));
                view.setPotOddsResults(odds);
                view.setMdfResults(mdf);
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(view,"Inputs Must Be Valid Numbers","Invalid" , JOptionPane.WARNING_MESSAGE);
            }


        }
    }
}
