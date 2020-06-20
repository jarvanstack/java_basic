package Java学习.JVM虚拟机.堆.堆内存溢出模拟;

/**
 * 堆内存溢出模拟
 * 一、出现 OOM 解决
 * 1.增大堆空间
 * 2.如果1不管用就是代码问题.
 */
public class Demo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        while (true){
            stringBuilder.append("HelloHelloHelloHelloHelloHelloHello");
        }

    }
}
