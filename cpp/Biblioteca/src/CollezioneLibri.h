#ifndef COLLEZIONELIBRI_H_
#define COLLEZIONELIBRI_H_

using namespace std;

#include <vector>
#include <fstream>
#include "Libro.h"

class CollezioneLibri
{
public:
	CollezioneLibri();
	virtual ~CollezioneLibri();
	bool inserisci(Libro& l);
	void cerca(string titolo);
	void cerca(Autore autore);
	int cercaPerCodice(string codice);
	Libro* getLibro(int posizione);
private:
	vector<Libro> cl;
};

#endif /*COLLEZIONELIBRI_H_*/
