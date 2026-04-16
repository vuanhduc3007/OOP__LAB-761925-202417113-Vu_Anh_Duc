package hust.soict.globalict.aims;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.cart.Cart;;

public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addMedia(dvd3);

        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalCost());

        System.out.println("\nRemoving Star Wars...");
        anOrder.removeMedia(dvd2);
        System.out.println("Total Cost after removing is: " + anOrder.totalCost());

    }
}