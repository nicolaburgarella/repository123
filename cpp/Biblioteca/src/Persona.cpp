#include "Persona.h"

Persona::Persona() {
}

Persona::Persona(string n, string c)
{
	nome = n;
	cognome = c;
}

Persona::~Persona()
{
}

void Persona::setNome(string n) {
	nome = n;
}

void Persona::setCognome(string c) {
	cognome = c;
}

string Persona::getNome() const{
	return nome;
}

string Persona::getCognome() const{
	return cognome;
}

ostream& Persona::stampa(ostream& os)const{
  os << "Nome: \t" << nome << endl;
  os << "Cognome: \t" << cognome << endl;
  return os;
}

istream& operator>>(istream& is, Persona& p) {
	string nome, cognome;
	cout << "Inserisci il nome: ";
	getline(is, nome,'\n');
	cout << "Inserisci il cognome: ";
	getline(is, cognome,'\n');
	p = Persona(nome,cognome);
	return is; 
}
