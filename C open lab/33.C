#include <ctype.h>
#include <stdio.h>
int main() {
 char c;
 int lowercase_vowel, uppercase_vowel;
 printf("Enter an alphabet: ");
 scanf("%c", &c);
 lowercase_vowel = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
 uppercase_vowel = (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
 if (!isalpha(c))
 printf("Error! Non-alphabetic character.");
 else if (lowercase_vowel || uppercase_vowel)
 printf("%c is a vowel.\n", c);
 else
 printf("%c is a consonant.\n", c);
 printf("%d\t%d",lowercase_vowel,uppercase_vowel);
 return 0;
}
