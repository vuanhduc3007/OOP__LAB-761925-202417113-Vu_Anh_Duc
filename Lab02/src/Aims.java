public class Aims {
    public static void main(String[] args) {
        // Tạo một giỏ hàng mới
        Cart anOrder = new Cart();

        // Tạo các đối tượng DVD mới và thêm vào giỏ
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        // In ra tổng tiền của các mặt hàng trong giỏ
        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalCost());

        // Kiểm tra chức năng xóa (Mục 13)
        System.out.println("\nRemoving Star Wars...");
        anOrder.removeDigitalVideoDisc(dvd2);
        System.out.println("Total Cost after removing is: " + anOrder.totalCost());
    }
}