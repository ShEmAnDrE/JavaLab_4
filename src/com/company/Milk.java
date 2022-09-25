package com.company;

public class Milk implements Priceable{
    float fatContent;
    int price;

    public Milk(float fatContent, int price) {
        this.fatContent = fatContent;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public double getFatContent() {
        return fatContent;
    }

    public void setFatContent(float fatContent) {
        this.fatContent = fatContent;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
