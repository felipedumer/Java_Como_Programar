package cap14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

	public static void main(String[] args) {
		// cria express�o regular
		Pattern expression = 
				Pattern.compile("J.*\\d[0-35-9]-\\d\\d-\\d\\d");
		String string1 = "Janes's Birthday is 05-12-75\n" +
				"Dave's Birthday is 11-04-68\n" +
				"John's Birthday is 04-28-73\n" +
				"Joe's Birthday is 12-17-77";
		
		// corresponde express�o regular � string e imprime as correspond�ncias
		Matcher matcher = expression.matcher(string1);
		
		while (matcher.find())
			System.out.println(matcher.group());
	}

}
