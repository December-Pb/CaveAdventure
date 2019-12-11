public enum Dictionary {
    I("I", 0),
    SLAYED("slayed", 1),
    THE("the", 2),
    DIVA("diva", 3),
    DRAGON ("dragon",4),
    AND ("and", 5),
    ARE ("arde", 6),
    STILL ("still", 7),
    ALIVE ("alive", 8),
    WHAT ("what", 9),
    WOULD ("would", 10),
    YOU ("you", 11),
    LIKE ("like", 12),
    TO ("to", 13),
    DO("do", 14);
    private final String description;
    private final int code;
    public static final int NUMBER = 20;
    private Dictionary(String description, int code){
        this.description = description;
        this.code = code;
    }
    public String getDescription() {
        return description;
    }

    public int getCode() {
        return code;
    }
}
