#include <stdio.h>
int main() {
 int low, high, i, flag;
 printf("Enter two numbers(intervals): ");
 scanf("%d %d", &low, &high);
 printf("Prime numbers between %d and %d are: ", low, high);
 if (low>high)
 {
     low=low-high;
     high=high+low;
     low=high-low;
 }
 if (low <= 1) {
 low=2;
 }
 while (low < high) {
 flag = 0;
 for (i = 2; i <= low / 2; ++i) {
 if (low % i == 0) {
 flag = 1;
 break;
 }
 }
 if (flag == 0)
 printf("%d ", low);
 ++low;
 }
 return 0;
}
