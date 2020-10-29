import java.util.InputMismatchException;
import java.util.Scanner;

public class Monster extends Person {
    //获取life value的差值，也就是攻击后减掉的部分
    int delta;
    private int aggresivePower = 0;

    public Monster() {
        super();
        //输入名字和生命值
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入怪物名称：");
        name = scanner.nextLine();

        //对输入的生命值 攻击力 添加异常处理，处理非数字输入
        try {
            System.out.println("请输入怪物生命值：");
            lifeValue = scanner.nextInt();

            System.out.println("请输入怪物攻击力：");
            aggresivePower = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("你输入的不是数字，请重新启动游戏");
            System.exit(-1);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
