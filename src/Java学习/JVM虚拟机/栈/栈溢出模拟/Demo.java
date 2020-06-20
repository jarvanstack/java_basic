package Java学习.JVM虚拟机.栈.栈溢出模拟;

public class Demo {
    public static void main(String[] args) {
        new Demo().a();
    }
    private void a(){
        b();
    }
    private void b(){
        a();
    }
}
