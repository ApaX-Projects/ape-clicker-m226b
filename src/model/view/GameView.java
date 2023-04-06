package model.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


import controller.Actionhandler;
import controller.MouseHover;
import controller.TimerC;
import model.score.Score;
import model.upgrades.UpgradeFour;
import model.upgrades.UpgradeOne;
import model.upgrades.UpgradeThree;
import model.upgrades.UpgradeTwo;

public class GameView
{
	
	public static Score sc = new Score();
	public static UpgradeOne up1 = new UpgradeOne();
	public static UpgradeTwo up2 = new UpgradeTwo();
	public static UpgradeThree up3 = new UpgradeThree();
	public static UpgradeFour up4 = new UpgradeFour();
	int timerSpeed;
	public static double perSec;

		
	public static JLabel labelCount, labelPerSecond;
	Font firstFont, SecFont;
	public static JButton button1, button2, button3, button4;
	TimerC timer;
	public static JTextArea message;
	MouseHover mHov = new MouseHover();
		
	Actionhandler action = new Actionhandler();
	
	/**
	 * ctor Creates the Font which is used by the User Interface
	 * Yes, I know... It's Comic Sans MS ;-)
	 */
	public void CreateFont()
	{
		
		// Fonts to distinguish different Parts of the game
		
		firstFont = new Font("Comic Sans MS", Font.PLAIN, 32);
		SecFont = new Font("Comic Sans MS", Font.PLAIN, 16);
		
	}
	
	/**
	 * ctor Creates the User Interface later seen when playing the game
	 */
	public void NewUI()
	{
		TimerC.timerState = false;
		perSec = 0;
		
		// JFrame that holds every Panel and Button later created
		
		JFrame window = new JFrame();
		window.setSize(1000, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.BLACK);
		window.setLayout(null);
		
		// JPanel which displays the JButton clickButton
		
		JPanel clickPanel = new JPanel();
		clickPanel.setBounds(100, 220, 200, 200);
		clickPanel.setBackground(Color.BLACK);
		
		window.add(clickPanel);
		
		
		ImageIcon ape = new ImageIcon("src/res/apeclick2.jpg");
		
		// JButton the player can click as often as he likes to get 1 Point each click
		
		JButton clickButton = new JButton();
		clickButton.setBounds(0, 0, 200, 200);
		clickButton.setBackground(Color.BLUE);
		clickButton.setFocusPainted(false);
		clickButton.setBorder(null);
		clickButton.setIcon(ape);
		clickButton.addActionListener(action);
		clickButton.setActionCommand("ape");
		
		clickPanel.add(clickButton);
		
		// JPanel to display the later created total Points and Points per second
		
		JPanel scorePanel = new JPanel();
		scorePanel.setBounds(100, 100, 200, 100);
		scorePanel.setBackground(Color.BLACK);
		scorePanel.setLayout(new GridLayout(2, 1));
		
		window.add(scorePanel);

		// JLabel to show the current Points which the player owns at the moment
		
		labelCount = new JLabel(sc.getScore() + " Points");
		labelCount.setForeground(Color.WHITE);
		labelCount.setFont(firstFont);
		
		scorePanel.add(labelCount);
		
		// New JLabel to show the currently generated Points per second
		
		labelPerSecond = new JLabel("per Second: " + perSec);
		labelPerSecond.setForeground(Color.WHITE);
		labelPerSecond.setFont(SecFont);
		
		scorePanel.add(labelPerSecond);
		
		// JPanel to display the later created Upgrade Buttons
		
		JPanel upgradePanel = new JPanel();
		upgradePanel.setBounds(600, 170, 250, 250);
		upgradePanel.setBackground(Color.BLUE);
		upgradePanel.setLayout(new GridLayout(4, 1));
		
		window.add(upgradePanel);
		
		// JButtons used for Displaying all the possible upgrades
		
		button1 = new JButton("Katta");
		button1.setFont(firstFont);
		button1.setFocusPainted(false);
		button1.addActionListener(action);
		button1.addMouseListener(mHov);
		button1.setActionCommand("katta");
		
		upgradePanel.add(button1);
		
		
		button2 = new JButton("Orangutan");
		button2.setFont(firstFont);
		button2.setFocusPainted(false);
		button2.addActionListener(action);
		button2.addMouseListener(mHov);
		button2.setActionCommand("orangutan");
		
		upgradePanel.add(button2);
		
		
		button3 = new JButton("Gorilla");
		button3.setFont(firstFont);
		button3.setFocusPainted(false);
		button3.addActionListener(action);
		button3.addMouseListener(mHov);
		button3.setActionCommand("gorilla");
		
		upgradePanel.add(button3);
		
		
		button4 = new JButton("King Kong");
		button4.setFont(firstFont);
		button4.setFocusPainted(false);
		button4.addActionListener(action);
		button4.addMouseListener(mHov);
		button4.setActionCommand("king");
		
		upgradePanel.add(button4);
		
		// JPanel gives a short description about the pricing and usage of the upgrade
		
		JPanel description = new JPanel();
		description.setBounds(500, 70, 250, 150);
		description.setBackground(Color.BLACK);
		
		window.add(description);
		
		// JTextArea is set into the description JPanel and sets the shown description when Hovering
		
		message = new JTextArea();
		message.setBounds(500, 70, 250, 150);
		message.setForeground(Color.WHITE);
		message.setBackground(Color.BLACK);
		message.setFont(SecFont);
		message.setLineWrap(true);
		message.setWrapStyleWord(true);
		message.setEditable(false);
		
		description.add(message);
		
		window.setVisible(true);
		
	}
	
}