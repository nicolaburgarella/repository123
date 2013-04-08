#ifndef COLLEZIONEPRESTITI_H_
#define COLLEZIONEPRESTITI_H_

using namespace std;

#include <vector>
#include "Prestito.h"
#include "Persona.h"

class CollezionePrestiti
{
public:
	CollezionePrestiti();
	virtual ~CollezionePrestiti();
	bool inserisci(Prestito &p);
	int cerca(string codice, Persona u);
	void rimuoviPrestito(int posizione);
private:
	vector<Prestito> cp;
};

#endif /*COLLEZIONEPRESTITI_H_*/
