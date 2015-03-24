
import java.util.*;
import java.io.*;

public class Highscore {
	// An arraylist of the type "score" we will use to work with the scores
	// inside the class
	private ArrayList<Score> scores;
	//Highscore hm1 = new Highscore();

	// The name of the file where the highscores will be saved
	private static final String HIGHSCORE_FILE = "scores.dat";

	// Initialising an in and outputStream for working with the file
	ObjectOutputStream outputStream = null;
	ObjectInputStream inputStream = null;

	public Highscore() {
		// initialising the scores-arraylist
		scores = new ArrayList<Score>();
	}

	public ArrayList<Score> getScores() {
		loadScoreFile();
		sort();
		return scores;
	}
	
	public double bestimmteAngabe(){ //rufen Score aus bestimmter Stelle
		
		ArrayList<Score> scores;
		scores = getScores();
		
		double i = scores.get(1).getScore();
		return i;
	}
	
	public String bestimmteName(int index){ //rufen Name aus bestimmter Stelle

		ArrayList<Score> scores;
		scores = getScores();
		
		String name = scores.get(index).getNaam();
		return name;
	}
	
	public void rewriteScore(String name, int score) { //Mod version von addScore
		int oldScore,newScore;
		loadScoreFile();
		int index=0;
		while(index<10){
			if(name.equals(bestimmteName(index))){ 		//if name = existierte Name, dann add to exist score
				oldScore = scores.get(index).getScore();
				newScore = oldScore + score;
				score = newScore;
				//System.out.println("yay"+scores.get(index).getScore());
				//System.out.println(newScore);
			} else { //else add new name and new score
				scores.add(new Score(name, score));
			}
			index++;
		}
		updateScoreFile();
	}
	
	public void totalReCheck(){
		int index = 0;
		while(index<10){
			
		}
	}
	

	private void sort() {
		ScoreCompare comparator = new ScoreCompare();
		Collections.sort(scores, comparator);
	}

	public void addScore(String name, int score) {
		loadScoreFile();
		scores.add(new Score(name, score));
		updateScoreFile();
	}

	public void loadScoreFile() {
		try {
			inputStream = new ObjectInputStream(new FileInputStream(
					HIGHSCORE_FILE));
			scores = (ArrayList<Score>) inputStream.readObject();
		} catch (FileNotFoundException e) {
			System.out.println("[Laad] FNF Error: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("[Laad] IO Error: " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("[Laad] CNF Error: " + e.getMessage());
		} finally {
			try {
				if (outputStream != null) {
					outputStream.flush();
					outputStream.close();
				}
			} catch (IOException e) {
				System.out.println("[Laad] IO Error: " + e.getMessage());
			}
		}
	}

	public void updateScoreFile() {
		try {
			outputStream = new ObjectOutputStream(new FileOutputStream(
					HIGHSCORE_FILE));
			outputStream.writeObject(scores);
		} catch (FileNotFoundException e) {
			System.out.println("[Update] FNF Error: " + e.getMessage()
					+ ",the program will try and make a new file");
		} catch (IOException e) {
			System.out.println("[Update] IO Error: " + e.getMessage());
		} finally {
			try {
				if (outputStream != null) {
					outputStream.flush();
					outputStream.close();
				}
			} catch (IOException e) {
				System.out.println("[Update] Error: " + e.getMessage());
			}
		}
	}

	public String getHighscoreString() {
		String highscoreString = "";
		int max = 10;

		ArrayList<Score> scores;
		scores = getScores();

		int i = 0;
		int x = scores.size();
		if (x > max) {
			x = max;
		}
		while (i < x) {
			highscoreString += (i + 1) + ".\t" + scores.get(i).getNaam()
					+ "\t\t" + scores.get(i).getScore() + "\n";
			i++;
		}
		return highscoreString;
	}
}