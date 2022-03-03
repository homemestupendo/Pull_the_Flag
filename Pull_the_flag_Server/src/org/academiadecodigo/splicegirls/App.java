package org.academiadecodigo.splicegirls;

import org.academiadecodigo.splicegirls.WordsGenerator.WordGenerator;

import java.util.stream.IntStream;

public class App {

    public static void main(java.lang.String[] args) {

        if(args.length != 4) {
            System.out.println("Usage: java -jar PullTheFlag.jar [port] [size-of-rope] [number-of-players] [path-to-words-file]");
            System.exit(1);
        }

        int port = Integer.parseInt(args[0]);
        int playingFieldSize = Integer.parseInt(args[1]);
        int numberOfPlayers = Integer.parseInt(args[2]);
        String filePath = args[3];

        //****** SETUP GAME *******
        WordGenerator gameWord = new WordGenerator(filePath);
        PlayersList playersList = new PlayersList();
        PlayingField playingField = new PlayingField(playingFieldSize);

        //****** CREATE SERVER AND START *******
        Server server = new Server(gameWord, playersList, playingField, port, numberOfPlayers);
        server.serverInit();

    }
}
