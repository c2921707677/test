#include "SqBiTree.h"

void main(){
		position p;
		SqBiTree T;
		SqBiTree S;
		int depth;
		int i;
		TElemtype elem;
		InitBiTree(T);
		BiTreeEmpty(T);
		CreateBiTree(T);
		puts(T);
		depth=BiTreeDepth(T);
		printf("The Depth of the tree is %d.\n",depth);
		printf("--------------遍历二叉树--------------------\n\n");
		printf("先序遍历:\n");
		PreOrderTraverse(T,TreeVisitFunc);
		printf("\n");
		printf("--------------打印二叉树--------------------\n\n");
		PrintTree(T); 
}
