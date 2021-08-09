#include<stdio.h>
#include<stdlib.h>
struct node{
	int age;
//	char name[10];
	struct node *next;
};
struct node* head=NULL;
struct node* create(){
	struct node *temp=(struct node*)malloc(sizeof(struct node));
	return temp;
}
void insert(int age){
	struct node *temp=create();
	if(temp==NULL){
		printf("memory error");
	}
	else{
		temp->age=age;
		temp->next=NULL;
	if(head==NULL){
		head=temp;
	}
	else{
		struct node* t=head;
		while(t->next!=NULL){
			t=t->next;
		}
		t->next=temp;
	}
	}
}
void display(){
	struct node* temp=head;
	if(head==NULL){
		printf("empty list\n");
	return;
	}
	else{
	while(temp!=NULL){
		printf("%d\n",temp->age);
		temp=temp->next;
	}
	}
}
void delete(){
	struct node *temp,*temp1;
	temp=head;
	if(head==NULL){
	printf("empty list\n");
	return;
	}
	else if(head->next==NULL)
	head=NULL;
	else{
	while(temp->next!=NULL){
		temp1=temp;
		temp=temp->next;
	}
	temp1->next=NULL;
	}
}
int main(){
	int ch=1;
	while(ch!=0){
	printf("enter your choice\n1.insert\n2.delete\n3.display\n0.exit\n");
	scanf("%d",&ch);
	if(ch==1){
		int data;
		printf("enter data to insert in the linkedlist\n");
		scanf("%d",&data);
		insert(data);
	}
	else if(ch==2)
	delete();
	else if(ch==3)
	display();
	else if(ch==0)
	exit(0);
	else
	printf("enter correct choice\n");
	}
}
