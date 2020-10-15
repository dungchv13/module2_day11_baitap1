public class TestMyStack {
    public static void main(String[] args) {
        int[] arrInt = new int[10];
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = i;
        }
        display(arrInt);
        System.out.println("=======================");
        MyStack<Integer> sTest = new MyStack<>();
        for (int i = 0;i < arrInt.length;i++){
            sTest.push(arrInt[i]);
        }

        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = sTest.pop();
        }
        display(arrInt);
    }
    static void display(int[] arr){
        for (int a: arr) {
            System.out.println(a);
        }
    }
}
