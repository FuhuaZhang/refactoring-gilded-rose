package com.gildedrose;

public class Item {

    public String name;

    public int sell_in;

    public int quality;

    public Item(String name, int sell_in, int quality) {
        this.name = name;
        this.sell_in = sell_in;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sell_in + ", " + this.quality;
    }

    void updateQualityAndSellIn() {
        updateQuality();

        updateSellIn();

        updateQualityAfterExpiration();
    }

    protected void updateQualityAfterExpiration() {
        if (sell_in < 0) {
            if (quality > 0) {
                quality = quality - 1;
            }
        }
    }

    protected void updateSellIn() {
        sell_in = sell_in - 1;
    }

    protected void updateQuality() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }
}
