#include<stdio.h>
#include<stdlib.h>
struct node{
	struct node *next;
	struct node *prev;
	int data;
};
void insert(struct node **s,int data){
	struct node *n=(struct node*)malloc(sizeof(struct node));
	n->data=data;
	if(*s==NULL){
		n->prev=NULL;
		*s=n;
		n->next=NULL;
	}
	else{
		struct node *temp;
		temp=*s;
		while(temp->next!=NULL)
		temp=temp->next;
		n->prev=temp;
		temp->next=n;
		n->next=NULL;
	}
}
void display(struct node *s){
	if(s==NULL)
	printf("empty");
	else{
		struct node *temp=s;
		do{
			printf("%d\t",temp->data);
			temp=temp->next;
		
		}while(temp!=NULL);
	}
} 
int main(){
	struct node *start=NULL;
	insert(&start,12);
	insert(&start,13);
	insert(&start,14);
	insert(&start,15);
	display(start);
	return 0;
}
