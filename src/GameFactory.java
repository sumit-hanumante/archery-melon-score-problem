public class GameFactory {

    public static Game createGame(String type)
    {
        switch (type){
            case "Archery":
                return new ArcheryMelonGame();
        }
        return null;
    }

}
