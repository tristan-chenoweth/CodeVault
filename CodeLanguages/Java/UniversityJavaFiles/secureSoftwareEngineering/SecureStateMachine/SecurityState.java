public interface SecurityState {
    public void LoggedOutState();
    public void LoggedInUserState();
    public void LoggedInSuperUserState();
    public void LoggedInAdminState();
}
