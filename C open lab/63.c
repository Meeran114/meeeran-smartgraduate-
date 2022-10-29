#include <stdio.h>
#include<math.h>
int main() {
 int num, originalNum, remainder,low,high, count=0;
 double result=0.0;
  printf("Enter two numbers(intervals): ");
 scanf("%d %d", &low, &high);
 printf("Armstrong numbers between %d and %d are: ", low, high);
 if (low>high)
 {
     low=low-high;
     high=high+low;
     low=high-low;
 }
 for(num=low;num<high;num++)
 {
     originalNum=num;

 while(originalNum!=0)
 {
     originalNum/=10;
     count++;
 }
 originalNum = num;
 while (originalNum != 0) {
 remainder = originalNum % 10;

 result += pow(remainder,count);
 originalNum /= 10;
 }
 if (result == num)
 printf("%d ", num);
 count=0;
     result=0.0;
 }
 return 0;
}
