package Java学习.JVM虚拟机.JVM学习方法01;

/**
 * 一、2个面试题
 * 1. 请你谈谈堆JVM的理解?java 8 虚拟机和之前有什么变化
 * 2. 什么是OMM，什么是StackOverFlowError？怎么分析？
 * 3. JVM 的常用调优参数有哪些？
 * 4. 内存快照如何抓取？怎么分析Dump文件？
 * 5. 谈谈JVM类加载器你认识？
 * 引导加载器rt-jar 拓展加载器ext.jar 应用加载器app.jar
 * 二、掌握知识：
 * 1. JVM位置
 * 2. JVM体系结构
 * 3. 类加载器
 * 4. 双亲委派机制
 * 5. 沙箱安全机制
 * 6. Native
 * 7. PC 寄存器
 * 8. 方法区
 * 9. 栈
 * 10. 堆
 * 11. 三种JVM
 * 12. 新生区，老年区
 * 13. 永久区
 * 14. 堆内存调优
 * 15. GC （Garbage Collection）垃圾回收
 * 16. JMM
 *
 */
public class Demo {
    public static void main(String[] args) {
        new Thread().start();
    }
}
