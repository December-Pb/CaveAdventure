public class EvilGoblin extends Monster{
    public EvilGoblin() {
        super();
        super.setName("Evil Goblin");
        super.setSkill("Attack");
    }
    public EvilGoblin(String name, String skill) {
        super(name, skill);
    }
    public void DestroyVillage() {
        System.out.println("The village has been destroyed");
    }
}
