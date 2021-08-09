#include<stdio.h>
#include<stdlib.h>
struct node{
	struct node *left;
	struct node *right;
	int data;
};
void insert(struct node **root,int data){
	if(data<root->data){
		if(*root->left==NULL){
			*root->data=(struct *node)malloc(sizeof(struct node));
		}
		else
		insert(*root->left,data);
	}
	else{
		if(*root->right==NULL)
		*root->data=(struct *node)malloc(sizeof(struct node));
		else{
		insert(*root->right,data);
		}
	}
}
void display(struct node *root){
	if(root!=null){
		display(root->left);
		prinf(">>%d\t",root->data);
		display(root->right);
	}
}
int main(){
	struct node *root=(struct node*)malloc(sizeof(struct node));
	root->data=22;
	insert(&root,12);
	insert(&root,23);
	insert(&root,24);
	insert(&root,18);
	display(root);
	
}
