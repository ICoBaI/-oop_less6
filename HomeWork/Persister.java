public class Persister implements IUserProcessor{
	private User user;
	
	public Persister(User user){
		this.user = user;
	}

	@Override
	public void save(User user) {
		System.out.println("Save user: " + user.getName());
	}

	@Override
	public void report(User user) {
		System.out.println("Report for user: " + user.getName());
	}
}