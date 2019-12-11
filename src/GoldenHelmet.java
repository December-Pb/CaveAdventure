public class GoldenHelmet extends Treasure{
    public GoldenHelmet() {
        super();
        super.setName("Gold Helmet");
    }
    public GoldenHelmet(String name) {
        super(name);
    }
    @Override
    public void BUFF(int attack, int defence, Player player) {
        player.setAttack(attack);
        player.setDefence(defence);
    }
    public void BUFF(Player player) {
        BUFF(35, 60, player);
    }
}
