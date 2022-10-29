#include <stdio.h>
#include<math.h>
int main() {
 int num, originalNum, remainder, count=0, result = 0;
 printf("Enter a integer: ");
 scanf("%d", &num);
 originalNum = num;
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
 printf("%d is an Armstrong number.", num);
 else
 printf("%d is not an Armstrong number.", num);
 return 0;
}
