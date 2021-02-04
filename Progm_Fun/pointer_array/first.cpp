#include <iostream>
#include <cstring>

using namespace std;

int main(){

    string word ;
    cout<<"Enter a word : ";
    cin>>word;

    int len = word.length();

    cout<<"The word you enter is "<<word<<endl;

    char characters[len];

    strcpy(characters,word.c_str());

    for (int i = 0; i < len; i++)
    {
        cout<<characters[i];
    }
    
    return 0;
}