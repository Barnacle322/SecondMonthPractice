import com.company.pizza.LaFinta;
import com.company.pizza.Margarita;
import com.company.pizza.Pepperoni;

class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Pepperoni pepperoni1 = new Pepperoni(400, 1000, "1 hour", true);
        Pepperoni pepperoni2 = new Pepperoni(300, 800, "45 minutes", false);
        System.out.println(pepperoni1);
        System.out.println(pepperoni1.getCookTime());
        System.out.println(pepperoni1.send());
        System.out.println("");
        System.out.println(pepperoni2);
        System.out.println(pepperoni2.getCookTime());
        System.out.println(pepperoni2.send());
        System.out.println("");
        Margarita margarita1 = new Margarita(350, 900, "40 minutes", false);
        Margarita margarita2 = new Margarita(400, 1100, "1 hour and 10 minutes", true);
        System.out.println(margarita1);
        System.out.println(margarita1.getCookTime());
        System.out.println(margarita1.send());
        System.out.println("");
        System.out.println(margarita2);
        System.out.println(margarita2.getCookTime());
        System.out.println(margarita2.send());
        System.out.println("");
        LaFinta laFinta1 = new LaFinta(500, 1200, "1 hour and 30 monutes", true);
        LaFinta laFinta2 = new LaFinta(450, 1100, "1 hour and 10 monutes", false);
        System.out.println(laFinta1);
        System.out.println(laFinta1.getCookTime());
        System.out.println(laFinta1.send());
        System.out.println("");
        System.out.println(laFinta2);
        System.out.println(laFinta2.getCookTime());
        System.out.println(laFinta2.send());
    }
}