### 一、Class类理解

1. class本身就是一个类
2. Class 对象只能由系统建立
3. 一个加载类在JVM中只能有一个Class实例， （.class文件）
4. 每个类的实例都记得自己是有哪一个类创建的（比如Person类的 张三知道自己是由Person类创建的)
5. 所以你通过张三的反射就能得到Person类并对其进行操作

### 二、Class类的常用方法

1. static ClassforName（String name) 通过包名.对象名来返回Class对象
2. Object newInstens() :调用缺省构造函数，返回一个Class对象的实例
3. Class getSupperClass()   : 获得父类Class
4. ClassLoader getClassLoader() ：返回类的加载器
5. Constructor[] getConstructor() ：返回类的所有构造器
6. Method getMethod(String name ,Class ... T): 返回Method对象，对象的形参为paramType
7. Field[] getDecalaredFields() : 获取Field对象的一个数组



### 三、类的加载过程

#### 1. 加载（加载时触发)

1. 生成 .class文件

#### 2.链接（加载时触发）

1. **检查安全**：安全检查，是否报错
2. 准备**static池**：给static分配内存并设置默认初始值
3. 解析**常量池**：将常量的引用（常量的名称）替换为地址

#### 3.初始化(new 或者反射时候触发)

 1. 初始化：执行<clinit>()方法，类的构造器<clinit>() 是编译期间，收集所有类变量的赋值和静态代码块中的语句产生的，（类的构造器<clinit>()是构造类的信息的，不是constructor我们写的构造器)

 2. 注意：

    ..(1)初始化一个类的时候发现它的父类没有初始化就会先初始化它的父类

    （2）clinit()会自动加锁和同步，所以多线程不会出问题。

![image-20200513170720294](C:%5CUsers%5C25301%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20200513170720294.png)

##### （1）初始化内存分析[点击跳转视频](https://www.bilibili.com/video/BV1p4411P7V3?p=9)



##### （2）类的构造clint和构造函数Constructor区别

```java 
package Java学习.Java高级.注解和反射.反射.类的构造clint和构造函数Constructor区别;

/**
 * 1.子类和父类的类的构造<clinit>()的初始化
 * 子类的初始化发先父类没有初始化，就会先初始化父类，只有一次
 * 回答：1次
 *
 * 2.子类和父类的构造函数初始化constructor
 * 如果子类有多个实例，每个实例都初始化子类的构造函数，
 * 构造函数constructor 的初始化只有一次么？
 * 回答 ：多次
 * 不是，实例化子类 new Student的时候，是在堆空间中储存，
 * 父类构造函数的时候 堆空间会调用方法区的 class 父类，再次执行构造方法
 */
public class Demo03 {
    public static void main(String[] args) {
        new Student();
        new Student();
    }
}
class Person{
    public Person() {
        System.out.println("父类：Person构造函数加载");
    }
}
class Student extends Person{
    public Student() {
        System.out.println("子类：Student构造函数加载");
    }
}
```

