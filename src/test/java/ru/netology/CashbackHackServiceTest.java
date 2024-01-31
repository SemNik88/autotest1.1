package ru.netology;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldAddAmountIfLess1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldAddAmountIfMore1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1200;
        int expected = 800;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldNotAddAmountIf1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);
    }
}