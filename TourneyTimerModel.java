import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.Timer;

/**
 * Model for the tourney timer. Provides all conversions needed for the timer to work
 */
public class TourneyTimerModel {
    /**
     * Checks the string that the user inputed into the program making sure it fits the MM:SS required format.
     * @param input of the user
     * @return true if it fits the MM:SS criteria or false if it does not.
     */
    public boolean checkInput(String input)
    {
        if(input.length() != 5 || input.charAt(2) != ':')
        {
            return false;
        }
        try
        {
            int minutes = getMinutes(input);
            int seconds = getSeconds(input);
            if(minutes < 60 && seconds < 60 && minutes >= 0 && seconds >=0)
            {
                return true;
            }
        }
        catch(NumberFormatException e)
        {
            return false;
        }
        return false;
    }

    /**
     * Converts seconds to a string in the form of (M)M:SS
     * @param seconds
     * @return String in the form of (M)M:SS
     */
    public String convertToString(int seconds)
    {
        int minutes = seconds / 60;
        int leftover = seconds % 60;
        if(Integer.toString(leftover).length() == 1)
        {
            return minutes + ":0" + leftover;
        }
        return minutes + ":" + leftover;
    }

    /**
     * Converts user input to a total amount of seconds to count down.
     * @param input from user
     * @return total amount of seconds based on input.
     */
    public int convertToTotalSeconds(String input)
    {
        return getMinutes(input)*60 + getSeconds(input);
    }

    /**
     * Analyses a correct user input (MM:SS) and returns the minutes of the string.
     * @param input from user
     * @return minutes from string
     */
    public int getMinutes(String input)
    {
        return Integer.parseInt(String.valueOf(input.charAt(0)) + String.valueOf(input.charAt(1)));
    }
    /**
     * Analyses a correct user input (MM:SS) and returns the seconds of the string.
     * @param input from user
     * @return seconds from string
     */
    public int getSeconds(String input)
    {
        return Integer.parseInt(String.valueOf(input.charAt(3)) + String.valueOf(input.charAt(4)));
    }
}
