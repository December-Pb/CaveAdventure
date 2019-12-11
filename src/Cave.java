import java.util.ArrayList;
import java.util.List;

public class Cave extends GameBackground {
    public List<Adventure> getAdventureList() {
        return adventureList;
    }

    public void setAdventureList(List<Adventure> adventureList) {
        this.adventureList = adventureList;
    }

    List<Adventure> adventureList = new ArrayList<>();
}
