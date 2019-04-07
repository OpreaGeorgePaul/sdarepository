public class Stack
  {
      private static final int MAX_SIZE= 10;
    private  int []stack=new int[MAX_SIZE];
      private int top=-1;

                public void push(int val){
                    if(top==MAX_SIZE -1) {
                        return;
                    }
                        top++;
                        stack[top] = val;

                }
               int pop(){
                   int val =stack[top];
                   top=top-1;

                    return val;
                }
    }

