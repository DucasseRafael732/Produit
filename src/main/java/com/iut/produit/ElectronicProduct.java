package com.iut.produit;

class ElectronicProduct extends AbstractProduct {
    private String elbrand;

    protected ElectronicProduct(String name, double cost, String brand) {
        super(name, cost);
        this.elbrand = brand;
    }

    public String getBrand() {
        return elbrand;
    }

    @Override
    public double CalculatePrice() {
        // Complexité cyclomatique élevée (calcul compliqué)
        double price = getCost() * 2.0;
        for (int i = 0; i < 100; i++) {
            price += i;
        }
        return price;
    }
}
