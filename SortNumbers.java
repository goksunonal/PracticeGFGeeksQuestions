/**
 * Answer For
 * https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s/0
 */
import java.util.Scanner;

public class SortNumbers {
	public static void main(String[] args){
		Scanner inpScanner=new Scanner(System.in);
		int testCaseCounter=inpScanner.nextInt();
		int count=0;
		int [][] testArray=new int[testCaseCounter][]; 
		while(count<testCaseCounter){
			int arraySize=inpScanner.nextInt();
			int []arrayx=new int[arraySize];
			int counter=0;
			int zeropoint=0;
			int onepoint=0;
			int twopoint=0;
			while(counter<arraySize){
				int number=Integer.parseInt(inpScanner.next());
				if (number==0){
					zeropoint++;
				}else if (number==1){
					onepoint++;
				}else if (number==2){
					twopoint++;
				}
				counter++;
			}
			for(int i=0;i<arraySize;i++){
				if(zeropoint-->0)
					arrayx[i]=0;
				else if (onepoint-->0){
					arrayx[i]=1;
				}else if (twopoint-->0){
					arrayx[i]=2;
				}
			}
			for (int a=0;a<arrayx.length;a++){
				System.out.print(arrayx[a]+" ");
			}
			System.out.println();
			testArray[count++]=arrayx;
		}
		
		
	}
}
