package regex;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email_regex {
	public static boolean isValid(String email) {
		
		String emailid = "[A-Z a-z 0-9]{3}[. _ + -][A-Z a-z 0-9]{6}+[@][a-z]{10}[.][a-z]{2-3}";
		
		Pattern p = Pattern.compile(emailid);
		if(email == null) {
			return false;
		}
		
		Matcher m = p.matcher(email);
		return m.matches();
	}
	
	public static void main(String args[]) {
	String email123 = "sam+suman@bridgelabz.com.in";
	System.out.println(email123 +":" +isValid(email123));
	}			
}