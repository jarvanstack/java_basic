package Java学习.Java高级.常用类.Math常用类;

/**
 * Math常用类的用法
 *
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(" ----------三角函数运算----------");
        System.out.println("圆周率Π的值为：" + Math.PI);
        System.out.println("sin(90')=" + Math.sin(Math.PI / 2));
        System.out.println("con(0)=" + Math.cos(0));
        System.out.println("-----------------指数运算------------------");
        System.out.println("e 的平方跟： " + Math.exp(2));
        System.out.println("以e为底的2的对数值ln2 : " + Math.log(2));
        System.out.println("以10为底的2的对数log10'2 : " + Math.log10(2));
        System.out.println("4的平方根 ： " + Math.sqrt(4));
        System.out.println("8开3次方 ：" + Math.cbrt(8));
        System.out.println("2 的 5次方 ： " + Math.pow(2, 5));
        System.out.println("-------------比较运算--------------");
        System.out.println("取最大值 ： " + Math.max(2, 3));
        System.out.println("取最小值： " + Math.min(2, 3));
        System.out.println("取绝对值： " + Math.abs(-1));


        System.out.println("------------四舍五入------------");
        System.out.println("use floor 取整数 ： " + Math.floor(2.5));
        System.out.println("use round 四舍五入 ： " + Math.round(2.5));
        System.out.println("------------------ps-----------------");
        System.out.println("***ps:  Math.round (x)=(int)Math.floor(x+o.5f) ***  ");
        System.out.println(Math.round(2.5));
        System.out.println(Math.round(-2.5));
        System.out.println(Math.round(-2.51));
        System.out.println(Math.floor(-2.5 + 0.5f));//-2.5+0.5=-2>=-2***其会得到一个小于等于-2的值
        System.out.println(Math.floor(-2.51 + 0.5f));//-2.51+0.5=-2.01>=-3
        //在正数的开运算中也是如此
        /**
         * Math 类的方法。
         * ceil 本意天花板，正向无穷大取整，进一法取整。
         * double Math.ceil(double number) 返回比传入参数大最小整数.
         */
        System.out.println(Math.ceil(-17.20));

    }

}
