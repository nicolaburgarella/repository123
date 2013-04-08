#include "CollezioneLibri.h"

CollezioneLibri::CollezioneLibri()
{
	cl.clear();
}

CollezioneLibri::~CollezioneLibri()
{
}

bool CollezioneLibri::inserisci(Libro& l) {
	unsigned int i;
	for (i = 0; i < cl.size(); i++) {
		if(cl[i] == l) {
			return false;
		}
	}
	cl.push_back(l);
	return true;
}

void CollezioneLibri::cerca(string titolo) {
	unsigned int i;
	bool flag = false;
	for (i = 0; i < cl.size(); i++) {
		if(cl[i].getTitolo() == titolo) {
			cout << cl[i] << endl;
			flag = true;
		}
	}
	if (!flag) 
		cout << "- Non e' stato trovato alcun libro avente il titolo inserito." << endl;
}

int CollezioneLibri::cercaPerCodice(string codice) {
	unsigned int i;
		for (i = 0; i < cl.size(); i++) {
		if(cl[i].getCodice() == codice && cl[i].isDisponibile() == true) {
			return i;
		}
		if(cl[i].getCodice() == codice && cl[i].isDisponibile() == false) {
			return -1;
		}
	}
	return -2;
}

void CollezioneLibri::cerca(Autore autore) {
	unsigned int i;
	bool flag = false;
	for (i = 0; i < cl.size(); i++) {
		if(cl[i].getAutore() == autore) {
			cout << cl[i] << endl;
			flag = true;
		}
	}
	if (!flag) 
		cout << "- Non e' stato trovato alcun libro avente l'autore inserito." << endl;
}

Libro* CollezioneLibri::getLibro(int posizione) {
	return &cl[posizione];
}


