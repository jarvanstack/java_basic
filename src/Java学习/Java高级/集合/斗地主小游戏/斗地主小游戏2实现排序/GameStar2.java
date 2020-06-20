package Java学习.Java高级.集合.斗地主小游戏.斗地主小游戏2实现排序;

import java.util.*;

/**
 * 一：目的：获得打印出有序的三个玩家手牌和底牌。
 * 二：步骤
 * 1，合成总牌，
 * 2，总牌打乱顺序
 * 3.发牌给3玩家和底牌
 * 4.排序
 * 5.输出
 * 三、需要的数据定义
 * 四、注意1：编程思维，
 * 1.init()函数初始化数据，构造函数调用init（）函数和步骤函数，步骤函数分开写，低耦合
 * 2.这里只打乱了数字 sequence 即可，不必打乱totalCards的HashMap,减少运行时间，
 * 五、注意2：错误，
 * 1.for(）里面++，for{}里面 --，就错了
 * 2.
 *
 */
public class GameStar2 {
    private HashMap<Integer, String> totalCards = new HashMap<>();
    private ArrayList<Integer> person1 = new ArrayList<>();
    private ArrayList<Integer> person2 = new ArrayList<>();
    private ArrayList<Integer> person3 = new ArrayList<>();
    private ArrayList<Integer> leftOver = new ArrayList<>();
    private String[] bases = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
    private ArrayList<Integer> sequence = new ArrayList<>();

    public ArrayList<Integer> getSequence() {
        return sequence;
    }

    public void setSequence(ArrayList<Integer> sequence) {
        this.sequence = sequence;
    }

    /**
     * 一、构造器调用init() and the methods.
     * 二：步骤
     * 1，合成总牌，
     * 2，总牌打乱顺序
     * 3.发牌给3玩家和底牌
     * 4.排序
     * 5.输出
     */
    public GameStar2() {
        init();
        //1，合成总牌，setTotalCards()
        setTotalCards();
        //2.洗牌 shuffleSequence(); 打乱顺序
        shuffleSequence();
        //3.发牌
        deal();
        //4.排序
        sortCards();
        //5.打印输出
        printCards();


    }

    /**
     * init（） 数据初始化
     */
    private void init() {
        for (int i = 0; i < 54; i++) {
            sequence.add(i);
        }
    }


    /**
     * 步骤  1，合成总牌，setTotalCards()
     * 二、具体
     * 1，0 1 大小王
     * 2.黑桃2,红桃2，
     */
    private void setTotalCards() {
        int index = bases.length - 1;
        for (int i = 0; i < 54; i++) {
            if (i == 0) {
                totalCards.put(i, "大王");
                continue;
            } else if (i == 1) {
                totalCards.put(i, "小王");
                continue;
            }
            //四色牌
            else if (i % 4 == 2) {
                totalCards.put(i, "黑桃" + bases[index]);
                continue;
            } else if (i % 4 == 3) {
                totalCards.put(i, "红心" + bases[index]);
                continue;
            } else if (i % 4 == 0) {
                totalCards.put(i, "梅花" + bases[index]);
                continue;
            } else if (i % 4 == 1) {
                totalCards.put(i, "方块" + bases[index]);
                index -= 1;
                continue;
            }


        }

    }

    /**
     * 2.洗牌 shuffleSequence()
     * 问题：如何实现所有的值的类型都可打乱
     * 二、步骤
     * 三、错误，for（）里++，for{}又 --就只有一半了。
     */
    private void shuffleSequence() {
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < sequence.size(); ) {
            int x = random.nextInt(sequence.size());
            arrayList2.add(sequence.get(x));
            sequence.remove(x);
        }
        sequence = arrayList2;
    }

    /**
     * 3.发牌
     */
    private void deal() {
        for (int i = 0; i < 54; i++) {
            if (i < 3) {
                leftOver.add(sequence.get(i));
                continue;
            } else if (i % 3 == 0) {
                person1.add(sequence.get(i));
                continue;
            } else if (i % 3 == 1) {
                person2.add(sequence.get(i));
                continue;
            } else if (i % 3 == 2) {
                person3.add(sequence.get(i));
                continue;
            }
        }

    }

    /**
     * 4.排序 Collections.sort(arr);
     */
    private void sortCards() {
        //默认升序,改为降序，然后牌由小到大
        Collections.sort(leftOver, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        Collections.sort(person1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        Collections.sort(person2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        Collections.sort(person3, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
    }

    /**
     * 5.打印输出：
     */
    private void printCards() {
        System.out.println("=====开始发牌======");
        System.out.print("person1: ");
        for (Integer integer : person1) {
            System.out.print(totalCards.get(integer) + "  ");
        }
        System.out.println();
        System.out.print("person2: ");
        for (Integer integer : person2) {
            System.out.print(totalCards.get(integer) + "  ");
        }
        System.out.println();
        System.out.print("person3: ");
        for (Integer integer : person3) {
            System.out.print(totalCards.get(integer) + "  ");
        }
        System.out.println();
        System.out.print("leftOver: ");
        for (Integer integer : leftOver) {
            System.out.print(totalCards.get(integer) + "  ");
        }
        System.out.println("/n======发牌结束====");
    }

}
