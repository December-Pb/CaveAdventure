import java.util.ArrayList;
import java.util.List;

public class Player {
    private int attack;
    private int defence;
    private String name;
    private Dream dream;
    private List<Treasure> treasureList;

    public Player(String name) {
        this.name = name;
        attack = 10;
        defence = 10;
        dream = new Dream();
        treasureList = new ArrayList<>();
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack += attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence += defence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dream getDream() {
        return dream;
    }

    public void setDream(Dream dream) {
        this.dream = dream;
    }

    public List<Treasure> getTreasureList() {
        return treasureList;
    }

    public void setTreasureList(List<Treasure> treasureList) {
        this.treasureList = treasureList;
    }

    @Override
    public String toString() {
        return "Player{" +
                "attack=" + attack +
                ", defence=" + defence +
                ", name='" + name + '\'' +
                '}';
    }
}
