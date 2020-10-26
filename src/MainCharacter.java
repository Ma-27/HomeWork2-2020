import java.util.Scanner;

public class MainCharacter extends Person {
    //攻击力
    private final int aggresivePower;
    //防御力
    private final int defensivePower;

    public MainCharacter() {
        super();
        //输入名字和生命值
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入主角名称：");
        name = scanner.nextLine();
        System.out.println("请输入主角生命值：");
        lifeValue = scanner.nextInt();

        System.out.println("请输入主角攻击力：");
        aggresivePower = scanner.nextInt();
        System.out.println("请输入主角防御力：");
        defensivePower = scanner.nextInt();
    }
}
