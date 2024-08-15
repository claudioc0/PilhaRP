
public class Main {
    public static void main(String[] args) {
        DynamicStack dynamicStack = new DynamicStack<>();
        dynamicStack.push(1);
        dynamicStack.push(2);
        dynamicStack.push(3);
        dynamicStack.push(5);
        dynamicStack.push(8);
        dynamicStack.push(13);
        System.out.println(dynamicStack);

        StaticStack staticStack = new StaticStack<>();
        staticStack.push(2);
        staticStack.push(4);
        staticStack.push(6);
        staticStack.push(10);
        staticStack.push(16);
        staticStack.pop();
        staticStack.push(42);
        System.out.println(staticStack);
    }
}