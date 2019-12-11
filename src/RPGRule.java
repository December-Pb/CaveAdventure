public interface RPGRule {
    int judgeDamage(Player player);
    boolean judgeLifeOrDeath(Player player);
    boolean judgeNextLevel(Player player);
    boolean judgeWin(Player player);

}
