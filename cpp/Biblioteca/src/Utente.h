#ifndef UTENTE_H_
#define UTENTE_H_

#include <iostream>
#include <string>
using namespace std;

#include "Persona.h"

class Utente : public virtual Persona
{
public:
	Utente();
	Utente(string nome, string cognome, string indirizzo, string residenza, string telefono);
	virtual ~Utente();
	void setIndirizzo(string indirizzo);
	void setResidenza(string provinciaResidenza);
	void setTelefono(string telefono);
	void setLibriInPrestito(int l);
	string getIndirizzo() const;
	string getResidenza() const;
	string getTelefono() const;
	int getLibriInPrestito() const;
	friend istream& operator>>(istream&, Utente&);
	virtual std::ostream& stampa(std::ostream& os) const;
	
private:
	string indirizzo;
	string residenza;
	string telefono;
	int libriInPrestito;
};

#endif /*UTENTE_H_*/
