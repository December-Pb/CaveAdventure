public class TreasureFactory {
    public static Treasure getTreasure(int seed) {
        if(seed == 0) {
            return new GoldSword();
        }
        else if(seed == 1) {
            return new GoldenShield();
        }
        else if(seed == 2){
            return new GoldenHelmet();
        }
        else {
            return new FakeTreasure();
        }
    }
}
