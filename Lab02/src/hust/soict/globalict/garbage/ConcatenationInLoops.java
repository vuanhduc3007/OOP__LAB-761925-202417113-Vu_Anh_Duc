package hust.soict.globalict.garbage;

import java.util.Random;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        Random r = new Random(123);
        
        // CÁCH 1: Nối chuỗi bằng dấu "+" (Cực kỳ rùa bò)
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 65536; i++) {
            s += r.nextInt(2);
        }
        System.out.println("Thời gian nối bằng dấu + : " + (System.currentTimeMillis() - start) + " ms"); // Có thể mất vài giây [cite: 896]
        
        // CÁCH 2: Nối chuỗi bằng StringBuilder (Nhanh như chớp)
        r = new Random(123);
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 65536; i++) {
            sb.append(r.nextInt(2));
        }
        s = sb.toString();
        System.out.println("Thời gian nối bằng StringBuilder: " + (System.currentTimeMillis() - start) + " ms"); // Chỉ mất vài mili-giây [cite: 924]
    }
}