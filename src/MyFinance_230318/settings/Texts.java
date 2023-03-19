package MyFinance_230318.settings;

import java.util.HashMap;

final public class Texts {

    private static final HashMap<String, String> data = new HashMap<>();

    public static String metodGet(String key){
        return data.get(key);
    }

    public static String[] getMonth(){
        String[] month = new String[12];
        month[0] = ("JANUARY");
        month[1] = ("FEBRUARY");
        month[2] = ("MARCH");
        month[3] = ("APRIL");
        month[4] = ("MAY");
        month[5] = ("JUNE");
        month[6] = ("JULY");
        month[7] = ("AUGUST");
        month[8] = ("SEPTEMBER");
        month[9] = ("OCTOBER");
        month[10] = ("NOVEMBER");
        month[11] = ("DECEMBER");
        return month;

    }



    public static void init(){
        data.put("PROGRAMM_NAME", "Домашняя бухгалтерия");
        data.put("MENU_FILE", "Файл");
        data.put("MENU_EDIT", "Правка");
        data.put("MENU_ViEW", "Вид");
        data.put("MENU_HELP", "Помощь");

        data.put("JANUARY", "Январь");
        data.put("FEBRUARY", "Февраль");
        data.put("MARCH", "Март");
        data.put("APRIL", "Апрель");
        data.put("MAY", "Май");
        data.put("JUNE", "Июнь");
        data.put("JULY", "Июль");
        data.put("AUGUST", "Август");
        data.put("SEPTEMBER", "Сентбрь");
        data.put("OCTOBER", "Октябрь");
        data.put("NOVEMBER", "Ноябрь");
        data.put("DECEMBER", "Декабрь");


    }

}
