#include <iostream> 
using namespace std; 

class node { 
public: 
	int data; 
	node* next; 
}; 

class mystack { 
public: 
	node* head; 
	node* tail; 

	mystack() 
	{ 
		head = NULL; 
		tail = NULL; 
	} 
}; 

mystack* create() 
{ 
	mystack* ms = new mystack();
	return ms; 
} 

void push(int data, mystack* ms) 
{ 
	node* temp = new node(); 
	temp->data = data; 
	temp->next = ms->head; 

	if (ms->head == NULL) 
		ms->tail = temp; 
	
	ms->head = temp; 
} 

int pop(mystack* ms) 
{ 
	if (ms->head == NULL) { 
		cout << "stack underflow" << endl; 
		return 0; 
	} 
	else { 
		node* temp = ms->head; 
		ms->head = ms->head->next; 
		int popped = temp->data; 
		delete temp; 
		return popped; 
	} 
} 

void merge(mystack* ms1, mystack* ms2) 
{ 
if (ms1->head == NULL) 
{ 
	ms1->head = ms2->head; 
	ms1->tail = ms2->tail; 
	return; 
} 
	
ms1->tail->next = ms2->head; 
ms1->tail = ms2->tail; 
} 

void display(mystack* ms) 
{ 
	node* temp = ms->head; 
	while (temp != NULL) { 
		cout << temp->data << " "; 
		temp = temp->next; 
	} 
} 

int main() 
{ 
	mystack* ms1 = create(); 
	mystack* ms2 = create(); 

	push(5, ms1); 
	push(10, ms1); 
	push(15, ms1); 
	push(20, ms2); 
	push(25, ms2); 
	push(30, ms2); 
	merge(ms1, ms2); 
	display(ms1); 
} 
