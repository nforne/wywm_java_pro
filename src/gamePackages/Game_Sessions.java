package gamePackages;

import netscape.javascript.JSObject;

import java.util.ArrayList;

public class Game_Sessions {
    public ArrayList<JSObject> games;
    public JSObject game;
    public Game_Sessions(ArrayList<JSObject> games, JSObject game) {
        this.games = games;
        this.game = game;
    }

    public ArrayList<JSObject> getGames() {
        return games;
    }

    public void setGames(ArrayList<JSObject> games) {
        this.games = games;
    }

    public JSObject getGame() {
        return game;
    }

    public void setGame(JSObject game) {
        this.game = game;
    }

    public void  updateGames(JSObject game){
        this.games.add(game);
    }

}
