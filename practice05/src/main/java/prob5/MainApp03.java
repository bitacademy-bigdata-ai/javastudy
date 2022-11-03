package prob5;

public class MainApp03 {

	public static void main(String[] args) {
		try {
			MyStack03<String> stack = new MyStack02(3);
			stack.push("Hello");
			stack.push("World");
			stack.push("!!!");
			stack.push("java");

			while (stack.isEmpty() == false) {
				String s = stack.pop();
				System.out.println(s);
			}

			System.out.println("======================================");

			stack = new MyStack02(3);
			stack.push("Hello");

			System.out.println(stack.pop());
			System.out.println(stack.pop());

		} catch (MyStackException ex) {
			System.out.println(ex);
		}
	}
}
