/**
 * 
 */
package main;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.rmi.CORBA.Tie;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * @author ngapham
 *
 */
public class Game {
	
	/**
	 * Graphic properties
	 */
	// Global properties
	JFrame window;
	Container container;
	Font textNormalFont;
	
	/*-------------START SCREEN-----------------*/
	// Panel for title appearing on top of screen
	JPanel titleNamePanel;
	JLabel titleNameLabel;
	
	// Panel for start button
	JPanel startButtonPanel;
	JButton startButton;
	
	/*-------------PLAY SCREEN----------------*/
	// Panel for player characteristics
	JPanel playerPanel;
	JLabel hpLabel, hpValue; //weaponLabel, weaponValue;
	Hero mario;
	
	// Panel for instruction text
	JPanel mainTextPanel;
	JTextArea mainTextArea;
	String location;
	
	// Panel for multiple choice
	JPanel multiChoicePanel;
	JButton _1stChoice, _2ndChoice, _3rdChoice, _4thChoice;
	
	/**
	 * Action Properties
	 */
	StartScreenHandler ssHandler;
	PlayScreenHandler psHandler;
	private boolean inGame;

	/**
	 * Default constructor: 
	 */
	public Game() {
		init();
	}
	
	private void init() {
		ssHandler = new StartScreenHandler();
		psHandler = new PlayScreenHandler();
		textNormalFont = new Font("Times New Roman", Font.PLAIN, 30);
		location = new String();
		inGame = true;
	}
	
	/**
	 * START SCREEN
	 */
	private void createStartScene() {
		window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(null);
		window.setVisible(true);
		
		container = window.getContentPane();
		container.setBackground(Color.BLACK);

		// Start title
		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(100, 100, 600, 150);
		titleNamePanel.setBackground(Color.BLACK);
		
		titleNameLabel = new JLabel("MARIOLIKE");
		titleNameLabel.setForeground(Color.WHITE); 
		titleNameLabel.setFont(new Font("Times New Roman", Font.PLAIN, 90));
		titleNamePanel.add(titleNameLabel);
		
		container.add(titleNamePanel);
		
		// Start button
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(300, 400, 200, 100);
		startButtonPanel.setBackground(Color.BLACK);
		
		startButton = new JButton("START");
		startButton.setBackground(Color.BLACK);
		startButton.setForeground(Color.WHITE);
		startButton.setFont(textNormalFont);
		startButton.setFocusPainted(false);
		startButton.addActionListener(ssHandler);
		startButtonPanel.add(startButton);
		
		container.add(startButtonPanel);
	}

	/**
	 * PLAY SCENE
	 */
	public void createPlayScene() {
		titleNamePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		
		// Player area
		playerPanel = new JPanel();
		playerPanel.setBounds(100, 15, 600, 50);
		playerPanel.setBackground(Color.BLACK);
		playerPanel.setLayout(new GridLayout(1, 4));
		
		hpLabel = new JLabel("HP: ");
		hpLabel.setForeground(Color.WHITE);
		hpLabel.setFont(textNormalFont);
		playerPanel.add(hpLabel);
		
		hpValue = new JLabel();
		hpValue.setForeground(Color.WHITE);
		hpValue.setFont(textNormalFont);
		playerPanel.add(hpValue);
		/*
		weaponLabel = new JLabel("Weapon: ");
		weaponLabel.setForeground(Color.WHITE);
		weaponLabel.setFont(textNormalFont);
		playerPanel.add(weaponLabel);
		
		weaponValue = new JLabel();
		weaponValue.setForeground(Color.WHITE);
		weaponValue.setFont(textNormalFont);
		playerPanel.add(weaponValue);
		*/
		container.add(playerPanel);
		
		// Instruction text area
		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(100, 100, 600, 250);
		mainTextPanel.setBackground(Color.BLACK);
		
		mainTextArea = new JTextArea();
		mainTextArea.setBounds(100, 100, 600, 250);
		mainTextArea.setBackground(Color.BLACK);
		mainTextArea.setForeground(Color.WHITE);
		mainTextArea.setFont(textNormalFont);
		mainTextArea.setLineWrap(true);
		mainTextPanel.add(mainTextArea);
		
		container.add(mainTextPanel);
		
		// Multiple choice area
		multiChoicePanel = new JPanel();
		multiChoicePanel.setBounds(250, 350, 300, 150);
		multiChoicePanel.setBackground(Color.BLACK);
		multiChoicePanel.setLayout(new GridLayout(4, 1));
		
		_1stChoice = new JButton();
		_1stChoice.setBackground(Color.BLACK);
		_1stChoice.setForeground(Color.WHITE);
		_1stChoice.setFont(textNormalFont);
		_1stChoice.setActionCommand("c1");
		_1stChoice.addActionListener(psHandler);
		multiChoicePanel.add(_1stChoice);
		
		_2ndChoice = new JButton();
		_2ndChoice.setBackground(Color.BLACK);
		_2ndChoice.setForeground(Color.WHITE);
		_2ndChoice.setFont(textNormalFont);
		_2ndChoice.setActionCommand("c2");
		_2ndChoice.addActionListener(psHandler);
		multiChoicePanel.add(_2ndChoice);
		
		_3rdChoice = new JButton();
		_3rdChoice.setBackground(Color.BLACK);
		_3rdChoice.setForeground(Color.WHITE);
		_3rdChoice.setFont(textNormalFont);
		_3rdChoice.setActionCommand("c3");
		_3rdChoice.addActionListener(psHandler);
		multiChoicePanel.add(_3rdChoice);
		
		_4thChoice = new JButton();
		_4thChoice.setBackground(Color.BLACK);
		_4thChoice.setForeground(Color.WHITE);
		_4thChoice.setFont(textNormalFont);
		_4thChoice.setActionCommand("c4");
		_4thChoice.addActionListener(psHandler);
		multiChoicePanel.add(_4thChoice);
		
		container.add(multiChoicePanel);
	}
	
	public void initPlayer() {
		mario = new Hero();
		hpValue.setText(String.valueOf(mario.healthPoints));
//		weaponValue.setText(mario.numberOfBomb + " bombs");
	}
	
	public void goBombArea() {
		location = "Bomb Area";
		mainTextArea.setText("There are 1 bomb in the floor. What do you do?");
		_1stChoice.setText(Action.PICK.getActionName());
		_2ndChoice.setText(Action.JUMP.getActionName());
		_3rdChoice.setText("");
		_4thChoice.setText("");
	}
	
	public void goHole() {
		location = "Hole";
		hpValue.setText(String.valueOf(mario.getHealthPoints()));
//		weaponValue.setText(mario.numberOfBomb + " bombs");
		mainTextArea.setText("There are a hole in the floor. What do you do?");
		_1stChoice.setText(Action.WALK.getActionName());
		_2ndChoice.setText(Action.JUMP.getActionName());
		_3rdChoice.setText("");
		_4thChoice.setText("");
	}
	
	public void goMonster() {
		hpValue.setText(String.valueOf(mario.getHealthPoints()));
		//TODO: Display text telling user that he have pickup/not pickup bomb/mushroom
		mainTextArea.setText("A monster is standing and threatening you. What do you do?");
		_1stChoice.setText(Action.ATTACK.getActionName());
		_2ndChoice.setText(Action.JUMP.getActionName());
		_3rdChoice.setText(Action.WALK.getActionName());
		_4thChoice.setText("");
	}
	
	public void goMushroomArea() {
		location = "Mushroom Area";
		String preDescription;
		int current_hp = mario.getHealthPoints();
		if (current_hp == 0) {	// Attack the monster and die
			createEndScene();
		} else {
			if (Integer.parseInt(hpValue.getText()) == mario.getHealthPoints()) // Jump over the monster
			{
				preDescription = "You didnot attack the monster. Your HP will be reserved.\n";
			} else {	// Attack the monster and win
				preDescription = "You attacked the monster. Your HP decreases to 3.\n";
				hpValue.setText(String.valueOf(mario.getHealthPoints()));
			}
			mainTextArea.setText(preDescription + " There are a mushroom in the floor. What do you do?");
			_1stChoice.setText(Action.PICK.getActionName());
			_2ndChoice.setText(Action.JUMP.getActionName());
			_3rdChoice.setText("");
			_4thChoice.setText("");
		}	
	}
	
	public void goBigMonster() {
		location = "Big Monster";
		hpValue.setText(String.valueOf(mario.getHealthPoints()));
		mainTextArea.setText("A BIG MONSTER is standing and preventing you to meet princess. What do you do?");
		_1stChoice.setText(Action.ATTACK.getActionName());
		_2ndChoice.setText(Action.JUMP.getActionName());
		_3rdChoice.setText(Action.WALK.getActionName());
		_4thChoice.setText("");
	}
	
	// Go to Play Screen when pressing Start button
	public class StartScreenHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			createPlayScene();
			// Initial player with HP = 10 and bomb = "0"
			initPlayer();
			goBombArea();
		}
	}
	
	public void createEndScene() {
		multiChoicePanel.setVisible(false);
		hpValue.setText(String.valueOf(mario.healthPoints));
		if (!inGame || mario.getHealthPoints() == 0) {
			// Die
			mainTextArea.setText("Oh, you have died! You have lost the game.");
		}
		else {
			// Win
			mainTextArea.setText("Congratulations! You have defeated the big monster and save princess Anna. You are true hero!");
		}
	
	}
	
	// Acion when playing
	public class PlayScreenHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			String userChoice = event.getActionCommand();
			
			switch (location) {
			case "Bomb Area":
				switch (userChoice) {
				case "c1": //PICK
					mario.pickupBomb(new Bomb());
					goHole(); 
					break;
				case "c2": //JUMP
					goHole();
					break;
				case "c3": break;
				case "c4": break;
				
				}
				break;
				
			case "Hole":
				switch(userChoice) {
				case "c1": //WALK
					inGame = false;
					createEndScene();
					break;
				case "c2": //JUMP
					location = "Monster";
					goMonster(); 
					break;
				case "c3": break;
				case "c4": break;
				}
				break;
			
			case "Monster":
				switch(userChoice) {
				case "c1": //ATTACK
					mario.attackMonster(new Monster());
					goMushroomArea();
					break;
				case "c2": //JUMP
					goMushroomArea();
					break;
				case "c3": //WALK
					inGame = false;
					createEndScene();
					break;
				case "c4": break;
				}
				break;
				
			case "Mushroom Area":
				switch(userChoice) {
				case "c1": //PICK
					mario.pickupMushroom(new Mushroom());
					location = "Monster 2";
					goMonster();
					break;
				case "c2": //JUMP
					location = "Monster 2";
					goMonster();
					break;
				case "c3": 
					
					break;
				case "c4": break;
				}
				break;
			
			case "Monster 2":
				switch(userChoice) {
				case "c1": //ATTACK
					mario.attackMonster(new Monster());
					goBigMonster();
					break;
				case "c2": //JUMP
					goBigMonster();
					break;
				case "c3": //WALK
					inGame = false;
					createEndScene();
					break;
				case "c4": break;
				}
				break;
				
			case "Big Monster":
				switch(userChoice) {
				case "c1": //ATTACK
					mario.attackBigMonster(new BigMonster());
					createEndScene();
					break;
				case "c2": //JUMP
					inGame = false;
					createEndScene();
					break;
				case "c3": //WALK
					inGame = false;
					createEndScene();
					break;
				case "c4": break;
				}
				break;
			}
		}
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Game game = new Game();
		game.createStartScene();
		while (game.inGame) {
			
		}
	}
}





