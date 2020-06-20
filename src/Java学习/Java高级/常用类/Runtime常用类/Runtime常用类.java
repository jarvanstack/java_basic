package Java学习.Java高级.常用类.Runtime常用类;

/**
 * 一、Runtime查看或者控制虚拟机的状态和行为
 * 二、获取Runtime对象，因为Runtime无法直接new 所以使用这个创建对象
 *      1，Runtime.getRuntime();
 * 三、常用方法：
 *      (1) freeMemory()：该方法用于返回Java虚拟机中的空闲内存量，以字节为单位。
 *      (2) maxMemory()：该方法用于返回Java虚拟机试图使用的最大内存量。
 *      (3) totalMemory()：该方法用于返回Java虚拟机中的内存总量。
 *      (4)availableProcessors() :返回虚拟机的处理器数量
 *      (5)exit(int status): 通过启动其关闭序列来终止当前正在运行的Java虚拟机
 *
 */
public class Runtime常用类 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("ava虚拟机中的空闲内存量: "+runtime.freeMemory()+"字节");
        System.out.println("ava虚拟机试图使用的最大内存量:" + runtime.maxMemory()+"字节");
        System.out.println("ava虚拟机中的内存总量: " + runtime.totalMemory()+"字节");
        System.out.println("虚拟机的处理器数量: " + runtime.availableProcessors()+"字节");
    }
}
