package Java学习.Java高级.Lambda表达式.Lambda表达式排序案例;

public class Person {
    private int ages;
    private String name;

    public Person() {
    }

    public Person(int ages, String name) {
        this.ages = ages;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ages=" + ages +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAges() {
        return ages;
    }

    public void setAges(int ages) {
        this.ages = ages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
