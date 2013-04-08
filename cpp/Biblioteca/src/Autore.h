#ifndef AUTORE_H_
#define AUTORE_H_

using namespace std;

#include "Persona.h"

class Autore : public virtual Persona
{
public:
	Autore(); 
	Autore(string nome, string cognome,string linguaScrittura);
	virtual ~Autore();
	void setLinguaScrittura(string ls);
	string getLinguaScrittura() const;
	friend istream& operator>>(istream&, Autore&);
	virtual std::ostream& stampa(std::ostream& os) const;
private:
	string linguaScrittura;
};


#endif /*AUTORE_H_*/
