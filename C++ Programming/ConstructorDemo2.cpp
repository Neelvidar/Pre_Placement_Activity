#include<iostream>

using namespace std;

class PPA
{
    public: 
        int no1;
        int no2;

        // Defult Constructor
        PPA ()
        {
            cout<<"inside default constructor\n";
        }
        // Parameterised Constructor                        
        PPA (int A, int B)
        {
            cout<<"inside parameterised constructor\n";
        }

        ~PPA()
        {
            cout<<"inside destructor\n";
        }
};

int main()
{
    PPA pobj1;
    PPA pobj2(11,21);
   
    return 0;
}