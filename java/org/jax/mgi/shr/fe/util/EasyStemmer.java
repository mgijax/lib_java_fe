package org.jax.mgi.shr.fe.util;

/* Wrapper over Stemmer class from:
 *		https://sourceforge.net/p/porterstemmer/code/HEAD/tree/trunk/Porter%20Stemmer/src/stemmer/Stemmer.java
 * Provides a more convenient interface for our purposes.
 */

public class EasyStemmer {
	Stemmer stemmer = new Stemmer();	// using the standard stemmer for the real work
	
	// Stem all the words in the given phrase and return the resulting string with words concatenated
	// using spaces.  Removes non-alphanumeric characters.
	public String stemAll(String phrase) {
		if (phrase == null) { return null; }

		// just remove single and double quotes with no extra space (for possessives)
		String noQuotes = phrase.replaceAll("['\\\"]", "");

		// replace non-alphanumerics with spaces
		String alphanumeric = noQuotes.replaceAll("[^A-Za-z0-9]", " ");

		// remove duplicate whitespace
		String condensed = alphanumeric.replaceAll("[\\s]+", " ");

		StringBuffer sb = new StringBuffer();
		for (String word : condensed.split(" ")) {
			if (sb.length() > 0) { sb.append(" "); }		// space between words
			sb.append(this.stem(word));
		}
		return sb.toString();
	}

	// Use the standard stemmer to return the stem for the given single 'word'.
	public String stem(String word) {
		stemmer.clear();
		stemmer.add(word);
		return stemmer.stem();
	}
	
	public static void main (String[] args) {
		StringBuffer words = new StringBuffer();
		for (String arg : args) {
			words.append(arg);
			words.append(" ");
		}
		String sentence = words.toString().trim();
		EasyStemmer es = new EasyStemmer();
		
		System.out.println("Original: " + sentence);
		System.out.println("Stemmed:  " + es.stemAll(sentence));
	}
}
