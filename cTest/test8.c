#include <stdio.h>
#include <stdlib.h>
#include <math.h>
 
int main(void)
{
char a[100]="abc",b[50]="def";
char * c = "ghi";
strcat(a,c);

printf("%s,%d\n",a,sizeof(a));	
int d = 315;
char e[2];
e[1] = d & 0xff;
e[2] = d & 0xff00;
printf("%c\n",e[0]);
strcat(a,e);
printf("%s,%d\n",a,sizeof(a));
return 0;
}
