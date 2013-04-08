#include "Libro.h"

Libro::Libro(string c, Autore at, string t, string a, string e, bool disp) : Prestabile(true), Opera(c) 
{
	autore = at;
	titolo = t;
	anno = a;
	editore = e;
	disponibile = true;
}

Libro::Libro(CollezioneAutori* c)
{
	ca = c;
}

Libro::Libro()
{
}


Libro::~Libro()
{
}


Autore Libro::getAutore() const {
	return autore;
}
string Libro::getTitolo() const {
	return titolo;
}
string Libro::getAnno() const {
	return anno;
}
string Libro::getEditore() const {
	return editore;
} 

bool Libro::isDisponibile() const {
	return disponibile;
}

void Libro::setAutore(Autore a) {
	autore = a;
}
void Libro::setTitolo(string t) {
	titolo = t;
}
void Libro::setAnno(string a) {
	anno = a;
}
void Libro::setEditore(string e) {
	editore = e;
} 

void Libro::setDisponibile(bool d) {
	disponibile = d;
} 

bool Libro::inserisci() {
	string titolo;
	string editore;
	string anno;
	string autoreCognome;
	string autoreNome;
	string isbn;
	cout << "Inserisci il nome dell'autore: ";
	getline(cin, autoreNome,'\n');
	cout << "Inserisci il cognome dell'autore: ";
	getline(cin, autoreCognome,'\n');
	int trovato = ca->cerca(autoreNome,autoreCognome);
    if (trovato != -1) {
    		cout << endl << "- Autore riconosciuto. " << endl << endl; 
    		Autore a = *(ca->getAutore(trovato));
    		this->setAutore(a);
    		cout << "Inserisci il codice ISBN univoco: ";
			getline(cin, isbn,'\n');
			this->setCodice(isbn);
			cout << "Inserisci il titolo del libro: ";
    		getline(cin, titolo,'\n');
    		this->setTitolo(titolo);
    		cout << "Inserisci l'anno di pubblicazione: ";
			getline(cin, anno,'\n');
			this->setAnno(anno);
			cout << "Inserisci l'editore: ";
			getline(cin, editore,'\n');
			this->setEditore(editore);
			this->setDisponibile(true);
			return true;
    }
  	else {
  		cout << "- Autore non trovato. Libro non inserito" << endl;
  		return false; 
  	}
}

ostream& Libro::stampa(ostream& os)const{
  os << "ISBN: \t" << codice << endl;
  os << "Titolo: \t" << titolo << endl;
  os << "Nome Autore: \t" << autore.getNome() << endl;
  os << "Cognome Autore: \t" << autore.getCognome() << endl; 
  os << "Anno: \t" << anno << endl;
  os << "Editore: \t" << editore << endl;
  if (disponibile) 
  	os << "Disponibile: SI" << endl;
  else
  	 os << "Disponibile: NO" << endl;
  return os;
}

bool Libro::operator==(Libro const &l) const {
	if (this->codice == l.getCodice())
		return true;
	else
		return false;
}
