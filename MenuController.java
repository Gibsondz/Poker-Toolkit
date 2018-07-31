import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Controller for the main menu of the program
 */
public class MenuController implements ActionListener
{
    /**
     * The GUI for the main menu
     */
    MenuView view;

    /**
     * Connects the GUI to the controller and sets the controller as the action listener
     * for the main menu buttons.
     * @param view GUI of main menu
     */
    public MenuController(MenuView view)
    {
        this.view = view;
        view.getPotoddsB().addActionListener(this);
    }

    /**
     * Checks to see which button is pressed and opens the corrisponding frame.
     * @param e event that was given
     */
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource().equals(view.getPotoddsB()))
        {
            PotOddsController potodds = new PotOddsController(new PotOddsView(), new PotOddsModel());
        }
    }


}
