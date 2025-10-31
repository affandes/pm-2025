import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class StackQueueExample {
    public static void main(String[] args) {
        
        // --- Contoh STACK ---
        Stack<String> stack = new Stack<>();
        System.out.println("=== STACK (LIFO) ===");
        
        // Menambahkan elemen ke stack
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("Isi stack: " + stack);

        // Menghapus elemen teratas (pop)
        String popped = stack.pop();
        System.out.println("Elemen yang di-pop: " + popped);
        System.out.println("Isi stack setelah pop: " + stack);

        // Melihat elemen teratas tanpa menghapus (peek)
        System.out.println("Elemen teratas (peek): " + stack.peek());
        System.out.println("Isi akhir stack: " + stack);

        System.out.println("\n=== QUEUE (FIFO) ===");

        // --- Contoh QUEUE ---
        Queue<String> queue = new LinkedList<>();

        // Menambahkan elemen ke queue
        queue.add("A");
        queue.add("B");
        queue.add("C");
        System.out.println("Isi queue: " + queue);

        // Menghapus elemen pertama (poll)
        String removed = queue.poll();
        System.out.println("Elemen yang di-poll: " + removed);
        System.out.println("Isi queue setelah poll: " + queue);

        // Melihat elemen terdepan tanpa menghapus (peek)
        System.out.println("Elemen terdepan (peek): " + queue.peek());
        System.out.println("Isi akhir queue: " + queue);
    }
}
