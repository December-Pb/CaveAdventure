import java.util.*;

public class CaveAdventureGameEngine extends RolePlayGame{
    public static final int NUMBEROFADVENTURE = 3;
    public static final int NUMBEROFMONSTER = 1;
    public static final int NUMBEROFTREASURE = 2;
    public static final int NUMBEROFPENANCE = 2;
    public static final int NUMBEROFGOD = 5;
    private Cave cave;
    private Player player;
    private int counter = 0;

    public CaveAdventureGameEngine() {
        cave = new Cave();
    }

    public void playGame() {
        System.out.println("Brave knight!!! What is your name?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        player = new Player(input);
        initGame();
        System.out.println("We are in need of your help, " + player.getName() + "!");
        System.out.println("Our village is being overrun by the goblins of the NorthernCaves.");
        System.out.println("We need you to defeat them!");
        System.out.println("Will you accept the challenge (Y/N)?");
        while(true) {
            String choose = scanner.next();
            counter++;
            if(choose.equalsIgnoreCase("Y")) {
                break;
            }
            if(counter < 5) {
                if(choose.equalsIgnoreCase("N")) {
                    System.out.println(".... Please, please help up brave knight, are you ready to enter the mouth of the caves (Y/N)?");
                }
                else {
                    System.out.println("Please enter Y or N");
                }
            }
            else {
                if(choose.equalsIgnoreCase("N")) {
                    System.out.println("You are a ruthless man");
                }
                else {
                    System.out.println("Input error");
                }
                System.exit(0);
            }
        }
        counter = 0;
        int flag;
        flag = cave.getAdventureList().get(0).adventureContent(0);
        if(flag == -1) {
            System.exit(0);
        }
        flag = cave.getAdventureList().get(1).adventureContent(1);
        if(flag == -1) {
            System.exit(0);
        }
        flag = cave.getAdventureList().get(2).adventureContent(2);
        if(flag == -1) {
            System.exit(0);
        }
        System.out.println("Are you ready for the final mission (Y/N)?");
        while(true) {
            input = scanner.next();
            if(input.equalsIgnoreCase("Y")) {
                String result = "";
                Set<String> wordSet = new HashSet<>();
                for(int i = 0; i < NUMBEROFGOD; i++) {
                    God god = new God();
                    String word = god.generateSpecialWord();
                    if(wordSet.add(word)) {
                        System.out.println("Village Idiot #" + i + ", what is your special word? " + word);
                        result += " " + word;
                    }
                    else {
                        System.out.println("Repeat Word!");
                        System.out.println("Village has been destroyed!");
                        System.exit(0);
                    }
                }
                System.out.println("The poem is: " + result);
                System.out.println("You success!");
                System.exit(0);
            }
            else {
                System.out.println("Please enter Y");
            }
        }
    }

    @Override
    public void initGame() {
        cave.setAdventureList(initAdventure());
        for(int i = 0; i < cave.getAdventureList().size(); i++) {
            initMonster(cave.getAdventureList().get(i), i);
            initTreasure(cave.getAdventureList().get(i), i);
            initPenance(cave.getAdventureList().get(i), i);
        }
    }

    @Override
    public List<Adventure> initAdventure() {
        List<Adventure> result = new ArrayList<>();
        result.add(new Adventure("Enter the mouth of the cave and clean up all the cob webs", player));
        result.add(new Adventure("Go deeper into the cave and turn off the water supply", player));
        result.add(new Adventure("Reach the depths of the cave, and perform the poetry of life", player));
        return result;
    }

    @Override
    public Adventure initMonster(Adventure adventure, int seed) {
        for(int i = 0; i < NUMBEROFMONSTER; i++) {
            adventure.getMonsterList().add(MonsterFactory.getMonster(seed));
        }
        return adventure;
    }

    @Override
    public Adventure initTreasure(Adventure adventure, int seed) {
        for(int i = 0; i < NUMBEROFTREASURE; i++) {
            adventure.getTreasureList().add(TreasureFactory.getTreasure(seed));
        }
        return adventure;
    }

    @Override
    public Adventure initPenance(Adventure adventure, int seed) {
        adventure.getPenanceList().add(new Penance("Sing the 12 days of Christmas (any variation)"));
        adventure.getPenanceList().add(new Penance("Perform 5 random math equations"));
        return adventure;
    }

    @Override
    public int judgeDamage(Player player) {
        return 0;
    }

    @Override
    public boolean judgeLifeOrDeath(Player player) {
        return false;
    }

    @Override
    public boolean judgeNextLevel(Player player) {
        return false;
    }

    @Override
    public boolean judgeWin(Player player) {
        return false;
    }
}
