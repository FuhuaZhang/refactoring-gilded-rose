package com.gildedrose;

public class AgedBrie extends Item {
    public AgedBrie(int sell_in, int quality) {
        super("Aged Brie", sell_in, quality);
    }

    @Override
    public boolean isAgedBrie() {
        return true;
    }

    @Override
    protected void updateQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }

    @Override
    protected void updateSellIn() {
        sell_in = sell_in - 1;
    }

    @Override
    protected void updateQualityAfterExpiration() {
        if (sell_in < 0) {
            if (quality < 50) {
                quality = quality + 1;
            }
        }
    }
}
