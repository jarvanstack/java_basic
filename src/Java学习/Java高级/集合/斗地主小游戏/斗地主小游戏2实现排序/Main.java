package Java学习.Java高级.集合.斗地主小游戏.斗地主小游戏2实现排序;

/**
 * 使用键值对, Collections.sort(arr,new Comparator()),对牌进行排序
 */
public class Main {
    public static void main(String[] args) {
        long timeStar = System.currentTimeMillis();
        new GameStar2();
        long timeEnd = System.currentTimeMillis();
        System.out.println("the time is : " + (timeEnd - timeStar)+"毫秒");
    }
}
