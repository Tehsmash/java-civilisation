import java.util.ArrayList;

/**
 * Class representing a single map location.
 * User: Nathan Cannon
 * Date: 22/05/12
 * Time: 21:46
 */
public class MapNode {
    private ArrayList<MapNode> neighbours;
    private boolean ocean;
    private boolean coast;
    private int support;
    private boolean floodplain;
    private boolean cityPoint;
    private int cityBuilt = -1;

    public MapNode(ArrayList<MapNode> neighbours, boolean ocean, boolean coast, int support, boolean floodplain, boolean cityPoint)
    {
        this.neighbours = neighbours;
        this.ocean = ocean;
        this.coast = coast;
        this.support = support;
        this.floodplain = floodplain;
        this.cityPoint = cityPoint;
    }

    public ArrayList<MapNode> getNeighbours() {
        return neighbours;
    }

    public boolean isOcean() {
        return ocean;
    }

    public boolean isCoast() {
        return coast;
    }

    public int getSupport() {
        return support;
    }

    public boolean isFloodplain() {
        return floodplain;
    }

    public boolean isCityPoint() {
        return cityPoint;
    }

    public int getCityBuilt() {
        return cityBuilt;
    }

    public void setCityBuilt(int cityBuilt) {
        this.cityBuilt = cityBuilt;
    }
}
