#include <iostream>
#include <string>
#include <cstdlib>
#include <ctime>
#include "Persona.h"
#include "Utente.h"
#include "Autore.h"
#include "Libro.h"
#include "Prestito.h"
#include "CollezioneAutori.h"
#include "CollezioneUtenti.h"
#include "CollezioneLibri.h"
#include "CollezionePrestiti.h"

using namespace std;

#define clrscr() printf("\e[2J")
	
int main(void) {
	bool end = false;
	unsigned int scelta;
	bool sbagliato;
	string buf;
	CollezioneAutori *ca = new CollezioneAutori();
	ca->carica();
	CollezioneUtenti *cu = new CollezioneUtenti();
	cu->carica();
	CollezioneLibri *cl = new CollezioneLibri();
	CollezionePrestiti *cp = new CollezionePrestiti();
do{
	do
    {
    	sbagliato = false;
        clrscr();
        cout            << "*******************************************" << endl
                        << "************ GESTIONE BIBLIOTECA **********" << endl
                        << "*******************************************" << endl << endl
                        << "1 - Inserisci utente" << endl
                        << "2 - Cerca utente" << endl
                        << "3 - Inserisci autore" << endl
                        << "4 - Cerca autore" << endl
                        << "5 - Inserisci libro" << endl
                        << "6 - Cerca libro per titolo" << endl
                        << "7 - Cerca libro per autore" << endl
                        << "8 - Nuovo prestito" << endl
                        << "9 - Elimina prestito" << endl
                        << "0 - Esci" << endl
                        << endl << endl << "- Inserire la scelta digitando l'apposito numero: ";
		cin >> scelta;
		if (!cin)
		{
			sbagliato = true;;
			cin.clear();
			cin.ignore(INT_MAX,'\n');
		}
		
		cin.ignore(INT_MAX, '\n' );
		
    }while(sbagliato);
	
        switch (scelta)
        {
               	case 1:		{
               					clrscr();
               					cout << "- Inserimento dati relativi all'utente da inserire: " << endl << endl;
               					Utente u;
                   				cin >> u;
                   				
                   				if (cu->inserisci(u)) {
                   					cout << endl << endl << "- Utente inserito correttamente." << endl;
                   				}
                   				else {
                   					cout << endl << endl << "- Utente già presente in lista. Inserimento non avvenuto." << endl;
                   				}
                   				cout << endl << endl << "Premi ENTER per continuare." << endl;
                   				getline(std::cin, buf,'\n');  
                                break;
               					}
               	case 2:		{
               					clrscr();
               					cout << "- Inserimento dati relativi all'Utente da cercare: " << endl << endl;
               					Persona u;
                   				cin >> u;
                   				int trovato = cu->cerca(u.getNome(),u.getCognome());
                   				if (trovato != -1) {
                   					cout << endl << "- Utente trovato:" << endl;
                   					Persona *p;
                   					Utente* e;
                   					e = cu->getUtente(trovato);
                                    p = e;
                   					cout << *p;
                   				}
                   				else {
                   					cout << endl << "- Utente non trovato." << endl;
                   				}
                   				cout << endl << endl << "Premi ENTER per continuare." << endl;
                   				getline(std::cin, buf,'\n');  
                                break;
               					}
               	case 3:		{
               					clrscr();
               					cout << "- Inserimento dati relativi all'autore da inserire: " << endl << endl;
               					Autore a;
                   				cin >> a;
                   				if (ca->inserisci(a)) {
                   					cout << endl << endl << "- Autore inserito correttamente." << endl;
                   				}
                   				else {
                   					cout << endl << endl <<  "- Autore già presente in lista. Inserimento non avvenuto." << endl;
                   				}
                   				cout << endl << endl << "Premi ENTER per continuare." << endl;
                   				getline(std::cin, buf,'\n');  
                                break;
               					}
               	case 4:		{
               					clrscr();
               					cout << "- Inserimento dati relativi all'autore da cercare: " << endl << endl;
               					Persona a;
                   				cin >> a;
                   				int trovato = ca->cerca(a.getNome(),a.getCognome());
                   				if (trovato != -1) {
                   					cout << endl << "- Autore trovato:" << endl;
                   					Persona *p;
                   					Autore* e;
                   					e = ca->getAutore(trovato);
                                    p = e;
                   					cout << *p;
                   				}
                   				else {
                   					cout << endl << "- Autore non trovato." << endl;
                   				} 
                   				cout << endl << endl << "Premi ENTER per continuare." << endl;
                   				getline(std::cin, buf,'\n');  
                                break;
               					}
                case 5:		{
                				clrscr();
               					cout << "- Inserimento dati relativi al libro da inserire: " << endl << endl;
               					Libro l(ca);
                   				if (l.inserisci()) {
                   					if (cl->inserisci(l)) 
                   						cout << endl << endl << "- Libro inserito correttamente." << endl;
                   					else 
                   						cout << endl << endl << "- Libro con la stessa segnatura già presente in lista. Inserimento non avvenuto." << endl;
                   				}
                   				cout << endl << endl << "Premi ENTER per continuare." << endl;
                   				getline(std::cin, buf,'\n');  
                                break;
                				}
               	case 6:		{
               					clrscr();
								cout << "- Inserimento dati relativi al libro da cercare: " << endl;
               					cout << endl << endl << "Inserisci il titolo: " << endl;
               					string titolo;
								getline(std::cin, titolo,'\n'); 
                   				cl->cerca(titolo);
                   				cout << endl << endl << "Premi ENTER per continuare." << endl;
                   				getline(std::cin, buf,'\n');  
                                break;
               					}
               	case 7:		{
               					clrscr();
               					cout << "- Inserimento dati relativi all'autore da cercare: " << endl;
               					Persona a;
                   				cin >> a;
                   				int trovato = ca->cerca(a.getNome(),a.getCognome());
                   				if (trovato != -1) {
                   					cout << endl << "- Autore trovato." << endl << endl;
                   					Autore e;
                   					e = *(ca->getAutore(trovato));
                   					cl->cerca(e);
                   				}
                   				else {
                   					cout << endl << "- Autore non trovato." << endl;
                   				} 
                   				cout << endl << endl << "Premi ENTER per continuare." << endl;
                   				getline(std::cin, buf,'\n');  
                                break;
               					}
                case 8:		{
                				clrscr();
								cout << "- Inserimento dati relativi al libro da prendere in prestito: " << endl;
               					cout << endl << endl << "- Inserisci il codice univoco ISBN: " << endl;
               					string codice;
               					getline(cin, codice, '\n');
               					int posizione = cl->cercaPerCodice(codice);
                   				if (posizione >= 0) {
                   					Libro* libro = cl->getLibro(posizione);
                   					cout << endl << "- Libro trovato: " << endl;
                   					cout << *libro;
                   					cout << endl << "- Inserimento dati relativi all'utente da cercare: " << endl;
               						Persona u;
                   					cin >> u;
                   					int trovato = cu->cerca(u.getNome(),u.getCognome());
                   					if (trovato != -1) {
                   						Utente* e;
                   						e = cu->getUtente(trovato);
                   						if (e->getLibriInPrestito() <= 3-1) {
											time_t ltime = time (NULL);
                   							ltime += 30*24*3600;
                   							string data = ctime(&ltime);
                   							Prestito p(libro,e,data);
                   							cp->inserisci(p);
                   							cout << endl << endl << "- Prestito effettuato correttamente." << endl << "Data scadenza del prestito: " << data;
                   						}
                   						else {
                   							cout << endl << "-  L'utente ha esaurito il numero massimi di libri prestati (3). Restituire qualche libro." << endl;
                   						}
                   					}
                   					else
                   					{
                   						cout << endl << "- Utente non trovato." << endl;
                   					}
                   				}
                   				if (posizione == -1) {
                   					cout << endl << endl << "- Il libro non disponibile (e' gia' prestato)." << endl;
                   				}
                   				if (posizione == -2) {
                   					cout << endl << endl << "- Libro non trovato" << endl;
                   				}
                   				cout << endl << endl << "Premi ENTER per continuare." << endl;
                   				getline(std::cin, buf,'\n');  
                                break;
               					}
                 case 9:		{
                 				clrscr();
								cout << "- Inserimento dati relativi al libro da restituire: " << endl;
               					cout << endl << "- Inserisci il codice univoco ISBN: " << endl;
               					string codice;
               					getline(cin, codice, '\n');
               				    cout << endl << "- Inserimento dati relativi all'utente: " << endl;
               					Persona u;
                   				cin >> u;
                   				int trovato = cp->cerca(codice,u);
                   				if (trovato >= 0) {
                   					cp->rimuoviPrestito(trovato);
                   					cout << endl << endl << "- Prestito rimosso con successo." << endl;
                   				}
                   				else
                   				{
                   					cout << endl << endl << "- Prestito non trovato." << endl;
                   				}
                   				cout << endl << endl << "Premi ENTER per continuare." << endl;
                   				getline(std::cin, buf,'\n');  
                                break;
               					}
               	case 0:			delete ca;
               	                delete cu;
               	                delete cl;
               	                delete cp;
               	                end = true;
               					exit(0);
               	default:		cout << endl << endl << "- Scelta non valida. Premi ENTER per continuare." << endl;	
               					getline(std::cin, buf,'\n'); 			
         }
  	}
    while (!end);	
	return 0;
}




