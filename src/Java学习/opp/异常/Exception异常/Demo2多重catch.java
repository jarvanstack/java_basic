package Java学习.opp.异常.Exception异常;

public class Demo2多重catch {
    public static void main(String[] args) {
        try {
            new Demo2多重catch().a();
        } catch (Error e) {
            System.out.println("第一个catch捕获Error成功");
        }catch (Exception e){
            System.out.println("第二个catch捕获Exception成功");
        }catch (Throwable e){
            System.out.println("第三个catch捕获最大的异常类Throwable 成功");
        }finally {
            System.out.println("finally 语句运行成功");
        }

    }
    public void a(){
        b();
    }
    public void b(){
        a();
    }
}
