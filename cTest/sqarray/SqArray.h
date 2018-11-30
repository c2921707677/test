#include <malloc.h>
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <iostream>
#include <time.h>

using namespace std;

#define MAX_ARRAY_SIZE 8

typedef struct {
	int *base; /* ����Ԫ�ػ�ַ����InitArray���� */
	int dim;  /* ����ά�� */
	int bounds;
} Array;
typedef struct {
	int dims;
	int hang;
	int lie;
} ArrayPosition;

bool TraverseArray (Array a);
bool InitArray (Array &A,int dim,int bound);
bool DestroyArray (Array &A);
bool Value (Array A,int &e,ArrayPosition p);
bool Assign (Array &A,int e,ArrayPosition p);

