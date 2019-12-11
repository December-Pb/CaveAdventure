import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Adventure {
    private List<Treasure> treasureList = new ArrayList<>();
    private List<Monster> monsterList = new ArrayList<>();
    private List<Penance> penanceList = new ArrayList<>();
    private String name;
    private Player player;
    public Adventure() {
        name = "Adventure";
    }
    public Adventure(String name, Player player) {
        this.name = name;
        this.player = player;
    }

    public List<Treasure> getTreasureList() {
        return treasureList;
    }

    public void setTreasureList(List<Treasure> treasureList) {
        this.treasureList = treasureList;
    }

    public List<Monster> getMonsterList() {
        return monsterList;
    }

    public void setMonsterList(List<Monster> monsterList) {
        this.monsterList = monsterList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Penance> getPenanceList() {
        return penanceList;
    }

    public void setPenanceList(List<Penance> penanceList) {
        this.penanceList = penanceList;
    }

    public int adventureContent(int level) {
        String[] strings = name.split("and");
        Monster currentMonster = monsterList.get(0);
        Treasure currentTreasure = treasureList.get(0);
        System.out.println("You " + strings[0] + ", what would you like to do?");
        while(true) {
            System.out.println("1) Attack the " + currentMonster.getName() + " and" + strings[1]);
            System.out.println("2) Pick up the " + currentTreasure.getName());
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            if(input.equals("1")) {
                System.out.println("You slayed the " + currentMonster.getName()  + " and are sill alive, what would you like to do?");
                System.out.println("1) Move on to the next adventure");
                System.out.println("2) Pick up the " + currentTreasure.getName());
                while(true) {
                    input = scanner.next();
                    if(input.equals("1")) {
                        if(player.getTreasureList().size() == 0) {
                            System.out.println("You are dead!");
                            return -1;
                        }
                        if(level < player.getTreasureList().size() &&
                                player.getTreasureList().get(level).getName().equals(treasureList.get(level).getName())) {
                            System.out.println("You can move on to your next Adventure!");
                            return 0;
                        }
                        else {
                            System.out.println("You are dead!");
                            return -1;
                        }
                    }
                    else if(input.equals("2")) {
                        if(!currentTreasure.getName().equals("silver tray of life")) {
                            player.getTreasureList().add(currentTreasure);
                            System.out.println("You have picked up the gold sword and are still alive, you can move on to your next Adventure!");
                            return 0;
                        }
                        else {
                            //Should Be Randomly
                            System.out.println("They tricked you into picking up a second treasure, your penance is to sing the Twelve Days of Christmas.");
                            System.out.println("On the first day of Christmas my true love gave to me, a partridge in a pear tree\n" +
                                    "On the second day of Christmas my true love gave to me, two turtle doves and a partridge in a pear tree.\n" +
                                    "On the third day of Christmas my true love gave to me, three French hens, two turtle doves and a partridge in a pear tree. Etc.....\n");
                            System.out.println("Great! You have done your penance, what would you like to do?");
                        }
                    }
                    else {
                        System.out.println("Please enter 1 or 2");
                    }
                }
            }
            else if(input.equals("2")){
                if(!currentTreasure.getName().equals("silver tray of life")) {
                    player.getTreasureList().add(currentTreasure);
                    System.out.println("You have picked up the treasure, now go rest before continuing the mission.");
                    System.out.println(player.getDream());
                    System.out.println("Great! You are awake and rested what would you like to do?");
                    currentTreasure = TreasureFactory.getTreasure(5);
                }
                else {
                    //Should Be Randomly
                    System.out.println("They tricked you into picking up a second treasure, your penance is to sing the Twelve Days of Christmas.");
                    System.out.println("On the first day of Christmas my true love gave to me, a partridge in a pear tree\n" +
                            "On the second day of Christmas my true love gave to me, two turtle doves and a partridge in a pear tree.\n" +
                            "On the third day of Christmas my true love gave to me, three French hens, two turtle doves and a partridge in a pear tree. Etc.....\n");
                    System.out.println("Great! You have done your penance, what would you like to do?");
                }
            }
        }
    }
}
