#ifndef COLLEZIONEAUTORI_H_
#define COLLEZIONEAUTORI_H_

using namespace std;

#include <vector>
#include <fstream>
#include "Autore.h"

class CollezioneAutori
{
public:
	CollezioneAutori();
	virtual ~CollezioneAutori();
	bool inserisci(Autore& a);
	int cerca(string nome, string cognome);
	Autore* getAutore(int posizione);
	int salva();
	int carica();
private:
	vector<Autore> ca;
};

#endif /*COLLEZIONEAUTORI_H_*/
