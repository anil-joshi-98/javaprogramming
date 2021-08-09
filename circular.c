#include<stdio.h>
#include<stdlib.h>
struct Node{
	int data;
	struct Node* next;
};
struct Node *create(){
	struct Node *temp=(struct Node*)malloc(sizeof(struct Node));
	return temp;
}
struct Node *insert(struct Node *last){
	struct Node *temp=create();
	printf("enter data\n");
	scanf("%d",&temp->data);
	if(last==NULL){
		last=temp;
		last->next=last;
	}
	else{
		temp->next=last->next;
		last->next=temp;
		last=temp;
	}
	return last;
}
void display(struct Node *last){
	if(last==NULL){
		printf("empty");
	}
	else{
		struct Node *temp=last->next;
		do{
			printf("%d\n",temp->data);
			temp=temp->next;
		}while(temp!=last->next);
	}
}
int main(){
	struct Node *last=NULL;
	last=insert(last);
	last=insert(last);
	last=insert(last);
	display(last);
	return 0;
}
