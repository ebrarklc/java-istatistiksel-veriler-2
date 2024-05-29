   public class VideoGameTest {
    public static void main(String[] args) {

        VideoGame game1 = new VideoGame("The Last Of Us 1",100,VideoGame.gameTypeList.Adventure,150 );
        VideoGame game2 = new VideoGame("the withcer",700,VideoGame.gameTypeList.Fighting,0);


        ShoppingSite site = new ShoppingSite("GameStore");
        site.addVideoGame(game1);
        site.addVideoGame(game2);




        System.out.println("Name of the game store: Game Center ");
        System.out.println("Name of the game: " + game1.getGameNAme());
        System.out.println("Price of the game: $" + game1.getGamePrice());
        System.out.println("Type of the game: " + game1.getGameType());
        System.out.println("Total game stock of the shopping site: " + ShoppingSite.getTotalGameStock());
    }
}