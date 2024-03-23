#include <iostream>
using namespace std;

#define MAX_SIZE 100

class Queue {
private:
    int front, rear;
    int arr[MAX_SIZE];

public:
    Queue() {
        front = -1;
        rear = -1;
    }

    bool isEmpty() {
        return front == -1 && rear == -1;
    }

    bool isFull() {
        return rear == MAX_SIZE - 1;
    }

    void enqueue(int val) {
        if (isFull()) {
            cout << "Queue is full. Cannot enqueue.\n";
            return;
        } else if (isEmpty()) {
            front = rear = 0;
        } else {
            rear++;
        }
        arr[rear] = val;
    }

    void dequeue() {
        if (isEmpty()) {
            cout << "Queue is empty. Cannot dequeue.\n";
            return;
        } else if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }
    }

    int peek() {
        if (isEmpty()) {
            cout << "Queue is empty.\n";
            return -1; // Or any appropriate error value
        }
        return arr[front];
    }
};

int main() {
    Queue q;

    // Enqueue some elements
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);

    // Dequeue an element
    q.dequeue();

    // Enqueue more elements
    q.enqueue(40);
    q.enqueue(50);

    // Peek at the front element
    cout << "Front element: " << q.peek() << endl;

    return 0;
}

