import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int roundNumbers;
        Monster monster = new Monster();
        MainCharacter mainCharacter = new MainCharacter();

        System.out.println("请输入战斗回合数：");
        Scanner scanner = new Scanner(System.in);
        roundNumbers = scanner.nextInt();

        for (int i = 0; i < roundNumbers; i++) {
            mainCharacter.attack(monster);
            System.out.println(mainCharacter.getName() + "对" + monster.getName()
                    + "造成" + monster.getDelta() + "点伤害");
            monster.attack(mainCharacter);
            System.out.println(monster.getName() + "对" + mainCharacter.getName()
                    + "造成" + mainCharacter.getDelta() + "点伤害");
        }
        System.out.println("战斗结束");
        System.out.println("主角的血量为：" + mainCharacter.getLifeValue());
        System.out.println("怪物的血量为：" + monster.getLifeValue());
    }
}
