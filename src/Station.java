import java.util.ArrayList;
import java.util.List;

public class Station {
    private String stationName;
    private String stationId;
    private List<Platform> platformList;

    public Station(String stationName, String stationId) {
        this.stationName = stationName;
        this.stationId = stationId;
        this.platformList = new ArrayList<>();
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public List<Platform> getPlatformList() {
        return platformList;
    }

    public void setPlatformList(List<Platform> platformList) {
        this.platformList = platformList;
    }

    @Override
    public String toString() {
        return "Station{" +
                "stationName='" + stationName + '\'' +
                ", stationId='" + stationId + '\'' +
                ", platformList=" + platformList +
                '}';
    }
}
