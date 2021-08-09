#include<stdio.h>
#include<stdlib.h>
struct node{
	int data;
	struct node* next;
};
void insert(struct node *head){
	struct node *temp=(struct node*)malloc(sizeof(struct node));
	printf("enter the data\n");
	scanf("%d",&temp->data);
	temp->next=NULL;
	struct node *t=head;
	while(t->next!=NULL){
		t=t->next;
	}
	t->next=temp;
}

void midNode(struct node *head){
	if(head==NULL){
		printf("empty\n");
		return;
	}
	int count=0;
	struct node *temp=head;
	while(temp!=NULL){
		count++;
		temp=temp->next;
	}
	count=count/2;
	temp=head;
	while(count-->0){
		temp=temp->next;
	}
	printf("\nmid node is==%d",temp->data);
}

void delete(struct node *head,int key){
	struct node *temp=head;
	struct node *t=head;
	int flag=1;
	if(head==NULL){
		printf("emtpy\n");
		return;
	}
	while(flag!=0 || temp!=NULL){
		if(temp->data==key){
		flag=0;
		break;
		}
		t=temp;
		temp=temp->next;
	}
	t->next=temp->next;
}

void display(struct node* head){
	if(head==NULL){
		return;
	}
	printf("%d\t",head->data);
	display(head->next);
}

int main(){
	struct node *head=NULL;
	int ch;
	while(1){
		scanf("%d",&ch);
		if(ch==1){
		if(head==NULL){
		struct node *temp=(struct node*)malloc(sizeof(struct node));
		printf("enter the data\n");
		scanf("%d",&temp->data);
		temp->next=NULL;
		head=temp;
		}
		else
		insert(head);
		}
		else if(ch==2)
		midNode(head);
		else if(ch==3)
		display(head);
		else if(ch==4){
			int key;
		printf("enter value to delete\n");
		scanf("%d",&key);
		delete(head,key);
		}
		else
		exit(0);
	}
}
