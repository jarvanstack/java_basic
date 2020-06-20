package Java学习.Java高级.常用类.Calendar常用日历类;

import java.util.Calendar;
import java.util.Date;

/**
 * 1.在Date类之后，替代了很多Date类的方法
 * 2.一个抽象类，无法直接创建对象， 使用 Calender.getInstance();返回Calender类的子类创建对象。
 */
public class Calendar类 {
    public static void main(String[] args) {
        /**
         * 父左子右 -- 多态--父类的引用指向子类的对象
         * 返回 一连串的现在时间的 日历信息。
         */
        Calendar instance = Calendar.getInstance();

        System.out.println("instance: " + instance);//返回一连串现在时间的的日历信息
        System.out.println("instance.get(Calendar.MONTH): " + instance.get(Calendar.DATE));
        System.out.println("===========set()==================");
        instance.set(Calendar.YEAR, 9999);
        instance.set(Calendar.MONTH, 9);
        instance.set(Calendar.DATE, 9);
        System.out.println("set()后的年：" + instance.get(Calendar.YEAR));
        System.out.println("set()后的月：" + instance.get(Calendar.MONTH));
        System.out.println("set()后的日：" + instance.get(Calendar.DATE));
        System.out.println("============add()================");
        instance.add(Calendar.DATE, 5);//写代码时间为 2020.04.24
        System.out.println("add()5天之后为几号: " + instance.get(Calendar.DATE));
        System.out.println("========getTime()==============");
        /**
         * getTime() 日历转为日期
         *
         */
        Date time = instance.getTime();
        System.out.println("转换后的日期为：" + time);

    }
}
