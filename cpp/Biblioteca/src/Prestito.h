#ifndef PRESTITO_H_
#define PRESTITO_H_

#include "Utente.h"
#include "Libro.h"

class Prestito
{
public:
	Prestito();
	Prestito(Libro* l, Utente* u, string dataRestituzione);
	virtual ~Prestito();
	Utente* getUtente();
	Libro* getLibro();
private:
	Utente* utente;
	Libro* libro;
	string dataRestituzione;
};

#endif /*PRESTITO_H_*/
