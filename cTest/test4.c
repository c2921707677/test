#include<stdio.h>

int test = 1;

void main()
{  
    void sort(int arr[],int n);
    int a[7];
    printf("请输入7个元素:\n");
    for(int i=0;i<7;i++)
    {
        scanf("%d",&a[i]);
    }
printf("排序前的数组：\n");
     for(int i=0;i<7;i++)
    {
        printf("%d,",a[i]);
    }
    printf("\n");

    sort(a,7);
    printf("排序过后的数组：\n");
     for(int i=0;i<7;i++)
    {
        printf("%d,",a[i]);
    }
    printf("\n");
    
}
void sort(int arr[],int n)
{
    int temp;
    for(int j=0;j<n;j++)
    {
        for(int i=0;i<n-j-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
printf("排序中的数组：\n");
     for(int i=0;i<7;i++)
    {
        printf("%d,",arr[i]);
    }
    printf("\n");

    }
    
}
