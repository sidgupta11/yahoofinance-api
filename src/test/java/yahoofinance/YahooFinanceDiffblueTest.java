package yahoofinance;

import java.io.IOException;
import java.util.GregorianCalendar;

import org.junit.Test;
import yahoofinance.histquotes.Interval;

public class YahooFinanceDiffblueTest {
    @Test
    public void testGet() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        YahooFinance.get("Symbol");
    }

    @Test
    public void testGet10() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        YahooFinance.get(new String[]{YahooFinance.QUOTES_CSV_DELIMITER, YahooFinance.QUOTES_CSV_DELIMITER});
    }

    @Test
    public void testGet11() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        YahooFinance.get(new String[]{"Symbols"}, new GregorianCalendar(1, 1, 1));
    }

    @Test
    public void testGet12() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        YahooFinance.get(new String[]{}, new GregorianCalendar(1, 1, 1));
    }

    @Test
    public void testGet13() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        YahooFinance.get(new String[]{YahooFinance.QUOTES_CSV_DELIMITER, YahooFinance.QUOTES_CSV_DELIMITER},
                new GregorianCalendar(1, 1, 1));
    }

    @Test
    public void testGet14() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        GregorianCalendar from = new GregorianCalendar(1, 1, 1);

        YahooFinance.get(new String[]{"Symbols"}, from, new GregorianCalendar(1, 1, 1));
    }

    @Test
    public void testGet15() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        GregorianCalendar from = new GregorianCalendar(1, 1, 1);

        YahooFinance.get(new String[]{}, from, new GregorianCalendar(1, 1, 1));
    }

    @Test
    public void testGet16() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        GregorianCalendar from = new GregorianCalendar(1, 1, 1);

        YahooFinance.get(new String[]{YahooFinance.QUOTES_CSV_DELIMITER, YahooFinance.QUOTES_CSV_DELIMITER}, from,
                new GregorianCalendar(1, 1, 1));
    }

    @Test
    public void testGet17() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        GregorianCalendar from = new GregorianCalendar(1, 1, 1);

        YahooFinance.get(new String[]{"Symbols"}, from, new GregorianCalendar(1, 1, 1), Interval.DAILY);
    }

    @Test
    public void testGet18() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        GregorianCalendar from = new GregorianCalendar(1, 1, 1);

        YahooFinance.get(new String[]{}, from, new GregorianCalendar(1, 1, 1), Interval.DAILY);
    }

    @Test
    public void testGet19() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        GregorianCalendar from = new GregorianCalendar(1, 1, 1);

        YahooFinance.get(new String[]{YahooFinance.QUOTES_CSV_DELIMITER, YahooFinance.QUOTES_CSV_DELIMITER}, from,
                new GregorianCalendar(1, 1, 1), Interval.DAILY);
    }

    @Test
    public void testGet2() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        YahooFinance.get("Symbol", new GregorianCalendar(1, 1, 1));
    }

    @Test
    public void testGet20() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        YahooFinance.get(new String[]{"Symbols"}, new GregorianCalendar(1, 1, 1), Interval.DAILY);
    }

    @Test
    public void testGet21() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        YahooFinance.get(new String[]{}, new GregorianCalendar(1, 1, 1), Interval.DAILY);
    }

    @Test
    public void testGet22() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        YahooFinance.get(new String[]{YahooFinance.QUOTES_CSV_DELIMITER, YahooFinance.QUOTES_CSV_DELIMITER},
                new GregorianCalendar(1, 1, 1), Interval.DAILY);
    }

    @Test
    public void testGet23() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        YahooFinance.get(new String[]{"Symbols"}, Interval.DAILY);
    }

    @Test
    public void testGet24() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        YahooFinance.get(new String[]{}, Interval.DAILY);
    }

    @Test
    public void testGet25() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        YahooFinance.get(new String[]{YahooFinance.QUOTES_CSV_DELIMITER, YahooFinance.QUOTES_CSV_DELIMITER},
                Interval.DAILY);
    }

    @Test
    public void testGet26() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        YahooFinance.get(new String[]{"Symbols"}, true);
    }

    @Test
    public void testGet27() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        YahooFinance.get(new String[]{}, true);
    }

    @Test
    public void testGet28() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        YahooFinance.get(new String[]{YahooFinance.QUOTES_CSV_DELIMITER, YahooFinance.QUOTES_CSV_DELIMITER}, true);
    }

    @Test
    public void testGet3() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        GregorianCalendar from = new GregorianCalendar(1, 1, 1);

        YahooFinance.get("Symbol", from, new GregorianCalendar(1, 1, 1));
    }

    @Test
    public void testGet4() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        GregorianCalendar from = new GregorianCalendar(1, 1, 1);

        YahooFinance.get("Symbol", from, new GregorianCalendar(1, 1, 1), Interval.DAILY);
    }

    @Test
    public void testGet5() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        YahooFinance.get("Symbol", new GregorianCalendar(1, 1, 1), Interval.DAILY);
    }

    @Test
    public void testGet6() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        YahooFinance.get("Symbol", Interval.DAILY);
    }

    @Test
    public void testGet7() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        YahooFinance.get("Symbol", true);
    }

    @Test
    public void testGet8() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        YahooFinance.get(new String[]{"Symbols"});
    }

    @Test
    public void testGet9() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        YahooFinance.get(new String[]{});
    }

    @Test
    public void testGetFx() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        YahooFinance.getFx("Symbol");
    }

    @Test
    public void testGetFx2() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        YahooFinance.getFx(new String[]{"Symbols"});
    }

    @Test
    public void testGetFx3() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        YahooFinance.getFx(new String[]{});
    }

    @Test
    public void testGetFx4() throws IOException {
        // TODO: This test is incomplete.
        //   Reason: Attempting to run the method under test violated the sandboxing policy.
        //
        //   See https://diff.blue/R011

        String toStringResult = Boolean.TRUE.toString();
        YahooFinance.getFx(new String[]{toStringResult, Boolean.TRUE.toString()});
    }
}

