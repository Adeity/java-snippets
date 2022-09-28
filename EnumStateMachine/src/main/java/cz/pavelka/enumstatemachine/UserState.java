package cz.pavelka.enumstatemachine;

public enum UserState {
	LOGGED_IN("Logged in") {
		@Override public UserState logIn() {
			return this;
		}
		@Override public UserState logOut() {
			return UserState.LOGGED_OUT;
		}
	},
	LOGGED_OUT("Logged out") {
		@Override public UserState logIn() {
			return UserState.LOGGED_IN;
		}
		@Override public UserState logOut() {
			return this;
		}
	};

	public final String name;

	private UserState(String name) {
		this.name = name;
	}

	public abstract UserState logIn();

	public abstract UserState logOut();

}
