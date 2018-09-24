package Q1.pubV0;


public class Pub {

    public int computeCost(String drink, boolean student, int amount) {
        Drinks drinks = new Drinks();
        if (amount > 2 && (drink == Drinks.GT || drink == Drinks.BACARDI_SPECIAL)) {
            throw new RuntimeException("Too many drinks, max 2.");
        }
        int price = drinks.getPrice(drink);
        if (student && (drink == Drinks.ONE_CIDER || drink == Drinks.ONE_BEER || drink == Drinks.A_PROPER_CIDER)) {
            price = price - price/10;
        }
        return price*amount;
    }
}
