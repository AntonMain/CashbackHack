package ru.netology.unit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void IfDefiniteAmountCashbackTest() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(3500), 500);
    }

    @Test
    public void IfZeroAmountForCashbackTest() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(0), 1000);
    }

    @Test
    public void IfMinAmountForCashbackTest() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(1000), 0);
    }
}