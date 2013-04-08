//============================================================================
// Name        : ese7.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

// null-terminated sequences of characters
#include <iostream>
using namespace std;

int main ()
{
  char question[] = "Please, enter your first name: ";
  char greeting[] = "Hello, ";
  char yourname [80];
  cout << question;
  cin >> yourname;
  cout << greeting << yourname << "!";
  return 0;
}

//Finally, sequences of characters stored in char arrays can easily be converted into string objects just by using the assignment operator:
// string mystring;
// char myntcs[]="some text";
// mystring = myntcs;
