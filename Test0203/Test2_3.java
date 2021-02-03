package LinkList;

public class Test2_3 {
    public static Node createList() {
        Node num1 = new Node(1);
        Node num2 = new Node(2);
        Node num3 = new Node(3);
        Node num4 = new Node(4);
        Node num5 = new Node(5);

        num1.next = num2;
        num2.next = num3;
        num3.next = num4;
        num4.next = num5;
        num5.next = null;

        return num1;
    }

    public static Node createListWithDummy() {
        Node dummy = new Node(0);
        Node num1 = new Node(1);
        Node num2 = new Node(2);
        Node num3 = new Node(3);
        Node num4 = new Node(4);
        Node num5 = new Node(5);

        dummy.next = num1;
        num1.next = num2;
        num2.next = num3;
        num3.next = num4;
        num4.next = num5;
        num5.next = null;

        return dummy;
    }

    // 遍历一个不带傀儡节点的链表
    public static void print(Node head) {
        for (Node cur = head; cur != null; cur = cur.next) {
            System.out.println(cur.val);
        }
    }

    // 遍历一个带傀儡节点的链表
    public static void printWithDummy(Node head) {
        for (Node cur = head.next; cur != null; cur = cur.next) {
            System.out.println(cur.val);
        }
    }

    public static Node insertTail(Node head, int val) {
        Node num8 = new Node(val);
        if(head == null)
            return num8;
        Node cur = head;
        while(cur.next != null)
            cur = cur.next;
        num8.next = cur.next;
        cur.next = num8;
        return head;
    }

    public static void remove(Node head, int val) {
        Node prev = head;
        while(prev != null && prev.next != null && prev.next.val != val)
            prev = prev.next;
        if(prev == null || prev.next == null)
            return;
        prev.next = prev.next.next;
    }

    public static void remove(Node head, Node toDelete) {
        Node prev = head;
        while(prev != null && prev.next != toDelete)
            prev = prev.next;
        if(prev == null)
            return;
        prev.next = toDelete.next;
    }

    public static void remove1(Node head, Node toDelete) {
        Node next = toDelete.next;
        toDelete.val = next.val;
        toDelete.next = next.next;
    }

    public static int size(Node head) {
        int count = 0;
        for(Node cur = head;cur != null;cur = cur.next)
            count++;
        return count;
    }

    public static void remove2(Node head, int index) {
        if(index < 0 || index > size(head))
            return;
        if(index == 0){
            // 头删
        }
        Node prev = head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
    }

    public static void main(String[] args) {
        // 不带傀儡节点往 2 和 3 中间插：
        Node head = createList();
        Node num6 = new Node(6);
        Node prev = head.next;
        num6.next = prev.next;
        prev.next = num6;

        // 不带傀儡节点头插：
        Node prev1 = head;
        num6.next = prev1;
        prev1 = num6;

        // 带傀儡节点往 2 和 3 中间插：
        Node head1 = createListWithDummy();
        Node num7 = new Node(7);
        Node prev2 = head.next.next;
        num7.next = prev2.next;
        prev2.next = num7;

        // 带傀儡节点头插：
        Node prev3 = head;
        num7.next = prev3.next;
        prev3.next = num7;

        // 验证尾插：
        Node head2 = null;
        head2 = insertTail(head2,8);
        print(head2);

        // 验证删除第 3 个节点：
        Node head3 = createList();
        Node toDelete = head3.next.next;
        remove(head3,toDelete);
        print(head3);
    }
}