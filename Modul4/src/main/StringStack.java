public class StringStack {
    private String[] stringStack = new String[MAX_SIZE];
    private static final int MAX_SIZE = 10;
    private int top1 = -1;




    void push1(String val1) {
        if (top1 == stringStack.length - 1) {
            return;
        }
        top1++;
        stringStack[top1] = val1;

    }

    String pop1() {
        String val1= " ";
        if (top1 < 0) {
            System.out.println("No more elements.");

        }
        else {
             val1 = stringStack[top1];
            top1 = top1 - 1;

        }
        return val1;
    }

    void reverse(String valString) {
        String outTest ="";
          String[] arrayss = new String[MAX_SIZE];
            arrayss=valString.split(" ");
            for(String element : arrayss){
                push1(element);
            }
        for(int i=0; i<arrayss.length;i++)
        {
             outTest = outTest +" "+ pop1();


        }
        System.out.println(outTest);
    }



}




