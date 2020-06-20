package Java学习.Java高级.集合.斗地主小游戏.斗地主小游戏1;

import java.util.ArrayList;
import java.util.Random;

public class GameStar {
    private ArrayList<String> totalCards = new ArrayList<>();
    private ArrayList<String> ghosts = new ArrayList<>();
    private ArrayList<String> spade = new ArrayList<>();
    private ArrayList<String> hearts = new ArrayList<>();
    private ArrayList<String> clubs = new ArrayList<>();
    private ArrayList<String> person1 = new ArrayList<>();
    private ArrayList<String> person2 = new ArrayList<>();
    private ArrayList<String> person3 = new ArrayList<>();
    private ArrayList<String> leftOver = new ArrayList<>();

    public ArrayList<String> getTotalCards() {
        return totalCards;
    }

    public ArrayList<String> getGhosts() {
        return ghosts;
    }

    public ArrayList<String> getSpade() {
        return spade;
    }

    public ArrayList<String> getHearts() {
        return hearts;
    }

    public ArrayList<String> getClubs() {
        return clubs;
    }

    public ArrayList<String> getPerson1() {
        return person1;
    }

    public ArrayList<String> getPerson2() {
        return person2;
    }

    public ArrayList<String> getPerson3() {
        return person3;
    }

    public ArrayList<String> getLeftOver() {
        return leftOver;
    }

    public ArrayList<String> getDiamonds() {
        return diamonds;
    }

    public String[] getBases() {
        return bases;
    }

    public GameStar() {
        //初始化
        init();
        //洗牌算法：
        totalCards = shuffle(totalCards);
        //发牌
        deal(totalCards);
    }

    private ArrayList<String> diamonds = new ArrayList<>();
    private String[] bases = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

    public void init() {

        //给牌赋值
        setArrayList(ghosts);
        setArrayList(spade);
        setArrayList(hearts);
        setArrayList(clubs);
        setArrayList(diamonds);
        setArrayList(totalCards);
    }


    public void setArrayList(ArrayList<String> arrayList) {
        if (arrayList == ghosts) {
            ghosts.add("大王");
            ghosts.add("小王");
        } else if (arrayList == spade) {
            for (int i = 0; i < bases.length; i++) {
                spade.add("黑桃" + bases[i]);
            }
        } else if (arrayList == hearts) {
            for (int i = 0; i < bases.length; i++) {
                hearts.add("红桃" + bases[i]);
            }
        } else if (arrayList == clubs) {
            for (int i = 0; i < bases.length; i++) {
                clubs.add("梅花" + bases[i]);
            }
        } else if (arrayList == diamonds) {
            for (int i = 0; i < bases.length; i++) {
                diamonds.add("方块" + bases[i]);
            }
        } else if (arrayList == totalCards) {
            // totalCards.clear();
            for (int i = 0; i < ghosts.size(); i++) {
                totalCards.add(ghosts.get(i));
            }
            for (int i = 0; i < spade.size(); i++) {
                totalCards.add(spade.get(i));
            }
            for (int i = 0; i < hearts.size(); i++) {
                totalCards.add(hearts.get(i));

            }
            for (int i = 0; i < clubs.size(); i++) {
                totalCards.add(clubs.get(i));
            }
            for (int i = 0; i < diamonds.size(); i++) {
                totalCards.add(diamonds.get(i));
            }
        }
    }

    //洗牌算法：
    public ArrayList<String> shuffle(ArrayList<String> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int length = arrayList.size();
        for (int i = 0; i < length; i++) {
            Random random = new Random();
            int x = random.nextInt(arrayList.size());
            arrayList2.add(arrayList.get(x));
            arrayList.remove(x);
        }
        return arrayList2;
    }

    //发牌
    public void deal(ArrayList<String> totalCards) {
        for (int i = 0; i < 54; i++) {
            if (i < 51) {
                if (i % 3 == 0) {
                    person1.add(totalCards.get(i));
                } else if (i % 3 == 1) {
                    person2.add(totalCards.get(i));
                } else if (i % 3 == 2) {
                    person3.add(totalCards.get(i));
                }
            } else if (i >= 51 && i < 54) {
                leftOver.add(totalCards.get(i));
            }
        }
    }

}
