#include "Marvellous.h"

// Entry point function
int main()
{
    float fRet = 0.0f;

    fRet = Area(7.5f);

    printf("Area of Circle is : %f\n",fRet);

    return 0;       // return Success
}

// gcc Main.c Helper.c -o Myexe
// Myexe.exe