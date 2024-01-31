package ru.netology;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void shouldAddAmountIfLess1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldAddAmountIfMore1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1200;
        int expected = 800;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldNotAddAmountIf1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual, expected);
    }
}