#ifndef LIBRO_H_
#define LIBRO_H_

#include "Prestabile.h"
#include "Opera.h"
#include "Autore.h"
#include "CollezioneAutori.h"

class Libro : public Prestabile, public Opera
{
public:
	Libro();
	Libro(CollezioneAutori* c);
	Libro(string isbn,Autore a, string titolo, string anno, string editore,bool disponibile=true);
	virtual ~Libro();
	Autore getAutore() const;
	string getTitolo() const;
	string getAnno() const;
	string getEditore() const;
	bool isDisponibile() const;
	void setAutore(Autore a);
	void setTitolo(string t);
	void setAnno(string a);
	void setEditore(string e);
	void setDisponibile(bool d);
	bool inserisci();
	virtual ostream& stampa(ostream& os) const;
	bool operator==(Libro const &) const;
private:
	Autore autore;
	string titolo;
	string anno;
	string editore;	
	bool disponibile;
	CollezioneAutori* ca;
};

inline ostream& operator<<( ostream& os, const Libro& l)
{
  return l.stampa(os);
}

#endif /*LIBRO_H_*/
