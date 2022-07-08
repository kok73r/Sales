package views;


import models.Product;

import java.util.Scanner;

import static utils.Validator.*;


public class SalesView {

    String title;

    protected Product model;
    Scanner scanner;

    public SalesView(Product model) {
        this.model = model;
    }

    public void getInputs() {

        scanner = new Scanner(System.in);
        title = "Введите наименование товара: ";
        System.out.println(title);
        model.setName(validateName(scanner));

        title = "Введите количество: ";
        System.out.println(title);
        model.setQuantity(validateQuantityInput(scanner));

        title = "Введите цену: ";
        System.out.println(title);
        model.setPrice(validatePriceInput(scanner));

        scanner.close();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
