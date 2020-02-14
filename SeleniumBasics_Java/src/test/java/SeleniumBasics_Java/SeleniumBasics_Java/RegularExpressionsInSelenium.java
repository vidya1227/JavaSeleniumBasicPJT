package SeleniumBasics_Java.SeleniumBasics_Java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class RegularExpressionsInSelenium {

	/*
	 
	 [abc]	A single character of: a, b, or c
	 
[^abc]	Any single character except: a, b, or c

[a-z]	Any single character in the range a-z

[a-zA-Z]	Any single character in the range a-z or A-Z

^	Start of line

$	End of line

\A	Start of string

\z	End of string

.	Any single character

\s	Any whitespace character

\S	Any non-whitespace character

\d	Any digit

\D	Any non-digit

\w	Any word character (letter, number, underscore)

\W	Any non-word character

\b	Any word boundary

(...)	Capture everything enclosed

(a|b)	a or b

a?	Zero or one of a

a*	Zero or more of a

a+	One or more of a

a{3}	Exactly 3 of a

a{3,}	3 or more of a

a{3,6}	Between 3 and 6 of a
	 */

	@Test
	public static void JavaRegularExpressions() {
		// Java Regular Expressions
		System.out.println(Pattern.matches(".s", "as"));// ANSWER IS TRUE

		// Regular Expression . Example
		System.out.println(Pattern.matches(".s", "as"));// true (2nd char is s)
		System.out.println(Pattern.matches(".s", "mk"));// false (2nd char is not s)
		System.out.println(Pattern.matches(".s", "mst"));// false (has more than 2 char)
		System.out.println(Pattern.matches(".s", "amms"));// false (has more than 2 char)
		System.out.println(Pattern.matches("..s", "mas"));// true (3rd char is s)

		// Regular Expression Character classes Example
		System.out.println(Pattern.matches("[amn]", "abcd"));// false (not a or m or n)
		System.out.println(Pattern.matches("[amn]", "a"));// true (among a or m or n)
		System.out.println(Pattern.matches("[amn]", "ammmna"));// false (m and a comes more than once)

		// Regular Expression Character classes and Quantifiers Example
		System.out.println("? quantifier ....");
		System.out.println(Pattern.matches("[amn]?", "a"));// true (a or m or n comes one time)
		System.out.println(Pattern.matches("[amn]?", "aaa"));// false (a comes more than one time)
		System.out.println(Pattern.matches("[amn]?", "aammmnn"));// false (a m and n comes more than one time)
		System.out.println(Pattern.matches("[amn]?", "aazzta"));// false (a comes more than one time)
		System.out.println(Pattern.matches("[amn]?", "am"));// false (a or m or n must come one time)

		System.out.println("+ quantifier ....");
		System.out.println(Pattern.matches("[amn]+", "a"));// true (a or m or n once or more times)
		System.out.println(Pattern.matches("[amn]+", "aaa"));// true (a comes more than one time)
		System.out.println(Pattern.matches("[amn]+", "aammmnn"));// true (a or m or n comes more than once)
		System.out.println(Pattern.matches("[amn]+", "aazzta"));// false (z and t are not matching pattern)

		System.out.println("* quantifier ....");
		System.out.println(Pattern.matches("[amn]*", "ammmna"));// true (a or m or n may come zero or more times)

		// Regular Expression Metacharacters Example
		System.out.println("metacharacters d....");// d means digit

		System.out.println(Pattern.matches("\\d", "abc"));// false (non-digit)
		System.out.println(Pattern.matches("\\d", "1"));// true (digit and comes once)
		System.out.println(Pattern.matches("\\d", "4443"));// false (digit but comes more than once)
		System.out.println(Pattern.matches("\\d", "323abc"));// false (digit and char)

		System.out.println("metacharacters D....");// D means non-digit

		System.out.println(Pattern.matches("\\D", "abc"));// false (non-digit but comes more than once)
		System.out.println(Pattern.matches("\\D", "1"));// false (digit)
		System.out.println(Pattern.matches("\\D", "4443"));// false (digit)
		System.out.println(Pattern.matches("\\D", "323abc"));// false (digit and char)
		System.out.println(Pattern.matches("\\D", "m"));// true (non-digit and comes once)

		System.out.println("metacharacters D with quantifier....");
		System.out.println(Pattern.matches("\\D*", "mak"));// true (non-digit and may come 0 or more times)

		// Regular Expression Question 1
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));// true
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));// false (more than 6 char)
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));// true
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));// false ($ is not matched)

		// Regular Expression Question 2
		System.out.println("by character classes and quantifiers ...");
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));// true
		System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));// true

		System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));// false (11 characters)
		System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));// false (starts from 6)
		System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));// true

		System.out.println("by metacharacters ...");
		System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));// true
		System.out.println(Pattern.matches("[789]{1}\\d{9}", "3853038949"));// false (starts from 3)

		// Java Regex Finder Example
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter regex pattern:");// Enter regex pattern: java

			Pattern pattern = Pattern.compile(sc.nextLine());
			System.out.println("Enter text:"); // Enter text: this is java, do you know java
			Matcher matcher = pattern.matcher(sc.nextLine());
			boolean found = false;
			while (matcher.find()) {
				System.out.println("I found the text " + matcher.group() + " starting at index " + matcher.start()
						+ " and ending at index " + matcher.end());
				found = true;
			}
			if (!found) {
				System.out.println("No match found.");
			}
		}

		// REFFERRED LINK FOR REGULAR EXPRESSIONS IN JAVA IS
		// https://www.javatpoint.com/java-regex
		//https://www.vogella.com/tutorials/JavaRegularExpressions/article.html
	}
}
