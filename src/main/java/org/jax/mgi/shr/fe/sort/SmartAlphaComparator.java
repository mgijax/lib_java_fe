package org.jax.mgi.shr.fe.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/*
 * "smart alpha" means Zfp10 comes after zfp9, instead of zfp1.
 * It sorts each group of alpha and numeric phrases.
 * 
 * author kstone
 * 
 */
public class SmartAlphaComparator implements Comparator<String> 
{
	/* The following algorithm was taken from the symbolsort module in lib python */
	
	private Set<Character> digits = new HashSet<Character>(Arrays.asList('0','1','2','3','4','5','6','7','8','9'));
	private ArrayList<Object> splitter (String s)
	{
		ArrayList<Object> splits = new ArrayList<Object>();
		if(s==null || s=="")
		{
			splits.add(s);
			return splits;
		}
		int last = 0;
		s  = s.toLowerCase();

		boolean inDigits = digits.contains(s.charAt(0));

		for (int i =0; i < s.length();i++)
		{
			if (digits.contains(s.charAt(i)) != inDigits)
			{
				if (inDigits)
				{
					splits.add((Long)Long.parseLong(s.substring(last, i)));
				}
				else
				{
					splits.add(s.substring(last,i));
				}
				last = i;
				inDigits = ! inDigits;
			}
		}
		if (inDigits)
		{
			splits.add(Long.parseLong(s.substring(last)));
		}
		else
		{
			splits.add(s.substring(last));
		}
		//return items;
		return splits;
	}
	public int compare(String o1, String o2) 
	{
		// are these both objects that we can compare?
		if(o1!=null && o2!=null)
		{
			// split them into parts first
			ArrayList<Object> s1 = splitter(o1);
			ArrayList<Object> s2 = splitter(o2);
			
			// go through each part until we find a difference
			for (int i=0; i< Math.min(s1.size(), s2.size());i++)
			{
				Object ob1 = s1.get(i);
				Object ob2 = s2.get(i);
				//check instance
				if(ob1.getClass() != ob2.getClass())
				{
					// numbers go first
					if(ob1 instanceof Long) return -1;
					else return 1;
				}
				else
				{
					// continue on if they are equal
					if (!ob1.equals(ob2))
					{
						// just cast the correct type and return the compare functions for Long or String
						if(ob1 instanceof Long) return ((Long)ob1).compareTo((Long)ob2);							
						else return ((String)ob1).compareToIgnoreCase((String)ob2);
					}
				}
			}
			// If we made it here, that means one string is a subset of the other. figure out which one.
			if(s1.size() < s2.size()) return -1;
			else if (s1.size() > s2.size()) return 1;
			// well, they must be equal then.
			return 0;
		}
		else
		{
			if (o2==null)
			{
				if(o1==null) return 0;
				return -1;
			}
			else return 1;
		}
	}
}

