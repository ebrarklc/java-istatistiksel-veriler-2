public class VideoGame {
 private String gameName;
 private int gamePrice;
 private gameTypeList gameType;
 private int gameStock;
 private String storeName;

  public enum gameTypeList{
      Sports,
      Strategy,
      Simulation,
      Fighting,
      Adventure,
      Racing,
      Puzzle
  }

    public VideoGame(String gameNAme, int gamePrice, gameTypeList gameType, int gameStock) {
        this.gameName = gameNAme;
        this.gamePrice = gamePrice;
        this.gameType = gameType;
        this.gameStock = gameStock;
    }


    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getGameNAme() {
        return gameName;
    }
    public void setGameNAme(String gameNAme) {
        this.gameName = gameNAme;
    }

    public int getGamePrice() {
        return gamePrice;
    }
    public void setGamePrice(int gamePrice) {
        this.gamePrice = gamePrice;
    }
    public gameTypeList getGameType() {
        return gameType;
    }
    public void setGameType(gameTypeList gameType) {
        this.gameType = gameType;
    }
    public int getGameStock() {
        return gameStock;
    }
    public void setGameStock(int gameStock) {
        this.gameStock = gameStock;
    }
}
