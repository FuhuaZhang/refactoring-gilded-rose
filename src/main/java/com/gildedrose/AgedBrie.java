package com.gildedrose;

public class AgedBrie extends Item {
    public AgedBrie(int sell_in, int quality) {
        super("Aged Brie", sell_in, quality);
    }

    @Override
    public boolean isAgedBrie() {
        return true;
    }
}
