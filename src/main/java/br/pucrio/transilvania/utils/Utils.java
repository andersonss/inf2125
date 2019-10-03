package br.pucrio.transilvania.utils;

import org.joda.time.DateTime;

import java.util.Date;

public class Utils {
    private static Utils instance;

    public static Utils getInstance() {
        if (instance == null) {
            instance = new Utils();
        }
        return instance;
    }

    public Date sumDaysToCurrentDate(int dias) {
        return new DateTime(new Date()).plusDays(dias).toDate();
    }
}
