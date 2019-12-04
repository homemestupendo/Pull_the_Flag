package org.academiadecodigo.splicegirls;

import org.academiadecodigo.splicegirls.WordsGenerator.WordGenerator;

public class App {

    public static void main(java.lang.String[] args) {

        //****** SETUP GAME *******
        WordGenerator gameWord = new WordGenerator("resources/englishWords.txt");
        PlayersList playersList = new PlayersList();
        PlayingField playingField = new PlayingField(11);

        //***** CREATE SERVER AND START ******
        Server server = new Server(gameWord, playersList, playingField, 2);
        server.serverInit();

    }
}
