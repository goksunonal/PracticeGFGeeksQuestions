/**
 Answer For 
https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string/0/?ref=self
 **/
import java.util.Scanner;
public class ReverseWords {
	public static void main(String[] args){
		Scanner inpScanner=new Scanner(System.in);
		int testCaseCounter=inpScanner.nextInt();
		int count=0;
		String[] unReversedString=new String[testCaseCounter];
		String[] reversedString=new String[testCaseCounter];
		inpScanner.nextLine();
		while(count<testCaseCounter){
			unReversedString[count]=inpScanner.nextLine();
			String []splitWthDat=unReversedString[count].split("\\.");
			reversedString[count]="";
			for(int i=splitWthDat.length-1;i>=0;i--){
				if (i==0){
					reversedString[count]=reversedString[count]+splitWthDat[i];
				}else{
					reversedString[count]=reversedString[count]+splitWthDat[i]+".";
				}
			}
			count++;
		}
		for (int i=0;i<testCaseCounter;i++){
			System.out.println(reversedString[i]);
		}
		
	}
}
