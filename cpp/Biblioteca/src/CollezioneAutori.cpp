#include "CollezioneAutori.h"

CollezioneAutori::CollezioneAutori()
{
	ca.clear();
}

CollezioneAutori::~CollezioneAutori()
{
	this->salva();
}

bool CollezioneAutori::inserisci(Autore &a) {
	unsigned int i;
	for (i = 0; i < ca.size(); i++) {
		if(ca[i] == a) {
			return false;
		}
	}
	ca.push_back(a);
	return true;
}

int CollezioneAutori::cerca(string nome, string cognome) {
	unsigned int i;
	for (i = 0; i < ca.size(); i++) {
		if(ca[i].getNome() == nome && ca[i].getCognome() == cognome) {
			return i;
		}
	}
	return -1;
}

Autore* CollezioneAutori::getAutore(int posizione) {
	return &ca[posizione];
}

int CollezioneAutori::salva() {
	ofstream fout( "Autori.txt", ios::out );
	unsigned int i;
    
    if (fout.fail())
    {
        return -1;
    }
    
    for (i = 0; i < ca.size(); i++) 
    {
		fout << ca[i].getNome() << "\n" << ca[i].getCognome() << "\n" << ca[i].getLinguaScrittura() << endl;
    }
    
    fout.close();
	return 0;
}

int CollezioneAutori::carica() {
	ifstream fin;
	fin.open("Autori.txt");
	string nome, cognome, linguaScrittura;
	if (fin.fail())
	{
		return 1;
    }
   	while(getline(fin,nome,'\n') && getline(fin,cognome,'\n') && getline(fin,linguaScrittura,'\n')) {
   		Autore a(nome,cognome,linguaScrittura);
   		ca.push_back(a);
  	}
  	fin.close ();
  	return 0;
}
