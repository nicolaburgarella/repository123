#include "Utente.h" 	

#include <iostream>
using namespace std;

Utente::Utente() {
}

Utente::Utente(string n, string c, string i, string r, string tel) : Persona(n,c)
{
	indirizzo = i;
	residenza = r;
	telefono = tel;
	libriInPrestito = 0;
}

Utente::~Utente()
{
}

void Utente::setIndirizzo(string i) {
	indirizzo = i;
}

void Utente::setResidenza(string r) {
	residenza = r;
}
void Utente::setTelefono(string tel) {
	telefono = tel;
}

string Utente::getIndirizzo() const {
	return indirizzo;
}

string Utente::getResidenza() const {
	return residenza;
}

string Utente::getTelefono() const {
	return telefono;
}

int Utente::getLibriInPrestito() const {
	return libriInPrestito;
}

void Utente::setLibriInPrestito(int l) {
	libriInPrestito = l;
}

std::ostream& Utente::stampa(std::ostream& os)const{
	os << "Nome: \t" << nome << endl;
	os << "Cognome: \t" << cognome << endl;
	os << "Indirizzo: \t" << indirizzo << endl;
	os << "Telefono: \t" << telefono << endl;
	os << "Libri in prestito: \t" << libriInPrestito << endl;
	return os;
}

istream& operator>>(istream& is, Utente& u) {
	string nome,cognome, indirizzo,residenza, telefono;
	cout << "Inserisci il nome: ";
	getline(is, nome,'\n');
	cout << "Inserisci il cognome: ";
	getline(is, cognome,'\n');
	cout << "Inserisci l'indirizzo: ";
	getline(is, indirizzo, '\n');
	cout << "Inserisci il comune di residenza: ";
	getline(is, residenza,'\n');
	cout << "Inserisci il telefono: ";
	getline(is, telefono,'\n');
	u = Utente(nome,cognome,indirizzo,residenza,telefono);
	return is; 
}
