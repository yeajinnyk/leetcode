/**

Problem 2: Add Two Numbers

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, 
and each of their nodes contain a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 */


/**
 * Definition for singly-linked list.
 * struct ListNode {
 *      int val;
 *      struct listNode *next;
 * 
 * };
 * 
 */
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {

    // initialize a node
    struct ListNode temp;
    temp.val = 0;
    temp.next = NULL;

    struct ListNode* curr = &temp;

    int rem = 0, sum;

    while (l1 != NULL || l2 != NULL || rem != 0) {
        sum = rem + (l1 == 0 ? 0 : l1->val) + (l2 == 0 ? 0 : l2->val);

        rem = sum/10;
        sum %= 10;

        curr->next = malloc(sizeof(struct ListNode));
        curr->next->next = NULL;
        curr->next->val = sum;
        curr = curr -> next;

        l1 = (l1 == 0 ? 0 : l1->next); // is NULL? then stay NULL. otherwise, go to next node
        l2 = (l2 == 0 ? 0 : l2->next);
    }

    return temp.next;
}