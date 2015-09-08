package org.jax.org.mgi.shr.fe.util;

// shared utility functions
public class TextFormat 
{
    /** convert all 'start' and 'stop' pair in 's' to be HTML
     *    superscript tags.
     * @param s the source String
     * @param start the String which indicates the position for the HTML
     *    superscript start tag "<sup>"
     * @param stop the String which indicates the position for the HTML
     *    superscript stop tag "</sup>"
     * @return String as 's', but with the noted replacement made.  returns
     *    null if 's' is null.  returns 's' if either 'start' or 'stop' is
     *    null.
     * @assumes nothing
     * @effects nothing
     * @throws nothing
     */
    public static String superscript (String s, String start, String stop) {

        // if any of the input parameters are null, just bail out
        if ((s == null) || (start == null) || (stop == null)) { return s; }

        // revert existing <sup></sup> tags;  this is done incase there is
        // a mixture of existing sup tags and others that need conversion
        s = s.replaceAll("<sup>", start);
        s = s.replaceAll("</sup>", stop);

        // find the first instance of 'start' and 'stop' in 's'.
        int startPos = s.indexOf(start);
        int stopPos = s.indexOf(stop);
        int startLen = start.length();    // chars to cut out for start
        int stopLen = stop.length();      // chars to cut out for stop
        int sectionStart = 0;             // position of char starting section

        // if either start/stop value does not appear, then short-circuit
        if (startPos == -1 || stopPos == -1) {
            return s;
        }

        StringBuffer sb = new StringBuffer();

        while ((startPos != -1) && (stopPos != -1) && (stopPos > startPos))
        {

            sb.append (s.substring(sectionStart, startPos));
            sb.append ("<sup>");
            sb.append (s.substring(startPos + startLen, stopPos));
            sb.append ("</sup>");

            sectionStart = stopPos + stopLen;
            startPos = s.indexOf(start, sectionStart);
            stopPos = s.indexOf(stop, sectionStart);
        }
        sb.append (s.substring(sectionStart));

        return sb.toString();
    }

    /** convenience wrapper over superscript(s, "<", ">"), which is the common use case
     */
    public static String superscript (String s) {
        if (s == null) {return "";}
        return superscript(s, "<", ">");
    }
    
    public String superscriptHTML(String s) {
    	return superscript(s).replace("</SUP>", "</span>").replace("<SUP>", "<span class='superscript'>");
    }
}
