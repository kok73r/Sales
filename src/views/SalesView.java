package views;

import models.Product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static utils.Validator.*;


public class SalesView {

    String title;
    protected Product model;

    public SalesView(Product model) {
        this.model = model;
    }

    public void getInputs() {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            title = "Введите наименование товара: ";
            System.out.println(title);
            model.setName(validateName(reader));

            title = "Введите количество: ";
            System.out.println(title);
            model.setQuantity(validateQuantityInput(reader));

            title = "Введите цену: ";
            System.out.println(title);
            model.setPrice(validatePriceInput(reader));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
