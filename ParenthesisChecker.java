/**
 Answer For 
 https://practice.geeksforgeeks.org/problems/parenthesis-checker/0#ExpectOP 
 **/
import java.util.Stack;
import java.util.Scanner;
public class ParenthesisChecker {

	public static void main(String[] args){
		Scanner inpScanner=new Scanner(System.in);
		int testCaseCounter=inpScanner.nextInt();
		String openCase="({[";
		String closeCase=")}]";
		String[] unbalancedString=new String[testCaseCounter];
		int count=0;
		boolean[] balanced=new boolean[testCaseCounter]; 
		while(count<testCaseCounter){
			unbalancedString[count]=inpScanner.next();
			int tempCount=count++;
			
				if (unbalancedString[tempCount].length()%2==1){
					balanced[tempCount]=false;
					continue;
				}else {
					Stack<Character> temp=new Stack<Character>();
					String tempStr=unbalancedString[tempCount];			
					while (tempStr.length()!=0){
						if (openCase.indexOf(tempStr.charAt(0))!=-1){
							temp.push(tempStr.charAt(0));
							tempStr=tempStr.substring(1);
						}else if (closeCase.indexOf(tempStr.charAt(0))!=-1){
							if (temp.isEmpty() || temp.peek()!=openCase.charAt(closeCase.indexOf(tempStr.charAt(0)))){
								balanced[tempCount]=false;
								temp.push('0');
								break;
							}else{
								temp.pop();
								tempStr=tempStr.substring(1);
							}
						}
					}
					if (temp.isEmpty()){
						balanced[tempCount]=true;
					}
					else{
						balanced[tempCount]=false;
					}
				}
			
		}
		for (int i=0;i<testCaseCounter;i++){
			if (balanced[i]){
				System.out.println("balanced");
			}else{
				System.out.println("not balanced");

			}
		}
	}
}
