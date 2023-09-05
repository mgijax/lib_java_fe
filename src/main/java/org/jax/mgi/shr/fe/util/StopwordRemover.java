package org.jax.mgi.shr.fe.util;

import java.util.Arrays;
import java.util.List;

/* Is: a class tasked with removing stopwords from Strings
 */
public class StopwordRemover {
	// list of stopwords to remove
	private static List<String> stopwords = Arrays.asList("a", "also", "and", "are", "as", "at", "be",
                "can", "from", "in", "is", "it", "its", "like", "or", "of", "the", "not", "their", "there",
                "this", "to", "too", "with", "which");
	
	// Remove all stopwords from the given 'phrase' in a case-insensitive manner, then condense consecutive
	// whitespace down to single spaces.
	public String remove(String phrase) {
		if (phrase == null) { return null; }
		
		String temp = phrase;
		for (String stopword : stopwords) {
			// Look for the stopword with word boundaries on each end, searching in a case-insensitive manner.
			temp = temp.replaceAll("(?i)\\b" + stopword + "\\b", "");
		}
		return temp.replaceAll("[\\s]+", " ");
	}

	// main program for testing -- will remove stopwords from all arguments from the command-line
	public static void main (String[] args) {
		StringBuffer words = new StringBuffer();
		for (String arg : args) {
			words.append(arg);
			words.append(" ");
		}
		String sentence = words.toString().trim();
		StopwordRemover sr = new StopwordRemover();
		
		System.out.println("Original: " + sentence);
		System.out.println("Stemmed:  " + sr.remove(sentence));
	}
}
