package academy.learnprogramming.stacks;

public class Main {

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        stack.push(new Employee("Akash", "Bangera", 100));
        stack.push(new Employee("Harshita", "Dekate", 200));
        stack.push(new Employee("Shalabh", "Mittal", 300));
        stack.push(new Employee("Sujay", "Joshi", 400));

        stack.printStack();
        System.out.println(stack.size());
        System.out.println("-----------------------------------------------");
        stack.pop();
        stack.printStack();
        System.out.println(stack.size());
        System.out.println("-----------------------------------------------");

        System.out.println(stack.peek());
//        stack.printStack();
//        System.out.println("-----------------------------------------------");








    }
}
