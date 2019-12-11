public class GoldSword extends Treasure {
    public GoldSword() {
        super();
        super.setName("Gold Sword");
    }
    public GoldSword(String name) {
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
