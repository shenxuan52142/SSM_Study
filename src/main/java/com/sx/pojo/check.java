package com.sx.pojo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class check {


    public boolean isMobileNO(String mobiles) {

        Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");

        Matcher m = p.matcher(mobiles);

        System.out.println(m.matches() + "---");

        return m.matches();

    }


    public boolean checkEmail(String email) {

        Pattern p = Pattern.compile("^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$");

        Matcher m = p.matcher(email);

        System.out.println(m.matches() + "---");

        return m.matches();

    }


    public String checkDate(Date date) {
        String var1 = null;


        SimpleDateFormat type1 = new SimpleDateFormat("HH:mm");
        SimpleDateFormat type2 = new SimpleDateFormat("昨天 HH:mm");
        SimpleDateFormat type3 = new SimpleDateFormat("Y/M/d");


        Date now = new Date(System.currentTimeMillis());

        Calendar a = Calendar.getInstance();
        a.setTime(now);
        Calendar b = Calendar.getInstance();
        b.setTime(date);


        int c = a.get(Calendar.YEAR) - b.get(Calendar.YEAR);
        int d = a.get(Calendar.DAY_OF_YEAR) - b.get(Calendar.DAY_OF_YEAR);


        if (c == 0) {
            if (d == 0) {
                var1 = type1.format(date);
            } else {
                if (d ==
                        1) {
                    var1 = type2.format(date);
                } else {
                    var1 = type3.format(date);
                }
            }

        } else {
            var1 = type3.format(date);
        }

        return var1;
    }
}
