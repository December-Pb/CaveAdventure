public abstract class Treasure {
    private String name;
    public Treasure(String name) {
        this.name = name;
    }
    public Treasure() {
    }
    public abstract void BUFF(int attack, int defence, Player player);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "The treasure is " + name;
    }
}
