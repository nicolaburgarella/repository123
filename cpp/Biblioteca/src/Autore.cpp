using namespace std; 

#include "Autore.h"

Autore::Autore()
{
}

Autore::Autore(string n, string c, string ls) : Persona(n,c)
{
	nome = n;
	cognome = c;
	linguaScrittura = ls;
}

Autore::~Autore()
{
}

void Autore::setLinguaScrittura(string ls) {
	linguaScrittura = ls;
}

string Autore::getLinguaScrittura() const {
	return linguaScrittura;
}

std::ostream& Autore::stampa(std::ostream& os)const{
	os << "Nome: \t" << nome << endl;
	os << "Cognome: \t" << cognome << endl;
	os << "Lingua di scrittura: \t" << linguaScrittura << endl;
	return os;
}

istream& operator>>(istream& is, Autore& a) {
	string nome, cognome, linguaScrittura;
	cout << "Inserisci il nome: ";
	getline(is, nome,'\n');
	cout << "Inserisci il cognome: "; 
	getline(is, cognome,'\n');
	cout << "Inserisci la lingua di scrittura: ";
	getline(is, linguaScrittura,'\n');
	a = Autore(nome,cognome,linguaScrittura);
	return is; 
}
