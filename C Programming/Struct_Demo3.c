#include<stdio.h>

// 1   2   4   8  Pragma Pack 
#pragma pack(1)
struct Demo
{
    int i;
    char ch;
    float f;
    
};

int main ()
{
    printf("%d\n",sizeof(struct Demo));



    return 0;
}