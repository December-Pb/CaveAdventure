public class MonsterFactory {
    public static Monster getMonster(int seed) {
        if(seed == 0) {
            return new EvilGoblin();
        }
        if(seed == 1) {
            return new EvilWombat();
        }
        else {
            return new DivaDon();
        }
    }
}
