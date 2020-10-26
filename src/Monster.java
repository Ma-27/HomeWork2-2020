import java.util.Scanner;

public class Monster extends Person {
    private final int aggresivePower;

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

    public int getAggresivePower() {
        return aggresivePower;
    }

}
