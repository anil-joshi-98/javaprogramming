#include<stdio.h>
#include<stdlib.h>
struct node{
	int data;
	struct node *next;
};
struct node *head=NULL;
struct node *createNode(){
	struct node *temp=(struct node*)malloc(sizeof(struct node));
	return temp;
}
void insertFun(int data){
	struct node* temp=createNode();
	temp->data=data;
	temp->next=NULL;
	if(head==NULL){
		head=temp;
	}
	else{
		struct node *t=head;
		while(t->next!=NULL){
			t=t->next;
		}
		t->next=temp;
	}
}
void display(){
	if(head==NULL){
		printf("no values");
		return;
	}
	struct node* temp=head;
	while(temp!=NULL){
		printf("%d\t",temp->data);
		temp=temp->next;
	}
}
int main(){
	insertFun(12);
	insertFun(15);
	insertFun(16);
	insertFun(30);
	display();
}
