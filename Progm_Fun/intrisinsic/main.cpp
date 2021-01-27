#include <iostream>
#include <vector>
#include <sstream>

using namespace std;

int main(){

    /**
    Question 1
    */
    enum {RED,YELLOW,AMBER = YELLOW,GREEN};

    cout<<RED<<endl<<YELLOW<<endl<<YELLOW<<GREEN<<endl;

    for(int i= RED;i<=GREEN;i++){
            cout<<i<<endl;

    }

    /**
    Question 2

    int interger_variable;
    int *pointer_to_interger = &interger_variable;
    const int constant_interger;
    */

    /**
    Question 3
    */

    string sentence = "hello-this-is-a-line-of-input";

    vector<string> result;
    stringstream s_stream(sentence);

    while(s_stream.good()){
            string substr;
            getline(s_stream,substr,'-');
            result.push_back(substr);
    }

    for(int i = 0; i <= result.size(); i++){


        cout<<"["<<result.at(i).size()<<"]  "<<result.at(i)<<endl;
    }

    cout<<result.at(0)<<endl;


    return 0;
}
