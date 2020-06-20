package Java学习.Java高级.泛型.Extends和Supper泛型限制的区别;

/**
 * #### 6、<? extends E>和<? super E> 的区别？（毕15-13）
 *
 * 1.Fruit 和 Meat 继承 extend Food
 * 2.Apple 和 Banana 继承 Fruit
 * 3.Pork 和 Beef 继承 Meat.
 */
public class Demo {
    public static void main(String[] args) {

    }
}
class Food{}
class Fruit extends Food{}
class Apple extends Fruit{}
class Banana extends Fruit{}

class Meat extends Food{}
class Pork extends Meat{}
class Beef extends Meat{}

