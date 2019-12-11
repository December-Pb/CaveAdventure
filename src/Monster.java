public abstract class Monster {
    private String name;
    private String skill;
    public Monster() {
    }
    public Monster(String name, String skill) {
        this.name = name;
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "I am " + name + " , I can " + skill;
    }
}
