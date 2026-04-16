package hust.soict.globalict.aims;

import java.util.Scanner;
import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.store.Store;

public class Aims {
    private static Store store = new Store();
    private static Cart cart = new Cart();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        store.addMedia(new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f));
        store.addMedia(new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f));
        store.addMedia(new DigitalVideoDisc("Aladin", "Animation", 18.99f));

        int choice;
        do {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Bỏ qua ký tự enter

            switch (choice) {
                case 1:
                    viewStore();
                    break;
                case 2:
                    updateStore();
                    break;
                case 3:
                    seeCurrentCart();
                    break;
                case 0:
                    System.out.println("Cảm ơn bạn đã sử dụng AIMS. Hẹn gặp lại!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 0);
    }

    // --- MENU CHÍNH ---
    public static void showMenu() {
        System.out.println("\nAIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store (Xem cửa hàng)");
        System.out.println("2. Update store (Cập nhật cửa hàng)");
        System.out.println("3. See current cart (Xem giỏ hàng)");
        System.out.println("0. Exit (Thoát)");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: 0-1-2-3: ");
    }

    // --- 1. XEM CỬA HÀNG ---
    public static void viewStore() {
        // (Tạm thời bỏ qua in danh sách chi tiết kho hàng để code ngắn gọn)
        System.out.println("\n--- DANH SÁCH CỬA HÀNG ---");
        int choice;
        do {
            storeMenu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Chức năng đang hoàn thiện...");
                    break;
                case 2:
                    System.out.println("Chức năng đang hoàn thiện...");
                    break;
                case 3:
                    System.out.println("Chức năng đang hoàn thiện...");
                    break;
                case 4:
                    seeCurrentCart();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 0);
    }

    public static void storeMenu() {
        System.out.println("\nOptions: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media's details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: 0-1-2-3-4: ");
    }

    // --- 2. CẬP NHẬT CỬA HÀNG ---
    public static void updateStore() {
        System.out.println("\nChức năng thêm/xóa đồ trong kho (Đang phát triển).");
    }

    // --- 3. XEM GIỎ HÀNG ---
    public static void seeCurrentCart() {
        cart.print();
        int choice;
        do {
            cartMenu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Chức năng lọc...");
                    break;
                case 2:
                    sortCart();
                    break;
                case 3:
                    System.out.println("Chức năng xóa đồ khỏi giỏ...");
                    break;
                case 4:
                    System.out.println("Chức năng Play nhạc...");
                    break;
                case 5:
                    System.out.println("An order is created! (Đơn hàng đã được tạo)."); //
                    cart = new Cart(); // Làm trống giỏ hàng
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 0);
    }

    public static void cartMenu() {
        System.out.println("\nOptions: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter media in cart");
        System.out.println("2. Sort media in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: 0-1-2-3-4-5: ");
    }

    public static void sortCart() {
        System.out.println("1. Sort by Title");
        System.out.println("2. Sort by Cost");
        int sortChoice = scanner.nextInt();
        if (sortChoice == 1) {
            cart.sortByTitleCost();
        } else if (sortChoice == 2) {
            cart.sortByCostTitle();
        }
        cart.print();
    }
}