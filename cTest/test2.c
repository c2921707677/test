#include <stdio.h>

int main()
{
	int a[] = {1,2,3,4,5};
	char b[] = {'1','2','3','4','5'}; 
	printf("h1:%d,%d,%d,%d\n",sizeof(int),sizeof(float),sizeof(char),sizeof(double));
	printf("h2:%d,%d\n",sizeof (a),sizeof(int));
	printf("test:%s\n",b);
	printf("h3:%d,%d\n",sizeof(b),sizeof(char));
	printf("test:%d,%d,%d\n",sizeof(a),sizeof(*a),sizeof(&a));
}
