#include "SqArray.h"

bool InitArray (Array &A,int dim,int bound)
{
	if ( dim<1 || dim> MAX_ARRAY_SIZE )
		return false;
	A.dim=dim;
	A.bounds=bound;
	A.base =(int *) malloc ((dim *bound *bound)*sizeof (int ) );
	if (!A.base)
	{
		cout<<"数组空间分配失败！"<<endl;
		exit (1);
	}
	srand((unsigned) time(NULL)); 
	for (int i=0 ; i<dim*bound*bound ;i++ )
	{
		A.base[i]=rand()%100;
	}
	return true;
}

bool TraverseArray (Array a)
{
	int i,j,k,e;
	ArrayPosition p;
	for(i=0 ; i<3 ; i++)
   {
     for(j=0 ; j<3 ; j++)
     {
       for(k=0 ; k<3 ; k++)
       {
		 p.dims=i,p.hang=j,p.lie=k;
         Value(a,e,p); /* 将A[i][j][k]的值赋给e */
         printf("a[%d][%d][%d]=%2d ",i,j,k,e); /* 输出A[i][j][k] */
       }
       printf("\n");
     }
     printf("\n");
   }
	return true;
}

bool Value (Array A,int &e,ArrayPosition p)
{
	if (p.dims>A.dim)
		return false;
	e=A.base[p.dims*p.hang*p.lie+p.hang*p.lie+p.lie];
	return true;
}

bool Assign (Array &A,int e,ArrayPosition p)
{
	if (p.dims>A.dim)
		return false;
	A.base[p.dims*p.hang*p.lie+p.hang*p.lie+p.lie]=e;
	return true;
}

