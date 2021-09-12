package it.utils;

import it.Person.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class utils {
    public static int id;
    public static int tid;
    static {
        id = 0;
        tid = 0;
    }
    //根据生日计算年龄的方法
    public static int birthDayToAge(String birthday){
        Date nowDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate=null;
        try {
            birthdayDate = sdf.parse(birthday);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if(birthdayDate.after(nowDate)){
            return -1;
        }
        Calendar cal = Calendar.getInstance();
        int nowYear = cal.get(Calendar.YEAR);
        int nowMonth = cal.get(Calendar.MONTH);
        int nowDay = cal.get(Calendar.DAY_OF_MONTH);
        cal.setTime(birthdayDate);

        int birthdayYear = cal.get(Calendar.YEAR);
        int birthdayMonth = cal.get(Calendar.MONTH);
        int birthdayDay = cal.get(Calendar.DAY_OF_MONTH);

        int age = nowYear - birthdayYear;

        if(nowMonth - birthdayMonth<0){
            return age -1;
        }
        if(nowMonth == birthdayMonth&&nowDay - birthdayDay<0){
            return age - 1;
        }

        return age;
    }

    public static void printPerson(Person p){
        System.out.println(p.getId()+"\t\t"
                +p.getName()+"\t\t"+p.getSex()+"\t\t"
                +p.getBirthday()+"\t\t"+p.getAge()+"\t\t"+p.show());

    }
    public static void printArrayList(ArrayList list){
        System.out.println("*************************************************");
        System.out.println("编号"+"\t\t"+"姓名"+"\t\t"+"性别"+"\t\t"+"生日"+"\t\t\t\t"+"年龄"+"\t\t"+"概述");
        for (int i = 0; i < list.size(); i++) {
            Person p = (Person) list.get(i);
            printPerson(p);
        }
        System.out.println("*************************************************");

    }
}
