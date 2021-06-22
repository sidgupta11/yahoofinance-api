package yahoofinance;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.Test;
import yahoofinance.histquotes.HistoricalQuote;
import yahoofinance.histquotes.Interval;
import yahoofinance.histquotes2.HistoricalDividend;
import yahoofinance.histquotes2.HistoricalSplit;
import yahoofinance.quotes.stock.StockDividend;
import yahoofinance.quotes.stock.StockQuote;
import yahoofinance.quotes.stock.StockStats;

public class StockDiffblueTest {
    @Test
    public void testConstructor() {
        Stock actualStock = new Stock("Symbol");
        actualStock.setCurrency("Currency");
        StockDividend stockDividend = new StockDividend("Symbol");
        actualStock.setDividend(stockDividend);
        actualStock.setDividendHistory(new ArrayList<HistoricalDividend>());
        actualStock.setHistory(new ArrayList<HistoricalQuote>());
        actualStock.setName("Name");
        StockQuote stockQuote = new StockQuote("Symbol");
        actualStock.setQuote(stockQuote);
        actualStock.setSplitHistory(new ArrayList<HistoricalSplit>());
        StockStats stockStats = new StockStats("Symbol");
        actualStock.setStats(stockStats);
        actualStock.setStockExchange("Stock Exchange");
        assertEquals("Currency", actualStock.getCurrency());
        assertSame(stockDividend, actualStock.getDividend());
        assertEquals("Name", actualStock.getName());
        assertSame(stockQuote, actualStock.getQuote());
        assertSame(stockStats, actualStock.getStats());
        assertEquals("Stock Exchange", actualStock.getStockExchange());
        assertEquals("Symbol", actualStock.getSymbol());
        assertEquals("Symbol: null", actualStock.toString());
    }

    @Test
    public void testIsValid() {
        assertFalse((new Stock("Symbol")).isValid());
    }

    @Test
    public void testIsValid2() {
        Stock stock = new Stock("Symbol");
        stock.setName("Name");
        assertTrue(stock.isValid());
    }

    @Test
    public void testGetQuote() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        (new Stock("Symbol")).getQuote(true);
    }

    @Test
    public void testGetQuote2() throws IOException {
        assertNull((new Stock("Symbol")).getQuote(false));
    }

    @Test
    public void testGetStats() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        (new Stock("Symbol")).getStats(true);
    }

    @Test
    public void testGetStats2() throws IOException {
        assertNull((new Stock("Symbol")).getStats(false));
    }

    @Test
    public void testGetDividend() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        (new Stock("Symbol")).getDividend(true);
    }

    @Test
    public void testGetDividend2() throws IOException {
        assertNull((new Stock("Symbol")).getDividend(false));
    }

    @Test
    public void testGetHistory() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        (new Stock("Symbol")).getHistory();
    }

    @Test
    public void testGetHistory10() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        Stock stock = new Stock("Symbol");
        GregorianCalendar from = new GregorianCalendar(1, 1, 1);

        stock.getHistory(from, new GregorianCalendar(1, 1, 1), Interval.MONTHLY);
    }

    @Test
    public void testGetHistory11() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        Stock stock = new Stock("Symbol");
        stock.getHistory(new GregorianCalendar(1, 1, 1), Interval.DAILY);
    }

    @Test
    public void testGetHistory12() throws IOException {
        Stock stock = new Stock("Symbol");
        List<HistoricalQuote> actualHistory = stock.getHistory(new GregorianCalendar(Integer.MIN_VALUE, 1, 1),
                Interval.DAILY);
        assertTrue(actualHistory.isEmpty());
        assertSame(actualHistory, stock.getHistory());
    }

    @Test
    public void testGetHistory13() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        (new Stock("Symbol")).getHistory(Interval.DAILY);
    }

    @Test
    public void testGetHistory14() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        (new Stock("Symbol")).getHistory(Interval.WEEKLY);
    }

    @Test
    public void testGetHistory15() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        (new Stock("Symbol")).getHistory(Interval.MONTHLY);
    }

    @Test
    public void testGetHistory2() throws IOException {
        Stock stock = new Stock("Symbol");
        ArrayList<HistoricalQuote> historicalQuoteList = new ArrayList<HistoricalQuote>();
        stock.setHistory(historicalQuoteList);
        List<HistoricalQuote> actualHistory = stock.getHistory();
        assertSame(historicalQuoteList, actualHistory);
        assertTrue(actualHistory.isEmpty());
    }

    @Test
    public void testGetHistory3() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        Stock stock = new Stock("Symbol");
        stock.getHistory(new GregorianCalendar(1, 1, 1));
    }

    @Test
    public void testGetHistory4() throws IOException {
        Stock stock = new Stock("Symbol");
        List<HistoricalQuote> actualHistory = stock.getHistory(new GregorianCalendar(Integer.MIN_VALUE, 1, 1));
        assertTrue(actualHistory.isEmpty());
        assertSame(actualHistory, stock.getHistory());
    }

    @Test
    public void testGetHistory5() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        Stock stock = new Stock("Symbol");
        GregorianCalendar from = new GregorianCalendar(1, 1, 1);

        stock.getHistory(from, new GregorianCalendar(1, 1, 1));
    }

    @Test
    public void testGetHistory6() throws IOException {
        Stock stock = new Stock("Symbol");
        GregorianCalendar from = new GregorianCalendar(Integer.MIN_VALUE, 1, 1);

        assertTrue(stock.getHistory(from, new GregorianCalendar(1, 1, 1)).isEmpty());
    }

    @Test
    public void testGetHistory7() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        Stock stock = new Stock("Symbol");
        GregorianCalendar from = new GregorianCalendar(1, 1, 1);

        stock.getHistory(from, new GregorianCalendar(1, 1, 1), Interval.DAILY);
    }

    @Test
    public void testGetHistory8() throws IOException {
        Stock stock = new Stock("Symbol");
        GregorianCalendar from = new GregorianCalendar(Integer.MIN_VALUE, 1, 1);

        assertTrue(stock.getHistory(from, new GregorianCalendar(1, 1, 1), Interval.DAILY).isEmpty());
    }

    @Test
    public void testGetHistory9() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        Stock stock = new Stock("Symbol");
        GregorianCalendar from = new GregorianCalendar(1, 1, 1);

        stock.getHistory(from, new GregorianCalendar(1, 1, 1), Interval.WEEKLY);
    }

    @Test
    public void testGetDividendHistory() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        (new Stock("Symbol")).getDividendHistory();
    }

    @Test
    public void testGetDividendHistory2() throws IOException {
        Stock stock = new Stock("Symbol");
        ArrayList<HistoricalDividend> historicalDividendList = new ArrayList<HistoricalDividend>();
        stock.setDividendHistory(historicalDividendList);
        List<HistoricalDividend> actualDividendHistory = stock.getDividendHistory();
        assertSame(historicalDividendList, actualDividendHistory);
        assertTrue(actualDividendHistory.isEmpty());
    }

    @Test
    public void testGetDividendHistory3() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        Stock stock = new Stock("Symbol");
        stock.getDividendHistory(new GregorianCalendar(1, 1, 1));
    }

    @Test
    public void testGetDividendHistory4() throws IOException {
        Stock stock = new Stock("Symbol");
        List<HistoricalDividend> actualDividendHistory = stock
                .getDividendHistory(new GregorianCalendar(Integer.MIN_VALUE, 1, 1));
        assertTrue(actualDividendHistory.isEmpty());
        assertSame(actualDividendHistory, stock.getDividendHistory());
    }

    @Test
    public void testGetDividendHistory5() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        Stock stock = new Stock("Symbol");
        GregorianCalendar from = new GregorianCalendar(1, 1, 1);

        stock.getDividendHistory(from, new GregorianCalendar(1, 1, 1));
    }

    @Test
    public void testGetDividendHistory6() throws IOException {
        Stock stock = new Stock("Symbol");
        GregorianCalendar from = new GregorianCalendar(Integer.MIN_VALUE, 1, 1);

        assertTrue(stock.getDividendHistory(from, new GregorianCalendar(1, 1, 1)).isEmpty());
    }

    @Test
    public void testGetSplitHistory() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        (new Stock("Symbol")).getSplitHistory();
    }

    @Test
    public void testGetSplitHistory2() throws IOException {
        Stock stock = new Stock("Symbol");
        ArrayList<HistoricalSplit> historicalSplitList = new ArrayList<HistoricalSplit>();
        stock.setSplitHistory(historicalSplitList);
        List<HistoricalSplit> actualSplitHistory = stock.getSplitHistory();
        assertSame(historicalSplitList, actualSplitHistory);
        assertTrue(actualSplitHistory.isEmpty());
    }

    @Test
    public void testGetSplitHistory3() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        Stock stock = new Stock("Symbol");
        stock.getSplitHistory(new GregorianCalendar(1, 1, 1));
    }

    @Test
    public void testGetSplitHistory4() throws IOException {
        Stock stock = new Stock("Symbol");
        List<HistoricalSplit> actualSplitHistory = stock.getSplitHistory(new GregorianCalendar(Integer.MIN_VALUE, 1, 1));
        assertTrue(actualSplitHistory.isEmpty());
        assertSame(actualSplitHistory, stock.getSplitHistory());
    }

    @Test
    public void testGetSplitHistory5() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        Stock stock = new Stock("Symbol");
        GregorianCalendar from = new GregorianCalendar(1, 1, 1);

        stock.getSplitHistory(from, new GregorianCalendar(1, 1, 1));
    }

    @Test
    public void testGetSplitHistory6() throws IOException {
        Stock stock = new Stock("Symbol");
        GregorianCalendar from = new GregorianCalendar(Integer.MIN_VALUE, 1, 1);

        assertTrue(stock.getSplitHistory(from, new GregorianCalendar(1, 1, 1)).isEmpty());
    }

    @Test
    public void testPrint() {
        // TODO: This test is incomplete.
        //   Reason: No meaningful assertions found.
        //   To help Diffblue Cover to find assertions, please add getters to the
        //   class under test that return fields written by the method under test.
        //   See https://diff.blue/R004

        (new Stock("Symbol")).print();
    }

    @Test
    public void testPrint2() {
        // TODO: This test is incomplete.
        //   Reason: No meaningful assertions found.
        //   To help Diffblue Cover to find assertions, please add getters to the
        //   class under test that return fields written by the method under test.
        //   See https://diff.blue/R004

        ArrayList<HistoricalSplit> historicalSplitList = new ArrayList<HistoricalSplit>();
        GregorianCalendar date = new GregorianCalendar(1, 1, 1);

        BigDecimal numerator = BigDecimal.valueOf(42L);
        historicalSplitList.add(new HistoricalSplit("Symbol", date, numerator, BigDecimal.valueOf(42L)));

        Stock stock = new Stock("Symbol");
        stock.setSplitHistory(historicalSplitList);
        stock.print();
    }
}

