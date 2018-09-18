public class Main {

    public static void main(String[] args) {

            Game game = GameFactory.createGame("Archery");

            //First chance
            game.addPoint("4");
            game.addPoint("6");

            //Second chance
            game.addPoint("10");
            game.addPoint("X");

            //Third chance
            game.addPoint("0");
            game.addPoint("10");

            //Fourth chance
            game.addPoint("3");
            game.addPoint("4");

            //Fifth chance
            game.addPoint("3");
            game.addPoint("1");

            //Sixth chance
            game.addPoint("0");
            game.addPoint("5");

            //seventh chance
            game.addPoint("9");
            game.addPoint("0");

            //Eighth chance
            game.addPoint("2");
            game.addPoint("1");

            //Ninth chance
            game.addPoint("5");
            game.addPoint("2");

            //Last chance
            game.addPoint("3");
            game.addPoint("2");


            System.out.println("Total score = " +game.score());

        }
}
