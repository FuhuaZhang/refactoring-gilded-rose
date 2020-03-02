package com.gildedrose;

public class Backstage extends Item {
    public Backstage(int sell_in, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sell_in, quality);
    }

    @Override
    protected void updateQuality() {
        if (quality < 50) {
            quality = quality + 1;
            if (sell_in < 11) {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }

            if (sell_in < 6) {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }
        }
    }

    @Override
    protected void updateSellIn() {
        sell_in = sell_in - 1;
    }

    @Override
    protected void updateQualityAfterExpiration() {
        if (sell_in < 0) {
            quality = 0;
        }
    }
}
