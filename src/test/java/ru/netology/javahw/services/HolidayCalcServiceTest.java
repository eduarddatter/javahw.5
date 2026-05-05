package ru.netology.javahw.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class HolidayCalcServiceTest {
    @Test
    public void shouldCalculateForThreeMonthsHoliday() {
        HolidayCalcService service = new HolidayCalcService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
