#include "SqArray.h"
#include <wchar.h>

int main()
{
	Array test;
	int exp;
	ArrayPosition p;
	cout<<"���������ά�����������飺"<<endl<<endl;
	if (InitArray (test,3,3))
		cout<<"���鴴���ɹ���"<<endl<<endl<<"�������飺"<<endl;
	TraverseArray (test);
	
	cout<<"��ȡ����Ԫ�أ�"<<endl;
	cout<<"���������ȡ�ڼ�ά��Ԫ�أ�";
	cin>>p.dims;
	cout<<"���������ȡ�ڼ��е�Ԫ�أ�";
	cin>>p.hang;
	cout<<"���������ȡ�ڼ��е�Ԫ�أ�";
	cin>>p.lie;
	Value (test,exp,p);
	cout<<"��ȡ��Ԫ��ֵ��"<<exp<<endl;
	cout<<"Ϊ����Ԫ�ظ���ֵ��";
	cout<<"�������븳ֵԪ�ص�ά�ȣ�";
	cin>>p.dims;
	cout<<"�������븳ֵԪ�ص�ά�ȵ��У�";
	cin>>p.hang;
	cout<<"�������븳ֵԪ�ص�ά�ȵ��У�";
	cin>>p.lie;
	cout<<"�������븳��ֵ��";
	cin>>exp;
	Assign (test,exp,p);
	cout<<"���������飺";
	TraverseArray (test);
	return 0;
}
