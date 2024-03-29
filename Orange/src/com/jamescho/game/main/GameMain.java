package com.jamescho.game.main;

import javax.swing.JFrame;

public class GameMain {
	
	private static final String GAME_TITLE = "The Orange Game";
	public static final int GAME_WIDTH = 360;
	public static final int GAME_HEIGHT = 640;
	public static Game sGame;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame(GAME_TITLE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		sGame = new Game(GAME_WIDTH, GAME_HEIGHT);
		frame.add(sGame);
		frame.pack();
		frame.setVisible(true);
		frame.setIconImage(Resources.iconImg);
	}
	
}
