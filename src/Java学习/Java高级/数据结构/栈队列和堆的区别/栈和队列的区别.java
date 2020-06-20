package Java学习.Java高级.数据结构.栈队列和堆的区别;

import java.util.Stack;

/**
 * 一、目的： 测试栈Stack 和 队列 Queue 的区别
 * 二、
 *      1.栈 Stack ； 就像一个框，先进后出
 *      2.队列Queue： 就像排队，先进先出，也像一个隧道。
 *
 */
public class 栈和队列的区别 {
    public static void main(String[] args) {
        System.out.println("====栈Stack的测试====");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < 5; i++) {
            stack.add("元素 "+i);
        }
        System.out.println("栈："+stack);
        for (String s : stack) {
            System.out.println(s);
        }
    }
}
