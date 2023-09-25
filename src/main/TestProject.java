package main;

import java.io.Console;
import java.util.Base64;
import model.Extension;

public class TestProject {

    public static void main(String[] args) {

        String originalString = "Lương Xuân Hùng";
//        Hello, World!
        // Mã hoá chuỗi thành mảng byte
        byte[] encodedBytes = Extension.encodeToBytes(originalString);

        // Mã hoá chuỗi thành chuỗi đã được mã hoá
        String encodedString = Extension.encodeToString(originalString);

        // Giải mã chuỗi từ chuỗi đã được mã hoá
        String decodedString = Extension.decodeToString(encodedString);

        // Giải mã mảng byte thành chuỗi
        String decodedBytes = Extension.decodeToBytes(encodedBytes);

        System.out.println("Original String: " + originalString);
        System.out.println("Encoded Bytes: " + new String(encodedBytes));
        System.out.println("Encoded String: " + encodedString);
        System.out.println("Decoded String: " + decodedString);
        System.out.println("Decoded Bytes: " + decodedBytes);
    }

}
