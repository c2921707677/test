#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define ERROR 0

typedef struct DuLNode
{
	int data;
	struct DuLNode *prior, *next;
}DuLNode, *DuLinkList;

//创建一个双向链表
DuLinkList CreateDuLinkList()
{
		DuLinkList L = (DuLNode *)malloc(sizeof(DuLNode));
		L->prior = NULL;
		L->next = NULL;
		return L;
}

//判断链表是否建立成功
void is_Fail(DuLinkList L)
{
		if(L == NULL)
		{
				printf("创建链表失败\n");
				exit(ERROR);
		}
		//printf("here\n");
}

//判断链表是否为空
void is_Empty(DuLinkList L)
{
		if(L->next == NULL)
		{
				printf("链表为空\n");
				exit(ERROR);
		}
}

//初始化链表
void InitDuLinkList(DuLinkList L)
{
		is_Fail(L);
		DuLNode *p;
		for(int i=10; i>0; --i)
		{
				p = (DuLNode *)malloc(sizeof(DuLNode));
			if (L->next != NULL) {
				L->next->prior = p;
			}
				p->next = L->next;
				p->prior = L;
				L->next = p;
				p->data = 999;
		}
}

//求链表的长度
int DuLinkListLength(DuLinkList L)
{
		is_Fail(L);
		is_Empty(L);
		DuLNode *p = L;
		int count = 0;
		while(p->next != NULL)
		{
				p = p->next;
				count++;
		}
		return count;
}

//遍历链表
void TraverseList(DuLinkList L)
{
		is_Fail(L);
		is_Empty(L);
		DuLNode *p = L;
		while(p->next != NULL)
		{
				p  = p->next;
				printf("%d,", p->data);
		}
		printf("\n");
}

//插入,在第i个位置插入一个新元素，即在第i个元素之前插入
void Insert_DuList(DuLinkList L, int i, int e)
{
		is_Fail(L);
		is_Empty(L);
		DuLNode *p = L->next, *q;
		int count = 1;
		while(p && i>count)
		{
				p = p->next;
				count++;
		}
		if(!p || i<count) exit(ERROR);
		if((q = (DuLNode *)malloc(sizeof(DuLNode))) == NULL) exit(ERROR);
		p->prior->next = q;
		q->next = p;
		q->prior = p->prior;
		p->prior = q;
		q->data = e;
}


int main()
{
		DuLinkList L = CreateDuLinkList();
		InitDuLinkList(L);
		printf("length:%d\n",DuLinkListLength(L));
		TraverseList(L);
		Insert_DuList(L,9,999);
		TraverseList(L);
	return 0;
}
