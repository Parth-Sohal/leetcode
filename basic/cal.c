#include <stdio.h>
int main() {
    int a,b;
    scanf("%d %d",&a,&b);
    char ch;
    scanf(" %c",&ch);
    switch(ch){
        case '+':
            printf("%d",a+b);
            break;
        case '-':
            printf("%d",a-b);
            break;
        case '*':
            printf("%d",a*b);
            break;
        case '/':
            printf("%d",a/b);
            break;
        default :
            printf("Error");
    }
    return 0;
}