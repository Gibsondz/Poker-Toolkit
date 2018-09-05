import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Controller for the tourney timer frame.
 */
public class TourneyTimerController implements ActionListener
{
    /**
     * GUI for the timer
     */
    private TourneyTimerView view;
    /**
     * model for the timer
     */
    private TourneyTimerModel model;
    /**
     * seconds the timer uses
     */
    private int seconds ;

    /**
     * Connects the view and model to the controller and sets the controller as an
     * action listener for anything on the model
     * @param v view
     * @param m model
     */
    TourneyTimerController(TourneyTimerView v, TourneyTimerModel m)
    {
        view = v;
        model = m;
        v.getEnterTimeButton().addActionListener(this);
    }

    /**
     * Checks to see if the EnterTimer button is pressed. If it is it will ask the user for a time input
     * of the form MM:SS. If the time input is valid it will start a timer that will count down from
     * the user input all the way to 0.
     * @param e event
     */
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource().equals(view.getEnterTimeButton()))
        {
           String time =  JOptionPane.showInputDialog(view, "Please Enter A Time (MM:SS): ", "Enter Time", JOptionPane.QUESTION_MESSAGE);
           if(model.checkInput(time) == false)
           {
               JOptionPane.showMessageDialog(view, "Invalid Input: Must Be In MM:SS Format", "Invalid", JOptionPane.WARNING_MESSAGE);
           }
           else
           {
                seconds = model.convertToTotalSeconds(time);
                Timer timer = new Timer();
                int delay = 1000;
                int period = 1000;
                timer.scheduleAtFixedRate(new TimerTask() {
                    public void run()
                    {
                        if(seconds >= 0)
                        {
                            view.getTimer().setText(model.convertToString(seconds));
                            System.out.println(model.convertToString(seconds));
                            seconds--;
                        }
                        else
                        {
                            timer.cancel();
                        }

                    }
                }, delay, period);


           }
        }
    }
}
