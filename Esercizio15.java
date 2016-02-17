import java.util.Scanner;

public class Esercizio15{
	public static void main(String [] args){
	Scanner tastiera = new Scanner(System.in);
	
	System.out.println("write something");
	
	char word ;
	
	word = tastiera.nextChar();
	
	StringUtils.countMatches(word, "a");
		}
	}
