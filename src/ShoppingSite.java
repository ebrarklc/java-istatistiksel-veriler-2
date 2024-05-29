// ShoppingSite.java
import java.util.ArrayList;

public class ShoppingSite {
    private String storeName;
    private int videoGameCount;
    private static int totalGameStock;
    private ArrayList<VideoGame> videoGameList;

    public ShoppingSite(String storeName) {
        this.storeName = storeName;
        this.videoGameCount = 0;
        this.videoGameList = new ArrayList<>();
    }


    public void addVideoGame(VideoGame videoGame) {
        videoGameList.add(videoGame);
        totalGameStock += videoGame.getGameStock();
        videoGameCount++;
    }


    public String getStoreName() {
        return storeName;
    }

    public int getVideoGameCount() {
        return videoGameCount;
    }

    public static int getTotalGameStock() {
        return totalGameStock;
    }

    public ArrayList<VideoGame> getVideoGameList() {
        return videoGameList;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setVideoGameCount(int videoGameCount) {
        this.videoGameCount = videoGameCount;
    }

    public static void setTotalGameStock(int totalGameStock) {
        ShoppingSite.totalGameStock = totalGameStock;
    }

    public void setVideoGameList(ArrayList<VideoGame> videoGameList) {
        this.videoGameList = videoGameList;
    }
}