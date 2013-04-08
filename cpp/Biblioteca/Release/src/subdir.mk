################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../src/Autore.cpp \
../src/Biblioteca.cpp \
../src/CollezioneAutori.cpp \
../src/CollezioneLibri.cpp \
../src/CollezionePrestiti.cpp \
../src/CollezioneUtenti.cpp \
../src/Libro.cpp \
../src/Opera.cpp \
../src/Persona.cpp \
../src/Prestabile.cpp \
../src/Prestito.cpp \
../src/Utente.cpp 

OBJS += \
./src/Autore.o \
./src/Biblioteca.o \
./src/CollezioneAutori.o \
./src/CollezioneLibri.o \
./src/CollezionePrestiti.o \
./src/CollezioneUtenti.o \
./src/Libro.o \
./src/Opera.o \
./src/Persona.o \
./src/Prestabile.o \
./src/Prestito.o \
./src/Utente.o 

CPP_DEPS += \
./src/Autore.d \
./src/Biblioteca.d \
./src/CollezioneAutori.d \
./src/CollezioneLibri.d \
./src/CollezionePrestiti.d \
./src/CollezioneUtenti.d \
./src/Libro.d \
./src/Opera.d \
./src/Persona.d \
./src/Prestabile.d \
./src/Prestito.d \
./src/Utente.d 


# Each subdirectory must supply rules for building sources it contributes
src/%.o: ../src/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: Cygwin C++ Compiler'
	g++ -O3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


