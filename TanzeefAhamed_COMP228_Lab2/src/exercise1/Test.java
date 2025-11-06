package exercise1;
import javax.swing.JOptionPane;
import java.util.Random;

public class Test {
    //Array to store all quiz questions
    private String[] questions;
    //Array to store correct answers for each question
    private char[] correctAnswers;
    //Random object for generating random messages
    private Random random;
    //Variable to track user's score
    private int score;
    //Variable to store total number of questions
    private int totalQuestions;

    //Constructor - runs when Test object is created
    public Test() {
        //Initialize random number generator
        random = new Random();
        //Start with zero score
        score = 0;
        //Set up all questions and answers
        setupQuestions();
    }

    //Method to create all questions and answers
    private void setupQuestions() {
        //Create array for 5 questions
        questions = new String[5];
        //Create array for 5 answers
        correctAnswers = new char[5];

        //Question 1 - Main method signature
        questions[0] = "What is the main method signature in Java?\nA. public static void main(String[] args)\nB. public void main(String[] args)\nC. public static void main()\nD. private static void main(String[] args)";
        correctAnswers[0] = 'A';

        //Question 2 - Final keyword
        questions[1] = "Which keyword is used to declare a variable that cannot be changed?\nA. final\nB. static\nC. const\nD. volatile";
        correctAnswers[1] = 'A';

        //Question 3 - Primitive data types
        questions[2] = "Which of these is NOT a Java primitive data type?\nA. int\nB. double\nC. String\nD. boolean";
        correctAnswers[2] = 'C';

        //Question 4 - Single line comments
        questions[3] = "What is the correct way to comment a single line in Java?\nA. // This is a comment\nB. /* This is a comment */\nC. <!-- This is a comment -->\nD. # This is a comment";
        correctAnswers[3] = 'A';

        //Question 5 - Instance variables
        questions[4] = "What does an instance variable describe?\nA. Measurement of an object\nB. Height of an object\nC. Behaviour of an object\nD. Properties of an object";
        correctAnswers[4] = 'D';

        //Set total questions based on array length
        totalQuestions = questions.length;
    }

    //Method to display one question to user
    public void simulateQuestion(int questionNumber) {
        //Create formatted question text with number
        String questionText = "Question " + (questionNumber + 1) + ":\n" + questions[questionNumber];
        //Show question in popup dialog
        JOptionPane.showMessageDialog(null, questionText);
    }

    //Method to check if user's answer is correct
    public boolean checkAnswer(int questionNumber, char userAnswer) {
        //Compare user answer with correct answer
        return userAnswer == correctAnswers[questionNumber];
    }

    //Method to generate random feedback messages
    public String generateMessage(boolean isCorrect) {
        //Check if answer was correct or wrong
        if (isCorrect) {
            //Generate random number 0-3 for correct messages
            switch (random.nextInt(4)) {
                case 0: return "Excellent!";
                case 1: return "Good!";
                case 2: return "Keep up the good work!";
                case 3: return "Nice work!";
                default: return "Well done!";
            }
        } else {
            //Generate random number 0-3 for wrong messages
            switch (random.nextInt(4)) {
                case 0: return "No. Please try again";
                case 1: return "Wrong. Try once more";
                case 2: return "Don't give up!";
                case 3: return "No. Keep trying.";
                default: return "Incorrect.";
            }
        }
    }

    //Method to get answer input from user
    public char inputAnswer(int questionNumber) {
        //Show input dialog asking for answer
        String input = JOptionPane.showInputDialog("Enter your answer (A, B, C, or D):");

        //Check if user clicked Cancel button
        if (input == null) {
            //Return space if user cancelled
            return ' ';
        }

        //Check if user entered something
        if (input.length() > 0) {
            //Convert first character to uppercase and return
            return Character.toUpperCase(input.charAt(0));
        }

        //Return space for empty input
        return ' ';
    }

    //Main method that runs the entire test
    public void startTest() {
        //Show welcome message
        JOptionPane.showMessageDialog(null, "Welcome to the Java Test! Press OK to start.");

        //Loop through all questions
        for (int i = 0; i < totalQuestions; i++) {
            //Display current question
            simulateQuestion(i);
            //Get user's answer for current question
            char userAnswer = inputAnswer(i);

            //Check if user wants to quit
            if (userAnswer == ' ') {
                //Show cancellation message and exit
                JOptionPane.showMessageDialog(null, "Test cancelled.");
                return;
            }

            //Check if answer is correct
            boolean isCorrect = checkAnswer(i, userAnswer);
            //Get random feedback message
            String message = generateMessage(isCorrect);

            //Handle correct answer
            if (isCorrect) {
                //Increase score
                score++;
                //Show success message
                JOptionPane.showMessageDialog(null, "✅ " + message);
            } else {
                //Add correct answer to wrong message
                message += "\nCorrect answer was: " + correctAnswers[i];
                //Show failure message
                JOptionPane.showMessageDialog(null, "❌ " + message);
            }
        }

        //Show final results after all questions
        showResults();
    }

    //Method to display final score and percentage
    private void showResults() {
        //Calculate percentage score
        double percentage = (double) score / totalQuestions * 100;

        //Create results message
        String results = "Test Completed!\n\n" +
                "Correct answers: " + score + "\n" +
                "Incorrect answers: " + (totalQuestions - score) + "\n" +
                "Percentage: " + String.format("%.1f", percentage) + "%";

        //Show results in popup
        JOptionPane.showMessageDialog(null, results);
    }
}