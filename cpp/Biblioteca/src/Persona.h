#ifndef PERSONA_H_
#define PERSONA_H_

#include <iostream>
#include <string>
using namespace std;

class Persona
{
public:
	Persona();
	Persona(string nome, string cognome);
	virtual ~Persona();
	void setNome(string nome);
	void setCognome(string cognome);
	string getNome() const;
	string getCognome() const;
	template <class T> bool operator== (T const & ) const;
	friend istream& operator>>(istream&, Persona&);
	virtual ostream& stampa(ostream& os) const;
protected:
	string nome;
	string cognome;
};

inline ostream& operator<<( ostream& os, const Persona& pers)
{
  return pers.stampa(os);
}

template <class T> bool Persona::operator==(T const &p) const {
	if (this->nome == p.getNome() && this->cognome == p.getCognome())
		return true;
	else
		return false;
}


#endif /*PERSONA_H_*/
