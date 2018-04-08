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
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

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
//	StartScreenHandler ssHandler;
	PlayScreenHandler psHandler;
	private boolean inGame;
	List<Scene> maps;
	ListIterator<Scene> it;
	Scene currentScn;

	/**
	 * Default constructor: 
	 */
	public Game() {
		init();
		initPlayer();
		initMap();
		createStartScene();
	}
	
	private void init() {
		psHandler = new PlayScreenHandler();
		textNormalFont = new Font("Times New Roman", Font.PLAIN, 30);
		location = new String();
		inGame = true;
	}
	
	private void initMap() {
		maps = new ArrayList<Scene>();
		// Start scene
		Scene startScn = new Scene("MARIOLIKE", "", mario);
		maps.add(startScn);
		maps.add(new Scene("BOMB AREA", "There is a bomb on the floor. \nWhat do you do?", mario).setUsefulObject(new Bomb()));
		maps.add(new Scene("HOLE", "There is a hole in the floor. \nWhat do you do?", mario).setDangerousObject(new Hole()));
		maps.add(new Scene("MONSTER AREA", "A monster is standing in front of you \nand threatening you. \nWhat do you do?", mario).setDangerousObject(new Monster()));
		maps.add(new Scene("MUSHROOM AREA", "There is a mushroom on the floor. \nWhat do you do?", mario).setUsefulObject(new Mushroom()));
		maps.add(new Scene("MONSTER AREA", "A monster is standing in front of you \nand threatening you. \nWhat do you do?", mario).setDangerousObject(new Monster()));
		maps.add(new Scene("BIG MONSTER", "A BIG MONSTER is standing in front of you and \npreventing you to meet the princess. \nWhat do you do?", mario).setDangerousObject(new BigMonster()));
		maps.add(new Scene("THE END", "", mario));
		
		it = maps.listIterator();
		currentScn = startScn;
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
		
		titleNameLabel = new JLabel(currentScn.getName());
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
		startButton.addActionListener(psHandler);
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
		
		hpValue = new JLabel(String.valueOf(mario.getHealthPoints()));
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
				preDescription = "You did not attack the monster. \nYour HP will be reserved.\n";
			} else {	// Attack the monster and win
				preDescription = "You attacked the monster. \nnYour HP decreases to 3.\n";
				hpValue.setText(String.valueOf(mario.getHealthPoints()));
			}
			mainTextArea.setText(preDescription + " There are a mushroom on the floor. \nWhat do you do?");
			_1stChoice.setText(Action.PICK.getActionName());
			_2ndChoice.setText(Action.JUMP.getActionName());
			_3rdChoice.setText("");
			_4thChoice.setText("");
		}	
	}
	
	public void createEndScene() {
		multiChoicePanel.setVisible(false);
		hpValue.setText(String.valueOf(mario.healthPoints));
		if (!inGame || mario.getHealthPoints() == 0) {
			// Die
			mainTextArea.setText("Oh, you have died! \nYou have lost the game.");
		}
		else {
			// Win
			mainTextArea.setText("Congratulations! \n You have defeated the big monster and saved princess Anna. \nYou are true hero!");
		}
	
	}
	
	/* Update graphics */
	private void update(Scene scene) {
		mainTextArea.setText(scene.getDescription());
		// Update player Panel
		if (Integer.parseInt(hpValue.getText()) == mario.getHealthPoints()) 
		{
			
		} else {
			hpValue.setText(String.valueOf(mario.getHealthPoints()));
		}
		// Update multichoice button
		if (null != scene.getUsefulObject()) {
			List<Action> actions = scene.getUsefulObject().getActions();
			while (!actions.isEmpty()) {
				_1stChoice.setText(actions.get(0).getActionName());
				actions.remove(0);
				_2ndChoice.setText(actions.get(0).getActionName());
				actions.remove(0);
			}
		} else {
			if (null != scene.getDangerousObject()) {
				List<Action> actions = scene.getDangerousObject().getActions();
				while (!actions.isEmpty()) {
					_1stChoice.setText(actions.get(0).getActionName());
					actions.remove(0);
					_2ndChoice.setText(actions.get(0).getActionName());
					actions.remove(0);
					_3rdChoice.setText(actions.get(0).getActionName());
					actions.remove(0);
				}
			}
		}
	}
	
	// Acion when playing
	public class PlayScreenHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			
			if (currentScn == maps.get(0)) {	// START SCENE
				createPlayScene();
				it.next();
				currentScn = it.next();
				update(currentScn);
			} else {
				System.out.println(currentScn.getName());
				String userChoice = event.getActionCommand();
				
				switch (currentScn.getName()) {
				case "BOMB AREA":
					switch (userChoice) {
					case "c1": //PICK
						mario.pickupBomb((Bomb) currentScn.getUsefulObject());
						currentScn = it.next();
						break;
					case "c2": //JUMP
						currentScn = it.next();
						break;
					case "c3": break;
					case "c4": break;
					
					}
					update(currentScn);
					break;
					
				case "HOLE":
					switch(userChoice) {
					case "c1": //WALK
						inGame = false;
						createEndScene();
						break;
					case "c2": //JUMP
						currentScn = it.next();
						update(currentScn);
						break;
					case "c3": break;
					case "c4": break;
					}
					
					break;
				
				case "MONSTER AREA":
					switch(userChoice) {
					case "c1": //WALK
						inGame = false;
						createEndScene();
						break;
					case "c2": //JUMP
						currentScn = it.next();
						update(currentScn);
						break;
					case "c3": //ATTACK
						mario.attackMonster(new Monster());
						currentScn = it.next();
						update(currentScn);
						break;
					case "c4": break;
					}
					
					break;
					
				case "MUSHROOM AREA":
					switch(userChoice) {
					case "c1": //PICK
						mario.pickupMushroom(new Mushroom());
						currentScn = it.next();
						break;
					case "c2": //JUMP
						currentScn = it.next();
						break;
					case "c3": 
						
						break;
					case "c4": break;
					}
					update(currentScn);
					break;
					
				case "BIG MONSTER":
					switch(userChoice) {
					case "c1": //ATTACK
						mario.attackBigMonster(new BigMonster());
						currentScn = it.next();
						createEndScene();
						break;
					case "c2": //JUMP
						inGame = false;
						currentScn = it.next();
						createEndScene();
						break;
					case "c3": //WALK
						inGame = false;
						currentScn = it.next();
						createEndScene();
						break;
					case "c4": break;
					}
					
					break;
				}
			}
		}
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Game game = new Game();
		while (game.inGame) {
			
		}
	}
}





