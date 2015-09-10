package br.com.ranking.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtil {
    public static Date parse(String dateString, String pattern) {
            Date date = null;
            try {
                    date = new SimpleDateFormat(pattern).parse(dateString);
            } catch (ParseException e) {
                    e.printStackTrace();
            }
            return date;
    }

    public static Date parse(String date) {
            return parse(date, "dd/MM/yyyy HH:mm:ss");
    }
}
