#include "SqArray.h"
#include <wchar.h>

int main()
{
	Array test;
	int exp;
	ArrayPosition p;
	cout<<"随机创建三维三行三列数组："<<endl<<endl;
	if (InitArray (test,3,3))
		cout<<"数组创建成功！"<<endl<<endl<<"遍历数组："<<endl;
	TraverseArray (test);
	
	cout<<"获取数组元素："<<endl;
	cout<<"请输入想获取第几维的元素：";
	cin>>p.dims;
	cout<<"请输入想获取第几行的元素：";
	cin>>p.hang;
	cout<<"请输入想获取第几行的元素：";
	cin>>p.lie;
	Value (test,exp,p);
	cout<<"获取的元素值："<<exp<<endl;
	cout<<"为数组元素赋新值：";
	cout<<"请输入想赋值元素的维度：";
	cin>>p.dims;
	cout<<"请输入想赋值元素的维度的行：";
	cin>>p.hang;
	cout<<"请输入想赋值元素的维度的列：";
	cin>>p.lie;
	cout<<"请输入想赋的值：";
	cin>>exp;
	Assign (test,exp,p);
	cout<<"遍历新数组：";
	TraverseArray (test);
	return 0;
}
