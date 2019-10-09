package br.pucrio.transilvania.utils;

import br.pucrio.transilvania.model.Hotel;
import org.junit.Test;

import java.util.Date;

import static org.fest.assertions.Assertions.assertThat;

public class UtilsTest {

    @Test
    public void shouldGetActualDateSumWithDays() {
        Date sumDaysToCurrentDate = Utils.INSTANCE.sumDaysToCurrentDate(2);
        System.out.println(sumDaysToCurrentDate);
    }

    @Test
    public void shouldGetNumberOfDaysBetweenTwoDates() {
        Date today = Utils.INSTANCE.getTodayDate();
        int numberOfDaysBetweenDates = Utils.INSTANCE.mumberOfDaysBetweenDates(today,
                Utils.INSTANCE.sumDaysToCurrentDate(5));
        assertThat(numberOfDaysBetweenDates).isEqualTo(5);
    }

    @Test
    public void shouldFeed() {
        Hotel hotel = new Hotel();

        DataFeeder.dataFeed(hotel);

        System.out.println(hotel.getClients());
    }
}
