package CTDL;

import java.io.IOException;
import java.util.*;

public class ReverseStack {
	private String input; 
	private String output;
	public ReverseStack(String in) {
		input = in;
	}
	
	public String Reverse() {
		int size = input.length();
		Stack st = new Stack(size);
		for(int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			st.push(ch);
		}
		output = "";
		if(!st.isEmpty()) {
			char ch = st.pop();
			output = output + ch;
		}
		return output;
	}
	
	class Stack {
	      private int maxSize;
	      private char[] stackArray;
	      private int top;
	      public Stack(int max) {
	         maxSize = max;
	         stackArray = new char[maxSize];
	         top = -1;
	      }
	      public void push(char j) {
	         stackArray[++top] = j;
	      }
	      public char pop() {
	         return stackArray[top--];
	      }
	      public char peek() {
	         return stackArray[top];
	      }
	      public boolean isEmpty() {
	         return (top == -1);
	      }
	   }

	public static void main(String[] args) throws IOException {
		      String input = "Java Source and Support";
		      String output;
		      ReverseStack rst = new ReverseStack(input);
		      output = rst.Reverse();
		      System.out.println("Reversed: " + output);
	}

}
