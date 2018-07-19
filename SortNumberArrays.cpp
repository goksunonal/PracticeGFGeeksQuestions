/**
 * Answer For
 * https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s/0
 */
#include <iostream>

using namespace std;
#include <vector>
int main()
{
            int testCaseCounter;
            cin>>testCaseCounter;
            int count=0;
           while(count<testCaseCounter){
                int arraySize;
                cin>>arraySize;
                vector<int> arrayx;
                int counter=0;
                int zeropoint=0;
                int onepoint=0;
                int twopoint=0;
                while(counter<arraySize){
                    int number;
                    cin>>number;
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
                        arrayx.push_back(0);
                    else if (onepoint-->0){
                       arrayx.push_back(1);
                    }else if (twopoint-->0){
                        arrayx.push_back(2);
                    }
                }
                for (int a=0;a<arrayx.size();a++){
                    cout<<arrayx[a]<<" ";
                }
                cout<<endl;
                count++;
            }

    return 0;
}
