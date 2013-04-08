#include "Opera.h"

Opera::Opera()
{
}

Opera::Opera(string c)
{
	codice = c;
}

Opera::~Opera()
{
}

string Opera::getCodice() const {
	return codice;
}


void Opera::setCodice(string i) {
	codice = i;
}
