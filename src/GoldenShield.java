public class GoldenShield extends Treasure{
    public GoldenShield() {
        super();
        super.setName("Gold Shield");
    }
    public GoldenShield(String name) {
        super(name);
    }
    @Override
    public void BUFF(int attack, int defence, Player player) {
        player.setAttack(attack);
        player.setDefence(defence);
    }
    public void BUFF(Player player) {
        BUFF(50, 20, player);
    }
}
