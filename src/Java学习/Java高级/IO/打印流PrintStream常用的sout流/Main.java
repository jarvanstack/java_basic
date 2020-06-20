package Java学习.Java高级.IO.打印流PrintStream常用的sout流;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * 打印流继承OutputStream，只能输出。
 * 二、特点
 * 1. 可以写入多种数据类型，int char String,所有的数据类型
 * 2. System.setOut(PrintStream printStream)方法可以把sout输出到控制台的打印流 设置为某个文件.
 * 三、构造方法
 * 1.  new PrintStream(String url)
 * 可以 File 也可是 String路径，OutputString类实例，2个参数还可以指定编码格式
 * 四、特色方法
 * 1.print 和 println()
 * 注意：如果使用父类的write(97) 写入的是 a 使用 print(97) 则会原样写入 97
 *
 * 五、普通打印的步骤
 * 1. 构造new PrintStream(url)
 * 2. print写入
 * 3.刷新关闭
 * 六、改变sout的位置不是控制台而是文件里.
 * 1.构造
 * 2.System.setOut(printStream)
 * 3.sout 输出到文件里。
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String url = "D:\\Program Files\\JetBrains\\test1\\Lab\\src\\Java学习\\Java高级\\IO\\打印流P" +
                "rintStream常用的sout流\\";
        //五、普通打印的步骤
        System.out.println("---------五、普通打印的步骤--------");
        PrintStream printStream = new PrintStream(url + "打印流PrintStream1.txt");
        printStream.println("第一行字符串");
        printStream.println(1.1);
        printStream.println(false);
        printStream.flush();
        printStream.close();
        //六、改变sout的位置不是控制台而是文件里.
        System.out.println("-----六、改变sout的位置不是控制台而是文件里.-----------");
        System.out.println("这是没有改变前可以输出到控制台.");
        PrintStream printStream1 = new PrintStream(url + "改变输出控制台到输出文件里.txt");
        System.setOut(printStream);
        System.out.println("改变后输出到文件里");
        printStream1.close();
    }
}
