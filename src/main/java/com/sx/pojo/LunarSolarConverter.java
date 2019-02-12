package com.sx.pojo;

import org.elasticsearch.common.recycler.Recycler;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class LunarSolarConverter {
    private static int[] lunar_month_days = { 1887, 0x1694, 0x16aa, 0x4ad5, 0xab6, 0xc4b7, 0x4ae, 0xa56, 0xb52a, 0x1d2a,
            0xd54, 0x75aa, 0x156a, 0x1096d, 0x95c, 0x14ae, 0xaa4d, 0x1a4c, 0x1b2a, 0x8d55, 0xad4, 0x135a, 0x495d, 0x95c,
            0xd49b, 0x149a, 0x1a4a, 0xbaa5, 0x16a8, 0x1ad4, 0x52da, 0x12b6, 0xe937, 0x92e, 0x1496, 0xb64b, 0xd4a, 0xda8,
            0x95b5, 0x56c, 0x12ae, 0x492f, 0x92e, 0xcc96, 0x1a94, 0x1d4a, 0xada9, 0xb5a, 0x56c, 0x726e, 0x125c, 0xf92d,
            0x192a, 0x1a94, 0xdb4a, 0x16aa, 0xad4, 0x955b, 0x4ba, 0x125a, 0x592b, 0x152a, 0xf695, 0xd94, 0x16aa, 0xaab5,
            0x9b4, 0x14b6, 0x6a57, 0xa56, 0x1152a, 0x1d2a, 0xd54, 0xd5aa, 0x156a, 0x96c, 0x94ae, 0x14ae, 0xa4c, 0x7d26,
            0x1b2a, 0xeb55, 0xad4, 0x12da, 0xa95d, 0x95a, 0x149a, 0x9a4d, 0x1a4a, 0x11aa5, 0x16a8, 0x16d4, 0xd2da,
            0x12b6, 0x936, 0x9497, 0x1496, 0x1564b, 0xd4a, 0xda8, 0xd5b4, 0x156c, 0x12ae, 0xa92f, 0x92e, 0xc96, 0x6d4a,
            0x1d4a, 0x10d65, 0xb58, 0x156c, 0xb26d, 0x125c, 0x192c, 0x9a95, 0x1a94, 0x1b4a, 0x4b55, 0xad4, 0xf55b,
            0x4ba, 0x125a, 0xb92b, 0x152a, 0x1694, 0x96aa, 0x15aa, 0x12ab5, 0x974, 0x14b6, 0xca57, 0xa56, 0x1526,
            0x8e95, 0xd54, 0x15aa, 0x49b5, 0x96c, 0xd4ae, 0x149c, 0x1a4c, 0xbd26, 0x1aa6, 0xb54, 0x6d6a, 0x12da,
            0x1695d, 0x95a, 0x149a, 0xda4b, 0x1a4a, 0x1aa4, 0xbb54, 0x16b4, 0xada, 0x495b, 0x936, 0xf497, 0x1496,
            0x154a, 0xb6a5, 0xda4, 0x15b4, 0x6ab6, 0x126e, 0x1092f, 0x92e, 0xc96, 0xcd4a, 0x1d4a, 0xd64, 0x956c, 0x155c,
            0x125c, 0x792e, 0x192c, 0xfa95, 0x1a94, 0x1b4a, 0xab55, 0xad4, 0x14da, 0x8a5d, 0xa5a, 0x1152b, 0x152a,
            0x1694, 0xd6aa, 0x15aa, 0xab4, 0x94ba, 0x14b6, 0xa56, 0x7527, 0xd26, 0xee53, 0xd54, 0x15aa, 0xa9b5, 0x96c,
            0x14ae, 0x8a4e, 0x1a4c, 0x11d26, 0x1aa4, 0x1b54, 0xcd6a, 0xada, 0x95c, 0x949d, 0x149a, 0x1a2a, 0x5b25,
            0x1aa4, 0xfb52, 0x16b4, 0xaba, 0xa95b, 0x936, 0x1496, 0x9a4b, 0x154a, 0x136a5, 0xda4, 0x15ac };

    private static int[] solar_1_1 = { 1887, 0xec04c, 0xec23f, 0xec435, 0xec649, 0xec83e, 0xeca51, 0xecc46, 0xece3a,
            0xed04d, 0xed242, 0xed436, 0xed64a, 0xed83f, 0xeda53, 0xedc48, 0xede3d, 0xee050, 0xee244, 0xee439, 0xee64d,
            0xee842, 0xeea36, 0xeec4a, 0xeee3e, 0xef052, 0xef246, 0xef43a, 0xef64e, 0xef843, 0xefa37, 0xefc4b, 0xefe41,
            0xf0054, 0xf0248, 0xf043c, 0xf0650, 0xf0845, 0xf0a38, 0xf0c4d, 0xf0e42, 0xf1037, 0xf124a, 0xf143e, 0xf1651,
            0xf1846, 0xf1a3a, 0xf1c4e, 0xf1e44, 0xf2038, 0xf224b, 0xf243f, 0xf2653, 0xf2848, 0xf2a3b, 0xf2c4f, 0xf2e45,
            0xf3039, 0xf324d, 0xf3442, 0xf3636, 0xf384a, 0xf3a3d, 0xf3c51, 0xf3e46, 0xf403b, 0xf424e, 0xf4443, 0xf4638,
            0xf484c, 0xf4a3f, 0xf4c52, 0xf4e48, 0xf503c, 0xf524f, 0xf5445, 0xf5639, 0xf584d, 0xf5a42, 0xf5c35, 0xf5e49,
            0xf603e, 0xf6251, 0xf6446, 0xf663b, 0xf684f, 0xf6a43, 0xf6c37, 0xf6e4b, 0xf703f, 0xf7252, 0xf7447, 0xf763c,
            0xf7850, 0xf7a45, 0xf7c39, 0xf7e4d, 0xf8042, 0xf8254, 0xf8449, 0xf863d, 0xf8851, 0xf8a46, 0xf8c3b, 0xf8e4f,
            0xf9044, 0xf9237, 0xf944a, 0xf963f, 0xf9853, 0xf9a47, 0xf9c3c, 0xf9e50, 0xfa045, 0xfa238, 0xfa44c, 0xfa641,
            0xfa836, 0xfaa49, 0xfac3d, 0xfae52, 0xfb047, 0xfb23a, 0xfb44e, 0xfb643, 0xfb837, 0xfba4a, 0xfbc3f, 0xfbe53,
            0xfc048, 0xfc23c, 0xfc450, 0xfc645, 0xfc839, 0xfca4c, 0xfcc41, 0xfce36, 0xfd04a, 0xfd23d, 0xfd451, 0xfd646,
            0xfd83a, 0xfda4d, 0xfdc43, 0xfde37, 0xfe04b, 0xfe23f, 0xfe453, 0xfe648, 0xfe83c, 0xfea4f, 0xfec44, 0xfee38,
            0xff04c, 0xff241, 0xff436, 0xff64a, 0xff83e, 0xffa51, 0xffc46, 0xffe3a, 0x10004e, 0x100242, 0x100437,
            0x10064b, 0x100841, 0x100a53, 0x100c48, 0x100e3c, 0x10104f, 0x101244, 0x101438, 0x10164c, 0x101842,
            0x101a35, 0x101c49, 0x101e3d, 0x102051, 0x102245, 0x10243a, 0x10264e, 0x102843, 0x102a37, 0x102c4b,
            0x102e3f, 0x103053, 0x103247, 0x10343b, 0x10364f, 0x103845, 0x103a38, 0x103c4c, 0x103e42, 0x104036,
            0x104249, 0x10443d, 0x104651, 0x104846, 0x104a3a, 0x104c4e, 0x104e43, 0x105038, 0x10524a, 0x10543e,
            0x105652, 0x105847, 0x105a3b, 0x105c4f, 0x105e45, 0x106039, 0x10624c, 0x106441, 0x106635, 0x106849,
            0x106a3d, 0x106c51, 0x106e47, 0x10703c, 0x10724f, 0x107444, 0x107638, 0x10784c, 0x107a3f, 0x107c53,
            0x107e48 };
    private static String[] Gan = new String[]{"甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬",
            "癸"};
    private static String[] Zhi = new String[]{"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申",
            "酉", "戌", "亥"};
    private final static String chineseMonthNumber[] = { "正", "二", "三", "四", "五", "六", "七",
            "八", "九", "十", "十一", "腊" };
    private final static String chineseDayNumber[] = { "初一", "初二", "初三", "初四", "初五", "初六", "初七",
            "初八", "初九", "初十", "十一", "十二", "十三", "十四", "十五", "十六", "十七", "十八", "十九",
            "二十", "二十一", "二十二", "二十三", "二十四", "二十五", "二十六", "二十七", "二十八", "二十九", "三十"};

    private static int GetBitInt(int data, int length, int shift) {
        return (data & (((1 << length) - 1) << shift)) >> shift;
    }

    // WARNING: Dates before Oct. 1582 are inaccurate
    private static long SolarToInt(int y, int m, int d) {
        m = (m + 9) % 12;
        y = y - m / 10;
        return 365 * y + y / 4 - y / 100 + y / 400 + (m * 306 + 5) / 10 + (d - 1);
    }

    /**
     *
     * @param lunarYear
     *            农历年份
     * @return String of Ganzhi: 甲子年 Tiangan:甲乙丙丁戊己庚辛壬癸<br/>
     *         Dizhi: 子丑寅卯辰巳无为申酉戌亥
     */
    public static String lunarYearToGanZhi(int lunarYear) {
        final String[] tianGan = { "甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬", "癸" };
        final String[] diZhi = { "子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥" };
        return tianGan[(lunarYear - 4) % 10] + diZhi[(lunarYear - 4) % 12] + "年";
    }

    private static Calendar SolarFromInt(long g) {
        long y = (10000 * g + 14780) / 3652425;
        long ddd = g - (365 * y + y / 4 - y / 100 + y / 400);
        if (ddd < 0) {
            y--;
            ddd = g - (365 * y + y / 4 - y / 100 + y / 400);
        }
        long mi = (100 * ddd + 52) / 3060;
        long mm = (mi + 2) % 12 + 1;
        y = y + (mi + 2) / 12;
        long dd = ddd - (mi * 306 + 5) / 10 + 1;
//        Solar solar = new Solar();
//        solar.solarYear = (int) y;
//        solar.solarMonth = (int) mm;
//        solar.solarDay = (int) dd;
        Calendar calendar = Calendar.getInstance();
        int m=(int)mm;
        calendar.set((int) y,m-1,(int) dd);
        return calendar;
    }

    /**
     * 农历转公历
     */
    public static Calendar LunarToSolar(Calendar calendar,Boolean b) {
        int days = lunar_month_days[calendar.get(Calendar.YEAR) - lunar_month_days[0]];
        int leap = GetBitInt(days, 4, 13);
        int offset = 0;
        int loopend = leap;
        if (!b) {
            if (calendar.get(Calendar.MONTH) <= leap || leap == 0) {
                loopend = calendar.get(Calendar.MONTH) - 1;
            } else {
                loopend = calendar.get(Calendar.MONTH);
            }
        }
        for (int i = 0; i < loopend; i++) {
            offset += GetBitInt(days, 1, 12 - i) == 1 ? 30 : 29;
        }
        offset += calendar.get(Calendar.DATE);

        int solar11 = solar_1_1[calendar.get(Calendar.YEAR) - solar_1_1[0]];

        int y = GetBitInt(solar11, 12, 9);
        int m = GetBitInt(solar11, 4, 5);
        int d = GetBitInt(solar11, 5, 0);

        return SolarFromInt(SolarToInt(y, m, d) + offset - 1);
    }
    /**
     * 公历转农历
     */
    public static Calendar SolarToLunar(Calendar calendar) {
        return privateSolarToLunar(calendar);
    }
    /**
     * 公历转农历
     */
    public static Calendar SolarToLunar(String date)throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.setTime(sdf.parse(date));
        return privateSolarToLunar(cal);
    }
    /**
     * 公历转农历
     */
    public static Calendar SolarToLunar(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return privateSolarToLunar(cal);
    }

    /**
     * 公历转农历
     */
      private static Calendar privateSolarToLunar(Calendar calendar) {
        Lunar lunar = new Lunar();
        Calendar returnCalendar=Calendar.getInstance();
        int index = calendar.get(Calendar.YEAR) - solar_1_1[0];
        int data = (calendar.get(Calendar.YEAR) << 9) | (calendar.get(Calendar.MONTH)+1<< 5) | (calendar.get(Calendar.DATE));
        int solar11 = 0;
        if (solar_1_1[index] > data) {
            index--;
        }
        solar11 = solar_1_1[index];
        int y = GetBitInt(solar11, 12, 9);
        int m = GetBitInt(solar11, 4, 5);
        int d = GetBitInt(solar11, 5, 0);
        long offset = SolarToInt(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH)+1, calendar.get(Calendar.DATE)) - SolarToInt(y, m, d);

        int days = lunar_month_days[index];
        int leap = GetBitInt(days, 4, 13);

        int lunarY = index + solar_1_1[0];
        int lunarM = 1;
        int lunarD = 1;
        offset += 1;

        for (int i = 0; i < 13; i++) {
            int dm = GetBitInt(days, 1, 12 - i) == 1 ? 30 : 29;
            if (offset > dm) {
                lunarM++;
                offset -= dm;
            } else {
                break;
            }
        }
        lunarD = (int) (offset);
        if (leap != 0 && lunarM > leap) {
            lunarM = lunarM - 1;
            if (lunarM == leap + 1) {
            }
        }

        returnCalendar.set(lunarY,lunarM-1,lunarD);
        return returnCalendar;
    }
    /**
     * 计算 并 打印 八字
     *
     * @param date
     * @throws ParseException
     */
    public static Map tianGanDiZhi(String date) throws ParseException {
        Map resMap = new HashMap();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.setTime(sdf.parse(date));
        return personalTianGanDiZhi(cal);
    }
    /**
     * 计算 并 打印 八字
     * @param date
     * @throws ParseException
     */
    public static Map tianGanDiZhi(Date date) throws ParseException {
        Map resMap = new HashMap();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return personalTianGanDiZhi(cal);
    }
    /**
     * 计算 并 打印 八字
     * @param
     * @throws ParseException
     */
    public static Map tianGanDiZhi(Calendar cal) throws ParseException {
       return personalTianGanDiZhi(cal);
    }
    private static Map personalTianGanDiZhi(Calendar cal){
        Map resMap = new HashMap();
        int y = cal.get(Calendar.YEAR);
        int m = cal.get(Calendar.MONTH);
        int i = cal.get(Calendar.DATE) - 1;
        String cY = null;
        String cM = null;
        String cD = null;
        //先根据公历算出干支纪日
        int dayCyclical = jlday(y, m);
        cD = cyclical(dayCyclical + i);
        //返回农历日期
        Calendar lunar=privateSolarToLunar(cal);
        y=lunar.get(Calendar.YEAR);
        m=lunar.get(Calendar.MONTH);
        //计算干支纪年
        cY = cyclical(y - 1900 + 36);
        //计算干支纪月 以每月初一为起点
        cM = cyclical((y - 1900) * 12 + m + 14);
        resMap.put("cY", cY + "年");
        resMap.put("cM", cM + "月");
        resMap.put("cD", cD + "日");
        return resMap;
    }

    /**
     * 传入 offset 返回干支, 0=甲子
     *
     * @param num
     * @return
     */
    public static String cyclical(int num) {
        return (Gan[num % 10] + Zhi[num % 12]);
    }
    /**
     * 间隔天数
     *
     * @param y
     * @param m
     * @return
     */
    private static int jlday(int y, int m) {
        ScriptEngineManager sem = new ScriptEngineManager(); /* script引擎管理 */
        ScriptEngine se = sem.getEngineByName("javascript"); /* script引擎 */
        try {
            se.eval(" var y =" + y + ",m=" + m + " ;"); /* 执行一段script */
            se.eval("function jlday(   ) { "
                    + "return Date.UTC(y,m,1,0,0,0,0)/86400000+25567+10;" + "}"); /* 添加一个方法 */
            Invocable invocableEngine = (Invocable) se;
            Object callbackvalue = invocableEngine.invokeFunction("jlday"); /* 调用方法中的函数 */
            if (callbackvalue != null) {
                double numdb = Double.valueOf(callbackvalue.toString());
                return (int) numdb;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    /**
     * 间隔天数
     *
     * @param calendar
     * @return Map
     */
    public static Map lunarName(Calendar calendar){
        Map resMap = new HashMap();
        String lunarMonth=chineseMonthNumber[calendar.get(Calendar.MONTH)];
        String lunarDay=chineseDayNumber[calendar.get(Calendar.DATE)-1];
        resMap.put("M",lunarMonth);
        resMap.put("D",lunarDay);
        return resMap;
    }
    public static Map lunarName(String date) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date date1=new Date();
        try{
        date1=simpleDateFormat.parse(date);
        }catch (Exception e){
            throw new RuntimeException("日历类型转换失败");
        }
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date1);
        Map resMap = new HashMap();
        String lunarMonth=chineseMonthNumber[calendar.get(Calendar.MONTH)];
        String lunarDay=chineseDayNumber[calendar.get(Calendar.DATE)-1];
        resMap.put("M",lunarMonth);
        resMap.put("D",lunarDay);
        return resMap;
    }
    public static Map lunarName(Date date){
        Calendar calendar= Calendar.getInstance();
        calendar.setTime(date);
        Map resMap = new HashMap();
        String lunarMonth=chineseMonthNumber[calendar.get(Calendar.MONTH)];
        String lunarDay=chineseDayNumber[calendar.get(Calendar.DATE)-1];
        resMap.put("M",lunarMonth);
        resMap.put("D",lunarDay);
        return resMap;
    }

}
