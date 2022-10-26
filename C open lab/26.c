#include <stdio.h>
int main() {
 double number, sum = 0;
 printf("Enter a number: ");
 scanf("%lf", &number);
 do {
 sum += number;
 number--;
 }
 while(number != 0.0);
 printf("Sum = %.2lf",sum);
 return 0;
}
