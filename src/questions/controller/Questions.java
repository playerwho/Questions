package questions.controller;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Questions
{
	private Scanner myScanner;
	public Questions()
	{
		myScanner = new Scanner(System.in);
	}

	public void start()
	{
		askQuestionsGUI();
		askQuestions();
	}
	
	private void askQuestions()
	{
		System.out.println("What would you like for breakfast?");
		String answer = myScanner.next();
		System.out.println("Wow, "+ answer +" sounds like a good breakfast!");
	}
	
	private void askQuestionsGUI()
	{
		JOptionPane.showMessageDialog(null, "What do you want for breakfast?");
		String myAnswer = JOptionPane.showInputDialog(null, "What do you want for breakfast?");
		myAnswer = JOptionPane.showInputDialog(null, "oh! is that so? " + myAnswer + " doesn't seem like a good choice");
		myAnswer = JOptionPane.showInputDialog(null, "What do you like?");
		myAnswer = JOptionPane.showInputDialog(null, "Cool, I think " + myAnswer + " is a great thing");
	}
}
