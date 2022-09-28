package cz.pavelka.enumstatemachine;

public class Main {
	public static void main(String[] args) {
		User u = new User("User 1");
		System.out.println(u);
		u.state = u.state.logIn();
		System.out.println(u);
	}
}
