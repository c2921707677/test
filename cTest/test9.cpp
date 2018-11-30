#include <stdio.h>
#include <stdlib.h>

int main(void)
{
	char *a = "abc";
	printf("%s\n",a);
	free((a+sizeof(char)));
	printf("%s\n",a);
	return 0;
}
