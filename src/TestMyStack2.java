public class TestMyStack2 {
    public static void main(String[] args) {
        String str = "qwertyuiop";
        char[]arrStr = str.toCharArray();
        display(arrStr);

        MyStack<Character> wStack = new MyStack<>();
        for(int i = 0;i < arrStr.length;i++){
            wStack.push(arrStr[i]);
        }
        str = "";
        for (int i = 0; i < arrStr.length; i++) {
            str += wStack.pop();
        }


        System.out.println(str);
    }
    static void display(char[] arr){
        for (char a: arr) {
            System.out.println(a);
        }
    }
}
