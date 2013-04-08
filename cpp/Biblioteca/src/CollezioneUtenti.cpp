#include "CollezioneUtenti.h"

CollezioneUtenti::CollezioneUtenti()
{
	cu.clear();
}

CollezioneUtenti::~CollezioneUtenti()
{
	this->salva();
}

bool CollezioneUtenti::inserisci(Utente &u) {
	unsigned int i;
	for (i = 0; i < cu.size(); i++) {
		if(cu[i] == u) {
			return false;
		}
	}
	cu.push_back(u);
	return true;
}

int CollezioneUtenti::cerca(string nome, string cognome) {
	unsigned int i;
	for (i = 0; i < cu.size(); i++) {
		if(cu[i].getNome() == nome && cu[i].getCognome() == cognome) {
			return i;
		}
	}
	return -1;
}

Utente* CollezioneUtenti::getUtente(int posizione) {
	return &cu[posizione];
}

int CollezioneUtenti::salva() {
	ofstream fout( "Utenti.txt", ios::out );
	unsigned int i;
    
    if (fout.fail())
    {
        return -1;
    }
    
    for (i = 0; i < cu.size(); i++) 
    {
		fout << cu[i].getNome() << "\n" << cu[i].getCognome() << "\n" << cu[i].getIndirizzo() << "\n" << cu[i].getResidenza() << "\n" << cu[i].getTelefono() << endl;
    }
    
    fout.close();
	return 0;
}

int CollezioneUtenti::carica() {
	ifstream fin;
	fin.open("Utenti.txt");
	string nome, cognome, indirizzo, residenza, telefono;
	if (fin.fail())
	{
		return 1;
    }
   	while(getline(fin,nome,'\n') && getline(fin,cognome,'\n') && getline(fin,indirizzo,'\n')&& getline(fin,residenza,'\n')&& getline(fin,telefono,'\n')) {
   		Utente u(nome,cognome,indirizzo,residenza, telefono);
   		cu.push_back(u);
  	}
  	fin.close ();
  	return 0;
}

