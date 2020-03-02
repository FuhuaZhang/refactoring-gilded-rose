package com.gildedrose;

import com.google.common.io.Files;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static com.google.common.base.Charsets.UTF_8;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class GildedRoseTest {

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 1, 5) };
        GildedRose app = new GildedRose(items);
        app.update_quality();
        assertEquals("foo", app.items[0].name);
        assertThat(app.items[0].quality, is(4));
        assertThat(app.items[0].sell_in, is(0));
    }

    @Test
    public void should_return_gilded_test_nest_result_when_call_gilded_test_nest_method()  throws IOException {
        String expected = Files.toString(new File("src/test/java/com/gildedrose/gildedTestNestExpected.txt"), UTF_8);
        TexttestFixture.gildedTestNest();
        String result = Files.toString(new File("src/test/java/com/gildedrose/gildedTestNestResult.txt"), UTF_8);
        assertEquals(expected, result);
    }

}
