#ifndef PRESTABILE_H_
#define PRESTABILE_H_

#include <string>

using namespace std;

class Prestabile
{
public:
	Prestabile(bool p=true);
	virtual ~Prestabile();
	void setPrestabile(bool p);
	bool isPrestabile() const;
protected:
	bool prestabile;
};

#endif /*PRESTABILE_H_*/
