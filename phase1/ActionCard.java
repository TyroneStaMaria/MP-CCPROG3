package phase1;

/**
 * implements an Action Card that has a description a cash value and a type. It
 * also has a boolean toAll which sets whether the cash value will be
 * distributed to all.
 */

public class ActionCard extends Card {
    private String description;
    private boolean toAll;
    private double value;
    private int type;

    /**
     * Creates an action card object with the specified type
     * 
     * @param type type will either be 1 (collect from the bank), 2 (pay the bank),
     *             3 (Collect from the player), or 4 (pay player).
     */
    public ActionCard(String description, boolean toAll) {
        super("Action Card");
        this.description = description;
        this.toAll = toAll;
        this.value = 1000 * ((int) (Math.random() * 9) + 1); // multiply 100 to a number (1-100)

    }

    /**
     * returns the description of the action card
     * 
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * returns the cash value of the action card
     * 
     * @return value
     */

    public double getValue() {
        return this.value;
    }

    /**
     * returns the type of the action card
     * 
     * @return type
     */

    public int getType() {
        return this.type;
    }

    public String getTypeToString() {

        switch (this.type) {
            case 1:
                return "Collect From Bank";
            case 2:
                return "Pay from Bank";
            case 3:
                return "Collect From Player";
            case 4:
                return "Pay Player";
            default:
                return "Unknown";
        }
    }

    public void activate() {
        System.out.println();
    }

    /**
     * returns whether the boolean toAll of the action card
     * 
     * @return toAll
     */

    public boolean getToAll() {
        return this.toAll;
    }

}
