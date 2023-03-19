package MyFinance_230318;

import MyFinance_230318.settings.Texts;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        init(); //Инициируем метод init() в Main.java, который вызывает метод init() класса Texts.java

    }

    private static void init()
    {
            Texts.init();
        //System.out.println(Arrays.toString(Texts.getMonth()));
    }

}