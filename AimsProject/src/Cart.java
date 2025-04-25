import java.util.ArrayList;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<DigitalVideoDisc> itemsOrdered = new ArrayList<DigitalVideoDisc>();
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
        for (DigitalVideoDisc disc : dvdList) {
            if (qtyOrdered < MAX_NUMBERS_ORDERED) {
                itemsOrdered.add(disc);
                qtyOrdered++;
                System.out.println("Đĩa đã được thêm vào");
            } else {
                System.out.println("Giỏ hàng đã đầy");
            }
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (itemsOrdered.remove(disc)) {
            qtyOrdered--;
            System.out.println("Đĩa đã được gỡ bỏ");
        } else {
            System.out.println("Không tìm thấy đĩa để xóa");
        }
    }

    public float totalCost() {
        float total = 0;
        for (DigitalVideoDisc disc : itemsOrdered) {
            total += disc.getCost();
        }
        return total;
    }

    public ArrayList<DigitalVideoDisc> getItemsOrdered() {
        return itemsOrdered;
    }

    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        int index = 1;
        for (DigitalVideoDisc disc : itemsOrdered) {
            System.out.println(index++ + ". " + disc.toString());
        }
        System.out.printf("Total cost: %.2f $\n", totalCost());
        System.out.println("***************************************************");
    }

    public void searchById(int id) {
        boolean found = false;
        for (DigitalVideoDisc disc : itemsOrdered) {
            if (disc.getId() == id) {
                System.out.println("Found DVD: " + disc.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No DVD found with ID " + id);
        }
    }

    public void searchByTitle(String title) {
        boolean found = false;
        for (DigitalVideoDisc disc : itemsOrdered) {
            if (disc.isMatch(title)) {
                System.out.println("Found DVD: " + disc.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No DVD found with title matching \"" + title + "\"");
        }
    }

    public int getQtyOrdered() {
        return this.qtyOrdered;
    }
}
