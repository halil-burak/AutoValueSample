import mypkg.MoneyWithBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestMoneyWithBuilder {

    @Test
    public void testMoneyWithBuilder() {
        MoneyWithBuilder money = MoneyWithBuilder.builder()
                .setCurrency("usd")
                .setAmount(1000)
                .build();

        assertEquals(money.currency(), "usd");
        assertEquals(money.amount(), 1000);
    }

    @Test
    public void given2EqualValueTypesWithAutoValueBuilder_whenEqual_thenCorrect() {
        MoneyWithBuilder money1 = MoneyWithBuilder.builder()
                .setAmount(500)
                .setCurrency("eu")
                .build();

        MoneyWithBuilder money2 = MoneyWithBuilder.builder()
                .setAmount(500)
                .setCurrency("eu")
                .build();

        assertTrue(money1.equals(money2));
    }

    @Test
    public void given2DifferentValueTypesWithAutoValueBuilder_whenNotEqual_thenShouldFail() {
        MoneyWithBuilder money1 = MoneyWithBuilder.builder()
                .setAmount(1000)
                .setCurrency("usd")
                .build();

        MoneyWithBuilder money2 = MoneyWithBuilder.builder()
                .setAmount(5000)
                .setCurrency("eu")
                .build();

        assertFalse(money1.equals(money2));
    }
}
