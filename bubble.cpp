#include<iostream>
using namespace std;
int main()
{
	int i,j,temp;
	int a[5]={2,5,3,6,4};
	for(i=0;i<5;i++)
	{
		cout<<a[i];
	}
	for(i=0;i<5;i++)
	{
	    for(j=i+1;j<5;j++)
		
		{
			if(a[j]<a[i])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}	
	}
	 cout << endl;
	for(i=0;i<5;i++)
	{
		cout<<a[i];
	}
	return 0;
}
