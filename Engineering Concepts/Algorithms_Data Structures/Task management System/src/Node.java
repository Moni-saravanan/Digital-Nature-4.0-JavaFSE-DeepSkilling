public class Node {
    Task data;
    Node next;
    static Node head = null;

    public Node(Task data) {
        this.data = data;
        this.next = null;
    }

    public static void add(int taskId, String taskName, String status) {
        Task t = new Task(taskId, taskName, status);
        Node newNode = new Node(t);

        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }

        System.out.println("Task Added Successfully");
    }

    public static void delete(int taskId) {
        if (head == null) {
            System.out.println("Empty Task List");
            return;
        }
        if (head.data.taskId == taskId) {
            head = head.next;
            System.out.println("Task deleted successfully.");
            return;
        }
        Node curr = head;
        Node prev = null;

        while (curr != null && curr.data.taskId != taskId) {
            prev = curr;
            curr = curr.next;
        }

        if (curr == null) {
            System.out.println("Task not found.");
        } else {
            prev.next = curr.next;
            System.out.println("Task deleted successfully.");
        }
    }

    public static void display() {
        if (head==null) {
            System.out.println("Empty Task list");
            return;
        }
        Node curr=head;
        while (curr!=null) {
            System.out.println(curr.data.taskId+"->"+curr.data.taskName+"->"+curr.data.status);
            curr=curr.next;
        }
    }
    public static void search(int taskId) {
        if(head==null) {
            System.out.println("Empty Task List");
            return;
        }
        Node curr=head;
        while (curr!=null) {
            if(curr.data.taskId==taskId) {
                System.out.println(head.data.taskId+"->"+head.data.taskName+"->"+head.data.status);
                return;
            }
            curr=curr.next;
        }
    }
}
