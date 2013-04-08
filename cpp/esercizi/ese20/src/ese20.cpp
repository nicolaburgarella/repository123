//============================================================================
// Name        : ese20.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

// basic file operations


/*
    ofstream: Stream class to write on files
    ifstream: Stream class to read from files
    fstream: Stream class to both read and write from/to files.
*/

#include <iostream>
#include <fstream>
using namespace std;

int main () {
  ofstream myfile;
  myfile.open ("example.txt");
  myfile << "Writing this to a file.\n";
  myfile.close();
  return 0;
}
