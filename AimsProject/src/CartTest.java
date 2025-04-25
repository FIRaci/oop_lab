import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class CartTest {
	public static void main(String[] args) {
		Cart cart = new Cart();
		
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3);
        
        cart.printCart();
        
        System.out.println("\n--- Search by ID ---");
        cart.searchById(dvd2.getId());
        cart.searchById(999); // not found

        System.out.println("\n--- Search by Title ---");
        cart.searchByTitle("Aladin");
        cart.searchByTitle("King");
        cart.searchByTitle("Avengers"); // not found
	}
}
