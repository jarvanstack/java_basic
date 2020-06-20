package Java学习.Java高级.注解和反射.反射.heima.反射项目;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 一、Properties类是Map的子类，性质类
 * 1. Properties 对象可以把以properties结尾的文件
 * 用load方法读取到内存里面形成一个集合
 *
 */
public class Demo_01 {
    public static void main(String[] args) throws Exception {
        //2.在程序中**加载读取配置文件**----------
        //2.1创建Properties对象
        Properties properties = new Properties();
        //2.2加载load()方法，加载配置文件，储存key value 的值在properties中
        //2.2.1 ：load() 需要传递参数InputStream
        String configuration = "D:\\Program Files\\JetBrains\\test1\\Lab\\src\\Java学习\\Java高级\\注解和" +
                "反射\\反射\\heima\\反射项目\\configuration.properties";
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(configuration),"GBK");
//        解码出错，properties是GBK格式

        properties.load(inputStreamReader);
        //2.3 获取配置文件的数据:
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");
        System.out.println(className);
        //3. 使用**反射**技术加载类**进内存**-----------
        Class aClass = Class.forName(className);
        //4.创建Person对象------
        //4.1因为Class类的创建Person对象方法newInstance()已经弃用
        //我们先创建获得构造函数类Constructor在创建Person对象
        //获得构造函数类Constructor 无参
        Constructor<?> constructor = aClass.getConstructor();
        //4.2 newInstance()创建Person对象
        Object person = constructor.newInstance();
        //5.用aClass获取getMethod对象,然后再使用新建的person对象invoke（person）执行方法---------------
        Method method = aClass.getMethod(methodName);
        method.invoke(person);

    }
}
