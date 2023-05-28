// Time Complexity : O(1)
// Space Complexity : O(1)
class Solution
{
    void deleteNode(Node del)
    {
        // Your code here
        if(del.next != null) {
            del.data = del.next.data;
            del.next = del.next.next;
        }
    }
}