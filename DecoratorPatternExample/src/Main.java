import interfaces.IceCream;
import model.BasicIceCream;
import model.MintIceCream;
import model.VanillaIceCream;

public class Main {
    public static void main(String[] args) {

        IceCream basicIceCream = new BasicIceCream();
        System.out.println("Basic Ice-cream cost: " + basicIceCream.cost() + "$");

        // Add Vanilla to the order
        IceCream vanilla = new VanillaIceCream(basicIceCream);  //wrapping basic Ice-cream with vanilla
        System.out.println("Adding Vanilla, cost is: " + vanilla.cost() + "$");

        // Add Mint to the order
        IceCream mint = new MintIceCream(vanilla);  //wrapping vanilla Ice-cream with mint
        System.out.println("Adding Mint, cost is: " + mint.cost() + "$");
    }
}
