package dsStack;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Stack wholeNumber = new Stack(10);
        wholeNumber.status();
        wholeNumber.pop();
        wholeNumber.status();
        wholeNumber.push(4);
        wholeNumber.status();
        wholeNumber.push(56);
        wholeNumber.status();
        for(int i = 1; i <= 10; i++){
            wholeNumber.push(i);
            wholeNumber.status();
        }

        for(int i = 0; i <= 12; i++){
            wholeNumber.pop();
            wholeNumber.status();
        }

        // 
        String hello = "Hello";
        StackChar sc = new StackChar(10);
        for(char c : hello.toCharArray() ){
            sc.push(c);
        }
        for(int i=0; i<10; i++){
            System.out.println(sc.pop());
        }

    }
}