#include<stdio.h>

int Addition (int Value1 , int Value2)
{
    int result = 0;
    result = Value1+Value2;
    return result;
}
int main()
{
    int no1 = 10;
    int no2 = 20;
    int Ans = 0;
    
    Ans = Addition (no1,no2);

    printf("Addition is %d\n", Ans);

    return 0;
}