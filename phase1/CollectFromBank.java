package phase1;

public class CollectFromBank extends ActionCard {

    public CollectFromBank(String description, boolean toAll) {
        super(description, toAll);
    }

    @Override
    public void activate() {

        System.out.println("collected from bank");
    }

}
