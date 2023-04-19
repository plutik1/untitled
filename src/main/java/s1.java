import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.String;

import java.util.Scanner;
public class s1 {

    public static void main(String[] args)  {
sd("Основание 12, стапень 0, результат равен");

    }
    public static void sd (String text){
        String str = text;
        //String str1 = "снование 127, стапень 2, результат равен";
        //String str2 = "Основание 33, стапень 15, результат равен";
        //String str3 = "Основание 4, стапень 7, результат равен";
        //   Основание -5, стапень 3, результат равен
        //  снование 127, стапень 2, результат равен
        //  Основание 33, стапень 15, результат равен
        //  Основание 4, стапень 7, результат равен
        int ind1 = str.indexOf(" ");//ищем первый пробел
        // System.out.println(ind1+"первый пробел, значение в строке");
        ind1=ind1+1;// со следующего символа начинаем
        int ind2 = str.indexOf(",");//ищем конец числа
        //System.out.println(ind2 + "первая запятая, значение в строке");
        int len = ind2-ind1;
        // System.out.println(len + "длинна числа в строке");
        char[] mas = new char[len];
        for(int i =0; i<len; i++){
            mas [i] = str.charAt(ind1++);
        }
        for (int i = 0; i < len; i++) {
            //System.out.print(mas[i]);// вывод нашего числа
        }
        // System.out.println("Возвращаемое значение: " + String.valueOf(mas));
        String d = String.valueOf(mas);// преобразуем чар в строки
        // System.out.println(d);
        int o = Integer.parseInt(d);// преобразуем строки в инт
        // System.out.println(o);


        //String str = "Основание 1, стапень 322, результат равен";
        int ind3 = str.indexOf("ь ");//ищем 2 пробел
        //  System.out.println(ind3+"второй пробел, значение в строке");
        ind3=ind3+2;// со следующего символа начинаем
        int ind4 = str.lastIndexOf(",");//ищем конец числа
        //ind4= ind4;
        // System.out.println(ind4 + "второй запятая, значение в строке");
        int len1 = ind4-ind3;
        // System.out.println(len1 + "длинна числа в строке");
        char[] mas1 = new char[len1];
        for(int i = 0; i<len1; i++){
            //  System.out.println(i);
            mas1 [i] = str.charAt(ind3++);
        }

        for (int i = 0; i < len1; i++) {
            //System.out.print(mas1[i]);// вывод нашего числа
        }

        // System.out.println("Возвращаемое значение: " + String.valueOf(mas1));
        String dd = String.valueOf(mas1);// преобразуем чар в строки
        // System.out.println(dd);
        int oo = Integer.parseInt(dd);// преобразуем строки в инт
        // System.out.println(oo);
        double itog = Math.pow(o,oo);
        System.out.println(str + " " + itog);
    }
}

