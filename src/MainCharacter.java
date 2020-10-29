import java.util.InputMismatchException;
import java.util.Scanner;

public class MainCharacter extends Person {
    //攻击力
    int aggresivePower;
    //防御力
    int defensivePower;
    int delta = 0;

    public MainCharacter() {
        super();
        //输入名字和生命值
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入主角名称：");
        name = scanner.nextLine();

        //对输入的生命值添加异常处理
        try {
            System.out.println("请输入主角生命值：");
            lifeValue = scanner.nextInt();

            System.out.println("请输入主角攻击力：");
            aggresivePower = scanner.nextInt();

            System.out.println("请输入主角防御力：");
            defensivePower = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("你输入的不是数字，请重新启动游戏");
            System.exit(-1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void attack(Monster instance) {
        int lifeValue = instance.getLifeValue();
        lifeValue = lifeValue - aggresivePower;
        instance.setMonsterLifeValue(lifeValue);
    }

    public int getLifeValue() {
        return lifeValue;
    }

    void setMainCharacterLifeValue(int lifeValue) {
        delta = this.lifeValue - lifeValue;
        this.lifeValue = lifeValue;
    }

    public int getDelta() {
        return delta;
    }
}
