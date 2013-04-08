#include "CollezionePrestiti.h"

CollezionePrestiti::CollezionePrestiti()
{
	cp.clear();
}

CollezionePrestiti::~CollezionePrestiti()
{
}

bool CollezionePrestiti::inserisci(Prestito &p) {
	cp.push_back(p);
	return true;
}

int CollezionePrestiti::cerca(string codice, Persona u) {
	unsigned int i;
	for (i = 0; i < cp.size(); i++) {
		if((cp[i].getLibro())->getCodice() == codice 
		&& (cp[i].getUtente())->getNome() == u.getNome() 
		&& (cp[i].getUtente())->getCognome() == u.getCognome()) {
			return i;
		}
	}
	return -1;
}

void CollezionePrestiti::rimuoviPrestito(int posizione) {
	cp[posizione].getLibro()->setDisponibile(true);
	int libriInPrestito = (cp[posizione].getUtente())->getLibriInPrestito();
	cp[posizione].getUtente()->setLibriInPrestito(libriInPrestito-1);
	vector<Prestito>::iterator iter = cp.begin() + posizione;
	cp.erase(iter);
}
