// #include<stdio.h>
// #include<limits.h>
// int main(){
//     // int num = INT_MAX;
//     // num = num>>31;
//     // printf("%d",num);
//     // int n = 2147483648;
//     // // scanf("%d",&n);
//     // int k = 1,count = 1;
//     // while(k<n){
//     //     count++;
//     //     k = k<<1;
//     // }
//     // printf("%d",32-count);

//     // int a = 5 , b = 3;
//     // a = a ^ b;
//     // b = a ^ b;
//     // a = a ^ b;
//     // printf("%d %d",a,b);


//     int n ;
//     scanf("%d",&n);
//     int k = 1,count = 0;
//     while(k<n){
//         count++;
//         k = k << 1;
//         printf("value of k = %d\n",k);
//     }
//     printf("%d",31-count);

// }

#include <stdio.h>
int main() {
    int a,b;
    char ch;
    scanf("%d%d",&a,&b);
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
            break;
    }
    return 0;
}