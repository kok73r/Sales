package utils;

import java.io.BufferedReader;
import java.io.IOException;

public class Validator {
    public static String validateName(BufferedReader reader) throws IOException {
        String str = reader.readLine().trim();
        while (str.isEmpty()) {
            System.out.println("Пусто! Введите наименование товара: ");
            str = reader.readLine().trim();
        }
        return str;
    }

    public static int validateQuantityInput(BufferedReader reader) {

        int quantity;
        String str = null;
        try {
            str = reader.readLine();
            quantity = Integer.parseInt(str);
            if (quantity <= 0) {
                System.out.printf("\"%s\" - не валидное число!\n", str);
                System.out.println("Введите количество!: ");
                return validateQuantityInput(reader);
            }
            return quantity;
        } catch (Exception e) {
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.println("Введите количество!: ");
            return validateQuantityInput(reader);
        }
    }

    public static float validatePriceInput(BufferedReader reader) {
        int price;
        String str = null;
        try {
            str = reader.readLine();
            price = Integer.parseInt(str);
            if (price <= 0) {
                System.out.printf("\"%s\" - не валидное число!\n", str);
                System.out.println("Введите количество!: ");
                return validatePriceInput(reader);
            }
            return price;
        } catch (Exception e) {
            System.out.printf("\"%s\" - не число!\n", str);
            System.out.println("Введите количество!: ");
            return validatePriceInput(reader);
        }
    }
}