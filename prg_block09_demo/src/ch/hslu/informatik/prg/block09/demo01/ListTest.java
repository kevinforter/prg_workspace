package ch.hslu.informatik.prg.block09.demo01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Board> boards = new Vector<>();
		
		Board a = new Board(2000, 80);
		
		boards.add(a);
		
		boards.add(new Board(180, 60));
		boards.add(new Board(600, 160));
		
		System.out.println("Anzahl Boards: " + boards.size());
		
		boards.remove(2);
		
		System.out.println("Anzahl Boards: " + boards.size());
		
		boards.add(1, new Board(400, 120));
		
		for (Iterator<Board> it = boards.iterator(); it.hasNext(); ) {
			System.out.println(it.next());
		}
	}

}
