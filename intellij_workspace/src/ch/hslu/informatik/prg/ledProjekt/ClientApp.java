package ch.hslu.informatik.prg.ledProjekt;

import ch.hslu.prg.ledboard.proxy.Led;
import ch.hslu.prg.ledboard.proxy.BoardService;
import ch.hslu.prg.ledboard.proxy.LedColor;

public class ClientApp {

    private static final int MAX_ROWS = 32;
    public static void main(String[] args) {

        BoardService boardService = new BoardService();

        boardService.add(MAX_ROWS);

    }
}
