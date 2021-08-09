#include<stdio.h>
#include<stdlib.h>
struct node
{
		int data;
		struct node *next;
};
struct node *HEAD=NULL;
int main(){
    struct node *newnode,*temp;
	int choice=1;
	while(choice!=0){
	newnode=(struct node*)malloc(sizeof(struct node));
	printf("enter the data:\n");
	scanf("%d",&newnode->data);
	newnode->next=NULL;
	if(HEAD==NULL)
	{
		HEAD=newnode;
	}
	else
	{
		temp=HEAD;
		while(temp->next!=NULL){
			temp=temp->next;
		}
		temp->next=newnode;
	}
	printf("enter the choice:\nfor continue enter 1\nfor stoping enter 0\n");
	scanf("%d",&choice);
	}
	temp=HEAD;
	while(temp!=NULL)
	{
		printf("%d\t",temp->data);
        temp=temp->next;		
	}
	return 0;
}
