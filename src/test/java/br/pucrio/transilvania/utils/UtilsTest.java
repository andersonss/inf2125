package br.pucrio.transilvania.utils;

import org.junit.Test;

import java.util.Date;

import static org.fest.assertions.Assertions.assertThat;

public class UtilsTest {

    @Test
    public void shouldGetActualDateSumWithDays() {
        Date sumDaysToCurrentDate = Utils.getInstance().sumDaysToCurrentDate(2);
        System.out.println(sumDaysToCurrentDate);
    }

}
