#ifndef COLLEZIONEUTENTI_H_
#define COLLEZIONEUTENTI_H_

using namespace std;

#include <vector>
#include <fstream>
#include "Utente.h"

class CollezioneUtenti
{
public:
	CollezioneUtenti();
	virtual ~CollezioneUtenti();
	bool inserisci(Utente& u);
	int cerca(string nome, string cognome);
	Utente* getUtente(int posizione);
	int salva();
	int carica();
private:
	vector<Utente> cu;
};

#endif /*COLLEZIONEUTENTI_H_*/
