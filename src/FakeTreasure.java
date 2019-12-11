public class FakeTreasure extends Treasure {
    public FakeTreasure() {
        super();
        super.setName("silver tray of life");
    }
    public FakeTreasure(String name) {
        super(name);
    }
    @Override
    public void BUFF(int attack, int defence, Player player) {

    }
    public void BUFF(Player player) {
        BUFF(-30, -30, player);
    }
}
