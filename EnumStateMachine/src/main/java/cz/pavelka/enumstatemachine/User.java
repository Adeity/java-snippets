package cz.pavelka.enumstatemachine;

import java.util.Objects;

public class User {
	public String name;
	public UserState state = UserState.LOGGED_OUT;

	public User(String name) {
		this.name = name;
	}

	@Override public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", state=" + state.name +
				'}';
	}

	@Override public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		User user = (User) o;
		return Objects.equals(name, user.name) && state == user.state;
	}

	@Override public int hashCode() {
		return Objects.hash(name, state);
	}
}
