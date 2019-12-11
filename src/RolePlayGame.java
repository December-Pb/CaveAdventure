import java.util.List;

public abstract class RolePlayGame implements RPGRule{
    private Penance penance;
    public abstract void initGame();
    public abstract List<Adventure> initAdventure();
    public abstract Adventure initMonster(Adventure adventure, int seed);
    public abstract Adventure initTreasure(Adventure adventure, int seed);
    public abstract Adventure initPenance(Adventure adventure, int seed);
}
