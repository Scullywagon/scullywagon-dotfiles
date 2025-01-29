import java.util.HashMap;

public class MapToPrice 
{
    private HashMap<ChristmasGift, Integer> myMap;

    public MapToPrice() {
        myMap = new HashMap<>();
    }

    public HashMap<ChristmasGift, Integer> getMyMap() {
        return myMap;
    }

    public void setMyMap(HashMap<ChristmasGift, Integer> myMap) {
        this.myMap = myMap;
    }

    public void addToMap(ChristmasGift cg)
    {
        myMap.put(cg, cg.getPrice());
    }


}
