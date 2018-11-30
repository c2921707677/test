#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <malloc.h> 
#include <math.h>

#define TRUE 1
#define FALSE 0
#define OK 1
#define ERROR 0
#define MAX_TREE_SIZE 10
#define Nil ' '

typedef char TElemtype;    //将树的结点类型设置为字符型 
typedef TElemtype SqBiTree[MAX_TREE_SIZE];    //定义顺序存储二叉树的结构数组 

typedef struct{
    int level;    //树的层号 
    int order;    //一层中的序号(从左向右) 
}position;
int (*TreeVisit)(TElemtype); 

/*初始化树*/ 
int InitBiTree(SqBiTree T)
{
    int i;
    for(i=0;i<MAX_TREE_SIZE;i++)
    {
        T[i]=Nil;    //将初值设为空格 
    }

    T[MAX_TREE_SIZE]='\0';    //给数组尾部加上结标致 
    return OK;
} 

/*创建树*/ 
int CreateBiTree(SqBiTree T)
{
    int i=0;
    int l=0;
    char s[MAX_TREE_SIZE];
    printf("请按顺序输入结点的值,空格表示空结点,结点数<=%d\n",MAX_TREE_SIZE);
    fgets(s,11,stdin);
    //scanf("%s",s); //碰见空格就挂了
    l=strlen(s)-1; //-1是处理掉输入字符串最后的＇\0＇
    for(;i<l;i++)
    {
        T[i]=s[i];
        if(i!=0&&T[(i+1)/2-1]==Nil&&T[i]!=Nil)
        {
            printf("出现无双亲且不是根的结点.\n");
            return ERROR;
        }
    }
    for(;i<MAX_TREE_SIZE;i++)
    {
        T[i]=Nil; 
    }
    return OK;
}

#define ClearBiTree InitBiTree    //在顺序存储结构中,ClearBiTree和InitBiTree完全一样 

/*判断树是否为空*/ 
int BiTreeEmpty(SqBiTree T)
{
    if(T[0]==Nil)
    {
        printf("树为空.\n");
        return TRUE;
    }
    else
    {
        return FALSE;
    }
}

/*计算树的深度*/ 
int BiTreeDepth(SqBiTree T)
{
    int j=-1;
    int i=0;
    if(BiTreeEmpty(T))
    {
        return ERROR;    
    }
    for(i=MAX_TREE_SIZE-1;i>=0;--i)
    {
        if(T[i]!=Nil)//找到最后一个不为空的结点的　下标
        {
            break;
        }
    }
    i++; //结点个数
    do
    {
        j++;
    }while(i>=pow(2,j));
    return j;
}

/*获取根结点的值*/ 
int GetRoot(SqBiTree T,TElemtype * e)
{
    if(BiTreeEmpty(T))
    {
        return ERROR;
    }
    *e=T[0];
    return OK;
}
/*访问结点元素的函数*/ 
int TreeVisitFunc(TElemtype e)
{
    printf(" %c -",e);
}

/*先序遍历二叉树的递归函数*/ 
int PreTraverse(SqBiTree T,int i)
{
	printf("visit i = %d \n", i);
    TreeVisit(T[i]);
    if(T[2*i+1]!=Nil)
    {
        PreTraverse(T,2*i+1);
    }
    if(T[2*i+2]!=Nil)
    {
        PreTraverse(T,2*i+2);
    }
    
}

/*先序遍历二叉树*/ 
int PreOrderTraverse(SqBiTree T,int (*TV) (TElemtype e))
{
    TreeVisit=TV;
    if(BiTreeEmpty(T))
    {
        return ERROR;
    }
    PreTraverse(T,0);
}

/*中序遍历二叉树的递归函数*/ 
int InTraverse(SqBiTree T,int i)
{
    if(T[2*i+1]!=Nil)
    {
        InTraverse(T,2*i+1);
    }
    TreeVisit(T[i]);
    if(T[2*i+2]!=Nil)
    {
        InTraverse(T,2*i+2);
    }
}

/*中序遍历二叉树*/
int InOrderTraverse(SqBiTree T,int (*TV)(TElemtype))
{
    TreeVisit=TV;
    if(BiTreeEmpty(T))
    {
        return ERROR;
    }
    InTraverse(T,0);
}

/*打印树*/ 
void PrintTree(SqBiTree T)
{
    int j,k;
    position p;
    TElemtype e;
    for(j=0;j<BiTreeDepth(T);j++)
    {
        p.level=j+1;
        printf("第%d层:\n",p.level);
        for(k=0;k<pow(2,p.level-1);k++)
        {
            p.order=k+1;
            e=T[(int)pow(2,p.level)-1-(int)pow(2,p.level-1)+p.order-1];
            printf(" %d : %c ",p.order,e);
        }
        printf("\n");
    }
    printf("\n");
}
