package yahoofinance.quotes.fx;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import java.io.IOException;
import java.math.BigDecimal;

import org.junit.Test;

public class FxQuoteDiffblueTest {
    @Test
    public void testConstructor() {
        BigDecimal valueOfResult = BigDecimal.valueOf(42L);
        FxQuote actualFxQuote = new FxQuote("Symbol", valueOfResult);
        BigDecimal valueOfResult1 = BigDecimal.valueOf(42L);
        actualFxQuote.setPrice(valueOfResult1);
        actualFxQuote.setSymbol("Symbol");
        BigDecimal price = actualFxQuote.getPrice();
        assertEquals(valueOfResult, price);
        assertSame(valueOfResult1, price);
        assertEquals("Symbol", actualFxQuote.getSymbol());
        assertEquals("Symbol: 42", actualFxQuote.toString());
    }

    @Test
    public void testConstructor2() {
        FxQuote actualFxQuote = new FxQuote("Symbol");
        assertEquals("Symbol: 0", actualFxQuote.toString());
        assertEquals("Symbol", actualFxQuote.getSymbol());
        assertEquals("0", actualFxQuote.getPrice().toString());
    }

    @Test
    public void testGetPrice() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        (new FxQuote("Symbol")).getPrice(true);
    }

    @Test
    public void testGetPrice2() throws IOException {
        BigDecimal actualPrice = (new FxQuote("Symbol")).getPrice(false);
        assertSame(actualPrice.ZERO, actualPrice);
        assertEquals("0", actualPrice.toString());
    }
}

