#include<stdio.h>
int main()
{
    long long n;
    int count=0;
    printf("Enter a number ");
    scanf("%lld",&n);
    do
    {
        n=n/10;
        count++;
    }while(n!=0);
    printf("The Number of digits is %d",count);
}
