public class Penance {
    private String penanceContent;
    public Penance(String penanceContent) {
        this.penanceContent = penanceContent;
    }
    public Penance() {
        this.penanceContent = "You are dead man";
    }

    @Override
    public String toString() {
        return penanceContent;
    }

    public String getPenanceContent() {
        return penanceContent;
    }

    public void setPenanceContent(String penanceContent) {
        this.penanceContent = penanceContent;
    }
}
