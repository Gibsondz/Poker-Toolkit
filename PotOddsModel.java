import java.text.DecimalFormat;

/**
 * Model for the pot odds/mdf calculator gui. Provides all the mathematics functions needed.
 */
public class PotOddsModel {
    /**
     * Calculates the pot odds using the bet amount and pot size before the bet.
     * Returns it as a string in the form of xx.xx%
     * @param betamount
     * @param potsize
     * @return pot odds percentage
     */
    public String calculatePotOdds(double betamount, double potsize)
    {
        double totalpot = betamount*2 + potsize;
        double potodds = betamount / totalpot;
        return cleanDouble(potodds);
    }

    /**
     * Takes a double decimal percentage and returns at as a string in the form of xx.xx%
     * @param d decimal
     * @return percentage
     */
    public String cleanDouble(double d)
    {
        d *= 100;
        double rounded = Double.parseDouble(new DecimalFormat("##.##").format(d));
        return Double.toString(rounded) + "%";
    }

    /**
     * Calculates the MDF using the bet amound and pot size before the bet.
     * Returns it as a  string in the form of xx.xx%
     * @param betamount
     * @param potsize
     * @return MDF percentage
     */
    public String calculateMDF(double betamount, double potsize)
    {
        double mdf = potsize / (potsize + betamount);
        return cleanDouble(mdf);
    }
}
