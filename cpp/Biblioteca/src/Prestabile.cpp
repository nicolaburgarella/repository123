#include "Prestabile.h"

Prestabile::Prestabile(bool p)
{
	prestabile = p;
}

Prestabile::~Prestabile()
{
}

void Prestabile::setPrestabile(bool p) {
	prestabile = p;
}

bool Prestabile::isPrestabile() const {
	return prestabile;
}
