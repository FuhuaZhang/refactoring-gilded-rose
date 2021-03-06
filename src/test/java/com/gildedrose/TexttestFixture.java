package com.gildedrose;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TexttestFixture {
    public static void main(String[] args) {
        gildedTestNest();
    }

    protected static void gildedTestNest() {
        PrintStream ps = null;
        try {
            ps = new PrintStream("src/test/java/com/gildedrose/gildedTestNestResult.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.setOut(ps);
        System.out.println("OMGHAI!");

        Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20), //
                new AgedBrie(2, 0), //
                new Item("Elixir of the Mongoose", 5, 7), //
                new Sulfuras(0, 80), //
                new Sulfuras(-1, 80),
                new Backstage(15, 20),
                new Backstage(10, 49),
                new Backstage(5, 49),
                new Backstage(1, 20),
                // this conjured item does not work properly yet
                new Item("Conjured Mana Cake", 3, 6) };

        GildedRose app = new GildedRose(items);

        int days = 3;

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.update_quality();
        }
    }

}
