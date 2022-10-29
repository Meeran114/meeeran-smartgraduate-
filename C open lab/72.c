#include<stdio.h>
int main()
{
    int i,j,k,l=1,rows;
    printf("Enter the number of rows:");
    scanf("%d",&rows);
    for(i=1;i<=rows;i++)
    {

        for(j=0;j<=rows-i;j++)
        {
            printf("  ");
        }
        for (k=1;k<=2*i-1;k++)
        {
            printf(" %d",l);
            l++;
        }
        printf("\n");
        l=1;
    }
    return 0;
}
