#ifndef OPERA_H_
#define OPERA_H_

#include <string>

using namespace std;

class Opera
{
public:
	Opera();
	Opera(string codice);
	virtual ~Opera();
	string getCodice() const;
	void setCodice(string c);
protected:
	string codice;
};

#endif /*OPERA_H_*/
