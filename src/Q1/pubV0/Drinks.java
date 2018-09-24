package Q1.pubV0;

import java.util.HashMap;

public class Drinks {
    private HashMap<String, Integer> listaDrinks = new HashMap<>();
    public static final String ONE_BEER = "hansa";
    public static final String ONE_CIDER = "grans";
    public static final String A_PROPER_CIDER = "strongbow";
    public static final String GT = "gt";
    public static final String BACARDI_SPECIAL = "bacardi_special";

   public Drinks(){
       listaDrinks.put(ONE_BEER, 74);
       listaDrinks.put(ONE_CIDER, 103);
       listaDrinks.put(A_PROPER_CIDER, 110);
       listaDrinks.put(GT, 115);
       listaDrinks.put(BACARDI_SPECIAL, 170);
   }
    public int getPrice(String drink){
       int price;
       if(listaDrinks.containsKey(drink)){
            price = listaDrinks.get(drink);
       }
       else
           throw new RuntimeException("No such drink exists");
       return price;
    }
}
