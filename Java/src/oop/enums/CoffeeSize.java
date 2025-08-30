package oop.enums;

public enum CoffeeSize {
    SMALL(49), MEDIUM(79), LARGE(99);

    private final double price;
    CoffeeSize (double price) {
        this.price= price;
    }

    public double getPrice() {
        return price;
    }
}

