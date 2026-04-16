package hust.soict.globalict.test.store;

import hust.soict.globalict.aims.store.Store;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class StoreTest {
    public static void main(String[] args) {
        // Tạo một kho hàng
        Store store = new Store();

        // Tạo vài cái đĩa
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);

        // Thử thêm đĩa vào kho
        store.addDVD(dvd1);
        store.addDVD(dvd2);

        // Thử xóa đĩa khỏi kho
        store.removeDVD(dvd1);
        
        // Thử xóa đĩa không có trong kho
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        store.removeDVD(dvd3);
    }
}