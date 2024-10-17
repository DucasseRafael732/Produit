package com.iut.produit;

abstract  class AbstractProduct {

    private String prname;
    private double prcost;

    public AbstractProduct(String name, double cost) {
        this.prname = name;
        this.prcost = cost;
    }

    public double getCost() {
        return prcost;
    }

    public double calculatePrice() {
        // Exception non gérée (division par zéro)
        return prcost / 0;
    }

}
