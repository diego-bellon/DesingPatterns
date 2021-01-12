public class UserPersistenceService {

    Store store = new Store();

    public void saveUser(User user){
        store.store(user);
    }
	
}
