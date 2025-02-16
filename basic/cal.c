// #include <stdio.h>
// int main() {
//     int a,b;
//     scanf("%d %d",&a,&b);
//     char ch;
//     scanf(" %c",&ch);
//     switch(ch){
//         case '+':
//             printf("%d",a+b);
//             break;
//         case '-':
//             printf("%d",a-b);
//             break;
//         case '*':
//             printf("%d",a*b);
//             break;
//         case '/':
//             printf("%d",a/b);
//             break;
//         default :
//             printf("Error");
//     }
//     return 0;
// }

#include<stdio.h>
int main(){
    int n;
    scanf("%d", &n);
    for (int i=1; i<=n; i++){
        for (int j=1;j<=n; j++){
            if(j>=n+1-i && j<=n) printf("* ");
            else printf(" ");
        }
        printf("\n");
    }
}