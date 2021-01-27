#include <iostream>
#include <cmath>

using namespace std;




int powerOfTwo(){
    int i = 1;

    while(i<=10){

        cout<<"2 ^ "<<i<<" = "<<pow(2,i)<<endl;

        i++;
    }
    return 0;
}

int main()
{
    /**
    Ouestion 4
    */

    while(powerOfTwo());




    return 0;
}
