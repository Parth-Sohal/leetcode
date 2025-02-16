#include<stdio.h>
#include<string.h>
int main(){
    // int a ;
    // scanf("%d\n",&a);
    // unsigned int  f = 6785943;
    // printf("%lu\n",f);
    // c
    // int num = 70;
    // int k = 3;
    // printf("%d ",(num & (1<<k-1)));
    // printf("%d ",(num | (1<<k-1)));
    // printf("%d ",(num & (~(1<<k-1))));
    // int num = 8;
    // int k = 1;
    // while((num & 1) == 0){
    //     k++;
    //     num = num >> 1;
    // }
    // printf("%d",k);

    // int num =10;
    // int k = 0;
    // while(num>0){
    //     if((num & 1) == 1){
    //         k++;
    //     }
    //     num = num >> 1;
    // }
    // printf("%d",k);

    int num = 8;
    int result = 0;
    while(num){
        result = result + ((num&1));
        result = result << 1;
        num = num >> 1;
    }
    printf("%d",result);
    return 0;
}