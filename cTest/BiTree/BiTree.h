#include <stdio.h>
#include <stdlib.h>

#define ERROR 0
#define OK 1
#define	Nil ' '
#define TRUE 1
#define FALSE 0

typedef struct BiTNode{
		char data;
		struct BiTNode *lchild, *rchild; 
}BiTNode, *BiTree;
 
int createBiTree(BiTree T)
{	
		printf("createBiTree\n");
		char e;
		scanf("%c",&e);
		if(e == Nil){
			printf("e == Nil\n");
			T = NULL;
		} else
		{
			printf("e != Nil\n");
				T = (BiTree) malloc (sizeof(BiTNode));
				if(!T)
				{
						printf("创建二叉链表失败\n");
						return ERROR;
				}
				T->data = e;
			//if (T->data != Nil) 
			{
				createBiTree(T->lchild);
				createBiTree(T->rchild);
			}
		}
		return TRUE;
}

int BiTreeEmpty(BiTree T)
{
		if(T)
		{
				return FALSE;
		}else{
				return TRUE;
		}
}

int BiTreeDepth(BiTree T)
{
		if(BiTreeEmpty(T))
		{
				printf("二叉树为空\n");
				return ERROR;
		}
		int ld, rd;
		if(T->lchild)
		{
				ld = BiTreeDepth(T->lchild);
		}else{
				ld = 0;
		}
		if(T->rchild)
		{
				rd = BiTreeDepth(T->rchild);
		}else{
				rd = 0;
		}
		return ld>rd?ld+1:rd+1;
}

char GetRoot(BiTree T)
{
    /*初始条件:二叉树T存在。操作结果:返回T的根*/
    if(BiTreeEmpty(T))return Nil;
    else return T->data;
}


int PreOrderTraverse(BiTree T)
{
	printf("PreOrderTraverse\n");
		if(BiTreeEmpty(T))
		{
				printf("二叉树为空\n");
				return ERROR;
		}
		printf("%c-",T->data);
		PreOrderTraverse(T->lchild);
		PreOrderTraverse(T->rchild);
}

void InOrderTraverse(BiTree T)
{
		
}

void PostOrderTraverse(BiTree T)
{
		
}

void LevelOrderTraverse(BiTree T)
{
		
}
