package yahoofinance.histquotes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Test;

public class HistoricalQuoteDiffblueTest {
    @Test
    public void testConstructor() {
        HistoricalQuote actualHistoricalQuote = new HistoricalQuote();
        BigDecimal valueOfResult = BigDecimal.valueOf(42L);
        actualHistoricalQuote.setAdjClose(valueOfResult);
        BigDecimal valueOfResult1 = BigDecimal.valueOf(42L);
        actualHistoricalQuote.setClose(valueOfResult1);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(1, 1, 1);

        actualHistoricalQuote.setDate(gregorianCalendar);
        BigDecimal valueOfResult2 = BigDecimal.valueOf(42L);
        actualHistoricalQuote.setHigh(valueOfResult2);
        BigDecimal valueOfResult3 = BigDecimal.valueOf(42L);
        actualHistoricalQuote.setLow(valueOfResult3);
        BigDecimal valueOfResult4 = BigDecimal.valueOf(42L);
        actualHistoricalQuote.setOpen(valueOfResult4);
        actualHistoricalQuote.setSymbol("Symbol");
        actualHistoricalQuote.setVolume(1L);
        BigDecimal adjClose = actualHistoricalQuote.getAdjClose();
        assertEquals(valueOfResult3, adjClose);
        assertEquals(valueOfResult4, adjClose);
        assertSame(valueOfResult, adjClose);
        assertEquals(valueOfResult1, adjClose);
        assertEquals(valueOfResult2, adjClose);
        BigDecimal close = actualHistoricalQuote.getClose();
        assertEquals(adjClose, close);
        assertSame(valueOfResult1, close);
        assertEquals(valueOfResult2, close);
        assertEquals(valueOfResult4, close);
        assertEquals(valueOfResult3, close);
        assertSame(gregorianCalendar, actualHistoricalQuote.getDate());
        BigDecimal high = actualHistoricalQuote.getHigh();
        assertEquals(valueOfResult4, high);
        assertSame(valueOfResult2, high);
        assertEquals(valueOfResult3, high);
        assertEquals(adjClose, high);
        assertEquals(close, high);
        BigDecimal low = actualHistoricalQuote.getLow();
        assertEquals(adjClose, low);
        assertEquals(close, low);
        assertSame(valueOfResult3, low);
        assertEquals(high, low);
        assertEquals(valueOfResult4, low);
        BigDecimal open = actualHistoricalQuote.getOpen();
        assertSame(valueOfResult4, open);
        assertEquals(high, open);
        assertEquals(low, open);
        assertEquals(adjClose, open);
        assertEquals(close, open);
        assertEquals("Symbol", actualHistoricalQuote.getSymbol());
        assertEquals(1L, actualHistoricalQuote.getVolume().longValue());
    }

    @Test
    public void testConstructor2() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(1, 1, 1);

        BigDecimal valueOfResult = BigDecimal.valueOf(42L);
        BigDecimal valueOfResult1 = BigDecimal.valueOf(42L);
        BigDecimal valueOfResult2 = BigDecimal.valueOf(42L);
        BigDecimal valueOfResult3 = BigDecimal.valueOf(42L);
        BigDecimal valueOfResult4 = BigDecimal.valueOf(42L);
        HistoricalQuote actualHistoricalQuote = new HistoricalQuote("Symbol", gregorianCalendar, valueOfResult,
                valueOfResult1, valueOfResult2, valueOfResult3, valueOfResult4, 1L);
        BigDecimal valueOfResult5 = BigDecimal.valueOf(42L);
        actualHistoricalQuote.setAdjClose(valueOfResult5);
        BigDecimal valueOfResult6 = BigDecimal.valueOf(42L);
        actualHistoricalQuote.setClose(valueOfResult6);
        GregorianCalendar gregorianCalendar1 = new GregorianCalendar(1, 1, 1);

        actualHistoricalQuote.setDate(gregorianCalendar1);
        BigDecimal valueOfResult7 = BigDecimal.valueOf(42L);
        actualHistoricalQuote.setHigh(valueOfResult7);
        BigDecimal valueOfResult8 = BigDecimal.valueOf(42L);
        actualHistoricalQuote.setLow(valueOfResult8);
        BigDecimal valueOfResult9 = BigDecimal.valueOf(42L);
        actualHistoricalQuote.setOpen(valueOfResult9);
        actualHistoricalQuote.setSymbol("Symbol");
        actualHistoricalQuote.setVolume(1L);
        BigDecimal adjClose = actualHistoricalQuote.getAdjClose();
        assertEquals(valueOfResult7, adjClose);
        assertEquals(valueOfResult, adjClose);
        assertEquals(valueOfResult9, adjClose);
        assertEquals(valueOfResult2, adjClose);
        assertEquals(valueOfResult4, adjClose);
        assertEquals(valueOfResult8, adjClose);
        assertEquals(valueOfResult1, adjClose);
        assertEquals(valueOfResult6, adjClose);
        assertSame(valueOfResult5, adjClose);
        assertEquals(valueOfResult3, adjClose);
        BigDecimal close = actualHistoricalQuote.getClose();
        assertEquals(adjClose, close);
        assertEquals(valueOfResult1, close);
        assertEquals(valueOfResult7, close);
        assertEquals(valueOfResult, close);
        assertSame(valueOfResult6, close);
        assertEquals(valueOfResult8, close);
        assertEquals(valueOfResult3, close);
        assertEquals(valueOfResult2, close);
        assertEquals(valueOfResult9, close);
        assertEquals(valueOfResult4, close);
        Calendar date = actualHistoricalQuote.getDate();
        assertSame(gregorianCalendar1, date);
        assertEquals(gregorianCalendar, date);
        BigDecimal high = actualHistoricalQuote.getHigh();
        assertEquals(close, high);
        assertEquals(valueOfResult4, high);
        assertSame(valueOfResult7, high);
        assertEquals(valueOfResult8, high);
        assertEquals(valueOfResult3, high);
        assertEquals(valueOfResult1, high);
        assertEquals(adjClose, high);
        assertEquals(valueOfResult, high);
        assertEquals(valueOfResult9, high);
        assertEquals(valueOfResult2, high);
        BigDecimal low = actualHistoricalQuote.getLow();
        assertEquals(valueOfResult, low);
        assertEquals(close, low);
        assertSame(valueOfResult8, low);
        assertEquals(valueOfResult2, low);
        assertEquals(valueOfResult3, low);
        assertEquals(adjClose, low);
        assertEquals(valueOfResult9, low);
        assertEquals(high, low);
        assertEquals(valueOfResult1, low);
        assertEquals(valueOfResult4, low);
        BigDecimal open = actualHistoricalQuote.getOpen();
        assertEquals(valueOfResult3, open);
        assertEquals(valueOfResult4, open);
        assertEquals(low, open);
        assertEquals(adjClose, open);
        assertEquals(valueOfResult1, open);
        assertEquals(valueOfResult2, open);
        assertEquals(valueOfResult, open);
        assertEquals(high, open);
        assertSame(valueOfResult9, open);
        assertEquals(close, open);
        assertEquals("Symbol", actualHistoricalQuote.getSymbol());
        assertEquals(1L, actualHistoricalQuote.getVolume().longValue());
    }
}

