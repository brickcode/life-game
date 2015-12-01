package edu.game.life;

import edu.game.life.Board;
import java.util.*;
 
public class Game {
 
    private Board board;
    private int width;
    private int height;
    private int steps;
    private Random random;

    public Game(int width, int height, int steps) {
	this.steps = steps;
        this.width = width;
        this.height = height;
        board = new Board(width, height);
	random = new Random();
	for (int i = 0; i < width; i++)
	{
		for (int j = 0; j < height; j++)
		{
			board.setCellValue(i,j,random.nextBoolean());
		}
	}
    }

    public void start()
    {
	boolean test = false;
	int loop = 0;
	while(test != true)
	{
	    System.out.println("Step: " + loop);
	    board.print();
	    board.nextCycle(); 	
	    test = board.testEnd();
	    loop = loop + 1;
	}
	System.out.println("Step: " + loop);
	board.print();
    }

    public static void main(String args[])
    {
	    Game X = new Game(40,120,0);
	    X.start();
    }
} 
