import java.util.Scanner;

public class Monster extends Person {
    private final int aggresivePower;
    //获取life value的差值，也就是攻击后减掉的部分
    int delta;

    public Monster() {
        super();
        //输入名字和生命值
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入怪物名称：");
        name = scanner.nextLine();
        System.out.println("请输入怪物生命值：");
        lifeValue = scanner.nextInt();
        System.out.println("请输入怪物攻击力：");
        aggresivePower = scanner.nextInt();
    }

    void attack(MainCharacter instance) {
        int lifeValue = instance.getLifeValue();
        lifeValue = lifeValue - aggresivePower + instance.defensivePower;
        instance.setMainCharacterLifeValue(lifeValue);
    }

    public int getLifeValue() {
        return lifeValue;
    }

    void setMonsterLifeValue(int lifeValue) {
        delta = this.lifeValue - lifeValue;
        this.lifeValue = lifeValue;
    }

    public int getDelta() {
        return delta;
    }

}
