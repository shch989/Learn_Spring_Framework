package com.in28minutes.learnspringframework;

public class AppGamingBasicJava {
  public static void main(String[] args) {
    
    //var marioGame = new MarioGame();
    //var superContraGame = new SuperContraGame();
    var game = new PacmanGame();
    var gameRunner = new GameRunner(game);
    gameRunner.run();
  }
}
