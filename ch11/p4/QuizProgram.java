package ch11.p4;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class QuizProgram extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Assignment currentAssignment;
	private Level currentLevel;
	private Quiz currentQuiz;
	
	

	// JPanel holding quizelements   
	private JPanel quizPanel;
	private JLabel lblLevel;
	private JTextArea txtAreaDescription;
	private JTextArea txtAreaScore;
	private JLabel lblQuestion;
	private JTextArea txtAreaResponse;
	private JTextField txtAnswer;
	private JButton btnNewQuiz;
	private JButton btnCreateQuiz;
	private JButton btnAnswer ;
	private GridBagConstraints c;
	
	// JPanel for generating a new quiz 
	private JPanel newQuizPanel;
	private JLabel lblNumberOfQuestions;
	private JTextField txtNumberOfQuestions;
	private JLabel lblFailureTolerance;
	private JTextField txtFailureTolerance;
	private JLabel lblPointsToComplete;
	private JTextField txtPointsToComplete;
	private JTextArea txtAreaError; 
	 
	// Font  
	private final Font h1 = new Font("Arial", Font.BOLD, 16);
	
	// Constant string for user reponses  
	private final String QUESTION_TEXT = "What is: ";
	private final String RESPONSE_SUCCESS = "You were right!";
	private final String RESPONSE_FAILURE = "You were wrong. Try again";
	private final String LEVEL_SCORE = "Level score: ";
	private final String TOTAL_SCORE = "Total score: ";
	private final String QUIZ_FAILURE = "Bummer. You didn't get enough points to continue";

	/**
	 * public constructor for the QuizProgram 
	 */
	public QuizProgram() {
		drawForm();
	}
	
	/**
	 * 
	 * @param levels Number of levels in the quiz 
	 * @param numberOfQuestions Number of questions per level  
	 * @param failureTolerance Number of allowed tries per question  
	 * @param pointsToComplete Number of points to complete a level
	 */
	private void initQuiz(int levels, int numberOfQuestions, int failureTolerance, int pointsToComplete) {
		currentQuiz = new Quiz(failureTolerance, pointsToComplete);
		for (int i = 0; i < levels; i++) {
			currentQuiz.addLevel(i+1, numberOfQuestions);
		}
		currentLevel = currentQuiz.getLevel(0);
		currentAssignment = currentLevel.getAssignment(0);
		
		startQuiz();
	}

	/**
	 * Shows the quizinterface and starts the quiz     
	 */
	private void startQuiz() {
		this.remove(newQuizPanel);
		this.add(quizPanel);
		showQuestion();
	}

	/**
	 * Draws the GUI for the quiz
	 */
	private void drawForm() {  
		// Initializes a new JPanel related to generating a new quiz
		newQuizPanel = new JPanel();
		// Set the layout using a GridBagLayout
		newQuizPanel.setLayout(new GridBagLayout());
		c = new GridBagConstraints();
		c.insets.set(10, 10, 10, 10);
		
		lblNumberOfQuestions = new JLabel("# of questions: ");
		lblNumberOfQuestions.setSize(150, 30);
		// Sets constraints for the gridbaglayout
		c.anchor = GridBagConstraints.FIRST_LINE_START;
		// x and y coordinate of the component  
		c.gridx = 0;
		c.gridy = 0;
		
		// Add the component to the container 
		newQuizPanel.add(lblNumberOfQuestions, c);
		
		// Resets the gridbagconstraints   
		resetGridBagContraints();
		
		txtNumberOfQuestions = new JTextField(2);
		c.gridx = 1;
		c.gridy = 0;
		
		newQuizPanel.add(txtNumberOfQuestions, c);
		resetGridBagContraints();
		
		lblFailureTolerance = new JLabel("Tries per question");
		c.gridx = 0;
		c.gridy = 1;
		newQuizPanel.add(lblFailureTolerance, c);
		resetGridBagContraints();
		
		txtFailureTolerance = new JTextField(2);
		c.gridx = 1;
		c.gridy = 1;
		newQuizPanel.add(txtFailureTolerance, c);
		resetGridBagContraints();
		
		lblPointsToComplete = new JLabel("Points to complete level");
		c.gridx = 0;
		c.gridy = 2;
		
		newQuizPanel.add(lblPointsToComplete, c);
		resetGridBagContraints();
		
		txtPointsToComplete = new JTextField(2);
		c.gridx = 1;
		c.gridy = 2;
		newQuizPanel.add(txtPointsToComplete, c);
		resetGridBagContraints();
		
		btnCreateQuiz = new JButton("Create new quiz");
		btnCreateQuiz.addActionListener(this);
		c.anchor = GridBagConstraints.LINE_END;
		c.gridwidth = 2;
		c.gridx = 0;
		c.gridy = 3;
		newQuizPanel.add(btnCreateQuiz, c);
		
		resetGridBagContraints();
		
		txtAreaError = new JTextArea();
		txtAreaError.setBackground(this.getBackground());
		txtAreaError.setWrapStyleWord(true);
		txtAreaError.setLineWrap(true);
		c.fill = GridBagConstraints.BOTH;
		c.anchor = GridBagConstraints.LINE_START;
		c.gridx = 0;
		c.gridy = 4;
		c.gridwidth = 2;
		newQuizPanel.add(txtAreaError, c);
		
		resetGridBagContraints();
		
		// Initializes a new JPanel related to showing a quiz  
		quizPanel = new JPanel();
		quizPanel.setLayout(new GridBagLayout());
		c.insets.set(10, 10, 10, 10);

		resetGridBagContraints();

		lblLevel = new JLabel();
		lblLevel.setFont(h1);
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 2;
		c.weighty = 0.5;
		c.weightx = 0.5;
		c.anchor = GridBagConstraints.FIRST_LINE_START;
		quizPanel.add(lblLevel, c);

		resetGridBagContraints();

		txtAreaDescription = new JTextArea();
		txtAreaDescription.setSize(200, 100);
		txtAreaDescription.setBackground(this.getBackground());
		txtAreaDescription.setLineWrap(true);
		txtAreaDescription.setWrapStyleWord(true);
		txtAreaDescription.setEditable(false);
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 2;
		c.weightx = 1;
		c.weighty = 1;
		c.anchor = GridBagConstraints.FIRST_LINE_START;
		quizPanel.add(txtAreaDescription, c);

		resetGridBagContraints();

		lblQuestion = new JLabel();
		c.gridx = 0;
		c.gridy = 2;
		c.weightx = 0.5;
		c.anchor = GridBagConstraints.LINE_START;
		quizPanel.add(lblQuestion, c);

		resetGridBagContraints();

		txtAnswer = new JTextField(3);
		c.fill = GridBagConstraints.NONE;
		c.gridx = 1;
		c.gridy = 2;
		c.weightx = 0.1;
		c.anchor = GridBagConstraints.LINE_END;
		c.ipadx = 15;
		quizPanel.add(txtAnswer, c);

		resetGridBagContraints();

		btnAnswer = new JButton("Answer");
		btnAnswer.addActionListener(this);
		c.gridx = 1;
		c.gridy = 3;
		c.gridwidth = 1;
		c.weightx = 1;
		c.anchor = GridBagConstraints.LINE_END;

		quizPanel.add(btnAnswer, c);
		
		resetGridBagContraints();
		
		btnNewQuiz = new JButton("Create quiz");
		btnNewQuiz.addActionListener(this);
		btnNewQuiz.setVisible(false);
		c.gridx = 1;
		c.gridy = 3;
		c.gridwidth = 1;
		c.weightx = 1;
		c.anchor = GridBagConstraints.LINE_END;
		quizPanel.add(btnNewQuiz, c);
		

		resetGridBagContraints();

		txtAreaResponse = new JTextArea();
		txtAreaResponse.setSize(200, 30);
		txtAreaResponse.setBackground(this.getBackground());
		txtAreaResponse.setLineWrap(true);
		txtAreaResponse.setWrapStyleWord(true);
		c.gridx = 0;
		c.gridy = 4;
		c.fill = GridBagConstraints.HORIZONTAL;

		c.gridwidth = 2;
		quizPanel.add(txtAreaResponse, c);

		txtAreaScore = new JTextArea();
		txtAreaScore.setBackground(this.getBackground());
		c.gridx = 0;
		c.gridy = 5;
		c.fill = GridBagConstraints.HORIZONTAL;

		c.gridwidth = 2;
		quizPanel.add(txtAreaScore, c);

		this.add(newQuizPanel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(250, 400);
		this.setVisible(true);
	}

	/**
	 * Shows a question to the user 
	 */
	public void showQuestion() {
		// Write current level
		lblLevel.setText("Level " + String.valueOf(currentLevel.getLevel()));
		// Write the description for the quiz 
		txtAreaDescription.setText(currentQuiz.getDescription());
		// Write question text
		lblQuestion.setText(QUESTION_TEXT + currentAssignment.getQuestion());
		
		// Write the score 
		txtAreaScore.setText(
				LEVEL_SCORE + String.valueOf(currentLevel.getScore()) + "\n" + 
				TOTAL_SCORE + String.valueOf(currentQuiz.getScore()));
	}	

	/**
	 * Handles events for the JFrame 
	 */
	public void actionPerformed(ActionEvent e) {
		// Checks if the user tries to answer a question  
		if (e.getSource() == btnAnswer && checkInput(txtAnswer.getText())) {
			if (currentAssignment.isTrue(txtAnswer.getText())) {
				txtAreaResponse.setText(RESPONSE_SUCCESS);
				currentLevel.addScore();
				currentQuiz.addScore();
				
				txtAnswer.setText("");
				txtAnswer.requestFocus();

				// Advance to next question 
				advanceToNextQuestion();
			} else {
				// Add a failed attempt to the assignment 
				currentAssignment.addMiss();
				txtAreaResponse.setText(RESPONSE_FAILURE);
				txtAnswer.setText("");
				txtAnswer.requestFocus();
				// Check the number of failed attempts against the failure tolerance   
				if (currentAssignment.getMisses() > currentQuiz.getFailureTolerance()) {
					// The couldn't answer the question. Advance to the next question  
					advanceToNextQuestion();
				}
			}			
		}

		// Checks if the user is trying to generate a new quiz
		if (e.getSource() == btnCreateQuiz) {
			String error = "";
			
			int numberOfQuestions = 0;
			int failureTolerance = 0;
			int pointsToComplete = 0;
			// Check if the input is not empty and is a number 
			if (checkInput(txtNumberOfQuestions.getText())) {
				numberOfQuestions = Integer.valueOf(txtNumberOfQuestions.getText()); 
			} else {
				error += "# of questions is not a valid input\n";
			}
			
			// Check if the input is not empty and is a number			
			if (checkInput(txtFailureTolerance.getText()) ) {
				failureTolerance =  Integer.valueOf(txtFailureTolerance.getText());
			} else {
				error += "Tries per question is not a valid input\n"; 
			}
			
			// Check if the input is not empty and is a number			 
			if (checkInput(txtPointsToComplete.getText())) {
				pointsToComplete =  Integer.valueOf(txtPointsToComplete.getText()); 
			} else {
				error += "Points to complete level is not a valid input\n";
			}
			
			// Check if the number of questions is equal or higher 
			// than number of points to complete
			if (pointsToComplete > numberOfQuestions) {
				error += "# of questions must be equal or higher than number of points to complete.";
			}
			
			// Init a new quiz or write error message to the user 
			if (error.length() == 0) {
				initQuiz(3, numberOfQuestions, failureTolerance, pointsToComplete);
				txtNumberOfQuestions.setText("");
				txtFailureTolerance.setText("");
				txtPointsToComplete.setText("");
			} else {
				txtAreaError.setText(error);
			}
		}
		
		// Checks if the user wish to create a new quiz 
		if (e.getSource() == btnNewQuiz) {
			// Removes the JPanels from the parent JFrame   
			this.remove(quizPanel);
			this.remove(newQuizPanel);
			
			// redraws the form 
			drawForm();
		}
	}

	/**
	 * Determines if the next question or the next level should be shown 
	 * 
	 */
	private void advanceToNextQuestion() {
		int currentAssignmentIndex = currentLevel.getAssignments().indexOf(currentAssignment);
		if (currentAssignmentIndex < (currentLevel.getNumberOfAssignments()-1)) { 
			// Advances to the next question
			// Updates the current assignment 
			currentAssignment = currentLevel.getAssignment(currentAssignmentIndex + 1);
			showQuestion();
		} else {
			// No more questions in this level. Advance to the next level
			advanceToNextLevel();
		}
	}

	/**
	 * Determines if the user can advance to the next level. 
	 * If no more levels exists in the quiz a message is shown to the user 
	 *  
	 */
	private void advanceToNextLevel() {
		// Check if the user has enough points to continue 
		if (currentLevel.getScore() >= currentQuiz.getPointsToComplete()) {
			// Get the index of the current level
			int currentLevelIndex = currentQuiz.getLevels().indexOf(currentLevel) ;
			if (currentLevelIndex < currentQuiz.getLevels().size()-1) {
				// Advances to the next level
				// Updates the current assignment  
				currentLevel = currentQuiz.getLevel(currentLevelIndex + 1);
				currentAssignment = currentLevel.getAssignment(0);
				showQuestion();
			} else {
				// Show message to the user 
				// Allow the user to create a new quiz 
				txtAreaResponse.setText("Congratulations. You are a real wizz kid");
				txtAreaScore.setText(TOTAL_SCORE + String.valueOf(currentQuiz.getScore()));
				btnAnswer.setVisible(false);
				btnNewQuiz.setVisible(true);
			}
		} else {
			// The user failed the quiz 
			// Allow the user to create a new quiz
			txtAreaResponse.setText(QUIZ_FAILURE);
			txtAreaScore.setText(TOTAL_SCORE + String.valueOf(currentQuiz.getScore()));
			btnAnswer.setVisible(false);
			btnNewQuiz.setVisible(true);
		}
	}

	/**
	 * Resets the GridBagConstraints 
	 */
	private void resetGridBagContraints() {
		c.gridx = 0;
		c.gridy = 0;
		c.weightx = 0;
		c.weighty = 0;	
	}

	/**
	 * Checks if an input is not empty and is a number
	 * @param input Input to be checked  
	 * @return Returns true if the input is not empty and is a number 
	 */
	private boolean checkInput(String input) {
		if (input.length()== 0) return false;
		Pattern p = Pattern.compile("\\d*");
		Matcher m = p.matcher(input); // get a matcher object
		if (!m.matches()) return false;

		return true;
	} 
}