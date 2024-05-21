import java.util.*;
public class GenericStack<E> {
  Stack<E> stk = new Stack<E>();
  public void push(E obj) {
	stk.push(obj);
  }
  public E pop(){
	E obj = stk.pop();
	return obj;
  }
  public static void main(String args[]) {
	GenericStack<String> gs1 = new GenericStack<String>();
	gs1.push("Hello");
	System.out.print(gs1.pop() + " ");
	GenericStack <Integer> gs2 = new GenericStack<Integer>();
	gs2.push(36);
	System.out.println(gs2.pop());
  }
}
