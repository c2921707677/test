#include "test.h" 

extern "C" {

	#include "test1.h"
}

extern int test5 = 5;

extern int test6;

int main() 
{
	cout<<test6<<endl;
return 0;
}
