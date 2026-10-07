#include<iostream>

using namespace std;

class PPA
{
    public: 
        int no1;
        int no2;

        // Default Constructor
        PPA ()
        {
            cout<<"inside default constructor\n";
        }
        // Parameterised Constructor                        
        PPA (int A, int B)
        {
            cout<<"inside parameterised constructor\n";
        }
            // Copy Constructor
        PPA(PPA &obj)
        {
            cout<<"inside copy constructor\n";
        }

        ~PPA()
        {
            cout<<"inside destructor\n";
        }
};

int main()
{
    PPA pobj1;                              // Default
    PPA pobj2(11,21);                       // Parameterised
    PPA pobj3(pobj1);                       // Copy
   
    return 0;
}