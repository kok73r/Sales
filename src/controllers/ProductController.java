package controllers;

import models.Product;
import views.SalesView;

import static utils.Rounder.roundUp;

public class ProductController {

    protected Product model;
    SalesView view;

    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();
        String name = model.getName();
        double income = model.calculateIncome();
        String incomes = roundUp(income);

        double tax = model.calculateTax(income);
        String taxes = roundUp(tax);

        double getIncome = model.calculateIncome(income, tax);
        String getIncomes = roundUp(getIncome);

        String output = "Name product: " + name + "\n"
                + "Total profit(grn): " + incomes + "\n"
                + "Tax amount(grn): " + taxes + "\n"
                + "Net profit(grn): " + getIncomes;

        view.getOutput(output);
    }
}
