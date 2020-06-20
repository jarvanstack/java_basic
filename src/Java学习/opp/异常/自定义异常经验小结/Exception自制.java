package Java学习.opp.异常.自定义异常经验小结;

public class Exception自制 extends Exception {
    //定义detail属性
    public int detail;

    /**
     * 使用构造方法给属性赋值
     * @param a
     */
    public Exception自制(int a){
        this.detail = a;
    }
    //重写toString 打印异常.
    @Override
    public String toString() {
        return "打印成功!Exception自制{" +
                "detail=" + detail +
                '}';
    }
}
