import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class Store {
    private static final int MAX_NUMBERS_IN_STORE = 100;
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_NUMBERS_IN_STORE];
    private int qtyInStore = 0;

    public void addDVD(DigitalVideoDisc dvd) {
        if (qtyInStore < MAX_NUMBERS_IN_STORE) {
            itemsInStore[qtyInStore++] = dvd;
            System.out.println("DVD đã được thêm vào kho.");
        } else {
            System.out.println("Kho đã đầy. Không thể thêm DVD mới.");
        }
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        boolean found = false;
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i] != null && itemsInStore[i].equals(dvd)) {
                // Dịch các phần tử còn lại về trước
                for (int j = i; j < qtyInStore - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[--qtyInStore] = null;
                found = true;
                System.out.println("DVD đã được gỡ khỏi kho.");
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy DVD trong kho.");
        }
    }

    public void printStore() {
        System.out.println("********** STORE **********");
        for (int i = 0; i < qtyInStore; i++) {
            System.out.printf("%d. %s\n", i + 1, itemsInStore[i].toString());
        }
        System.out.println("***************************");
    }
}
