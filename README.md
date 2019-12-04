# Pull the Flag

## Game Features

Pull the Flag is a typing game. Every five seconds a new word will appear and the goal 
of each player will be to write that word as many times as possible.

Players are divided in 2 teams - A and B. For each correctly typed word, the flag will move closer to that player's 
team.

The game ends when one of the teams "captures" the flag. When the game is over, a highscore table is showed and each player is able to see how many words they typed correctly.

## Game Setup
In the APP class, some game details must be configured:
1. In the WordGenerator constructor you should put the relative path of a file for the game to pull words from it. Any text file will do!
2. In the PlayingField constructor you should define the rope size. For the flag to appear exactly in the center, 
we recommend setting an odd number for the ropeSize arg. The longer the rope is, the longer the game will last!
3. In the Server constructor you should define the exact number of players for the game.
4. To play the game, just run the server and use netcat to create the players.
Note: terminal command --> "nc IPserver port".
