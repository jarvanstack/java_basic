package Java学习.Java高级.集合.斗地主小游戏.斗地主小游戏1;

public class Main extends GameStar{
    public static void main(String[] args) {
        GameStar gameStar = new GameStar();
        for (String s : gameStar.getPerson1()) {
            System.out.println(s);
        }
    }
}
