#include<stdio.h>
#include<stdlib.h>
struct node{
	int data;
	struct node *n;
};
struct node *top=NULL;

void insert(){
	struct node *temp=(struct node*)malloc(sizeof(struct node));
	printf("enter data\n");
	scanf("%d",&temp->data);
	if(top==NULL){
		top=temp;
		top->n=NULL;
		return;
	}
	temp->n=top;
	top=temp;
}

void delete(){
	if(top==NULL){
		printf("stack is empty\n");
		return;
	}
	printf("%d deleted successfully\n",top->data);
	top=top->n;
}

void display(){
	struct node *temp=top;
	if(top==NULL){
		printf("stack is empty\n");
		return;
	}
	while(temp!=NULL){
		printf("%d ",temp->data);
		temp=temp->n;
	}
}

int main(){
	int ch=0;
	while(ch!=4){
		printf("\nenter choice 1.Insert \n2.Delete\n3.Display\n4.exit\n");
		scanf("%d",&ch);
		if(ch==1)
		insert();
		else if(ch==2)
		delete();
		else if(ch==3)
		display();
		else if(ch!=4)
		printf("\nenter correct choice\n");
	}
	printf("\nThankyou for using stack \n");
}
