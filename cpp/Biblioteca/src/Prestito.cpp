#include "Prestito.h"

Prestito::Prestito()
{
}

Prestito::Prestito(Libro* l, Utente* u, string dR)
{
	libro = l;
	utente = u;
	dataRestituzione = dR;
	l->setDisponibile(false);
	int i = u->getLibriInPrestito()+1;
	u->setLibriInPrestito(i);
}

Prestito::~Prestito()
{
}

Utente* Prestito::getUtente() {
	return utente;
}

Libro* Prestito::getLibro() {
	return libro;
}

