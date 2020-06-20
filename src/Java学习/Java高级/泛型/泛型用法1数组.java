package Java学习.Java高级.泛型;

/**
 * 泛型的用法：感觉实现了所有类型重载
 * 1.数组类型参数，
 * 2.集合Collection类型的参数，
 */
public class 泛型用法1数组 {
    /**
     * 使用泛型广泛代替传入数组参数的类型，作用就实现了所有类型的重载。
     */
    public static <E> void printArray(E[] inputArray) {
        // 输出数组元素
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        // 创建不同类型数组： Integer, Double 和 Character
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("整型数组元素为:");
        printArray(intArray); // 传递一个整型数组

        System.out.println("/n双精度型数组元素为:");
        printArray(doubleArray); // 传递一个双精度型数组

        System.out.println("/n字符型数组元素为:");
        printArray(charArray); // 传递一个字符型数组
    }
}

