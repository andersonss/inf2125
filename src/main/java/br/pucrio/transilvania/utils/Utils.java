package br.pucrio.transilvania.utils;

import org.joda.time.DateTime;
import org.joda.time.Days;

import java.util.Date;

//enum singleton
public enum Utils {
    INSTANCE;

    public Date getTodayDate() {
        return DateTime.now().toDate();
    }

    public Date sumDaysToCurrentDate(int dias) {
        return new DateTime(new Date()).plusDays(dias).toDate();
    }

    public int mumberOfDaysBetweenDates(Date startDate, Date endDate) {
        return Days.daysBetween(new DateTime(startDate), new DateTime(endDate)).getDays();
    }
}
