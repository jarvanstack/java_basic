package Java学习.Java高级.集合.普通的对象数组的局限;

/**
 *对象数组的缺点：一旦创建，长度不可改变
 *
 */
public class Demo {
    public static void main(String[] args) {
        Person[] personArray = new Person[3];
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        //把地址赋值个数组personArray
        personArray[0] = person1;
        personArray[1] = person2;
        personArray[2] = person3;
        //set()赋值
        for (int i = 0; i < personArray.length; i++) {
            personArray[i].setName("Person"+i);
            personArray[i].setAge(18+i);
        }
        //使用get()方法访问属性，
        for (int i = 0; i < personArray.length; i++) {
            System.out.println(personArray[i].getName()+" is "+personArray[i].getAge());
        }

    }
}
