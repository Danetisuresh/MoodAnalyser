package com.bridgelabz;
/**
 * Purpose  - “I am in Sad Mood” message Should Return HAPPY
 */

public class MoodAnalyser {
	public static String analyseMood(String message) {
		if (message.toLowerCase().contains("sad")) {
		return "Sad";
	}
  else if (message.toLowerCase().contains("Happy")) {
  }
	return "Happy";
 }
}
