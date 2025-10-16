public class SecureSystem extends UserFunctionsMachine{

    // State Creation

    SecurityState securityState;

    SecurityState LoggedOutState;
    SecurityState LoggedInUserState;
    SecurityState LoggedInSuperUserState;
    SecurityState LoggedInAdminState;

    UserState userState;

    UserState connectedState;
    UserState disconnectedState;

    // Secure Machine Creation

    UserFunctionsMachine machine = new UserFunctionsMachine();

    public SecureSystem() {
        LoggedOutState = new LoggedOutState(this, machine);
        LoggedInUserState = new LoggedInUserState(this, machine);
        LoggedInSuperUserState = new LoggedInSuperUserState(this, machine);
        LoggedInAdminState = new LoggedInAdminState(this, machine);

        connectedState = new ConnectedState(machine);
        disconnectedState = new DisconnectedState(machine);

        if (securityState == null && userState == null) {
            securityState = LoggedOutState;
            userState = connectedState;
        }
    }

    // State Setters

    void setSecurityState(SecurityState securityState) {
        this.securityState = securityState;
    }

    // State Getters

    public SecurityState getLoggedOutState() {
        return LoggedOutState;
    }

    public SecurityState getLoggedInUserState() {
        return LoggedInUserState;
    }

    public SecurityState getLoggedInSuperUserState() {
        return LoggedInSuperUserState;
    }

    public SecurityState getLoggedInAdminState() {
        return LoggedInAdminState;
    }

    // Commands from user

    public void loginPassword() {
        if (securityState != LoggedInAdminState) {
            setSecurityState(getLoggedInUserState());
            userState = connectedState;
            System.out.println("User Logged In.");
        }

        else {
            System.out.println("Admin Currently logged in.");
        }
    }

    public void superUserPassword() {
        if (securityState != LoggedInAdminState && securityState == LoggedInUserState) {
            setSecurityState(getLoggedInSuperUserState());
            userState = connectedState;
            System.out.println("SuperUser Logged In.");
        }
        else {
            System.out.println("Another user is currently logged in.");
        }
    }

    public void adminUserPassword() {
        if (securityState != LoggedInUserState && securityState != LoggedInSuperUserState && securityState == LoggedOutState){
            setSecurityState(getLoggedInSuperUserState());
            userState = connectedState;
            System.out.println("Admin User Logged In.");
        }
        else {
            System.out.println("Another user is logged in.");
        }
    }

    public void logout() {
        setSecurityState(LoggedOutState);
        userState = disconnectedState;
        System.out.println("Logged Out.");
    }

    // commands for user

    public void op1() {
        System.out.println("Option 1 has been selected.");
    }

    public void op2() {
        System.out.println("Option 2 has been selected.");
    }

    public void op3() {
        if (userState == connectedState) {
            System.out.println("Option 3 has been selected.");
        }

        else {
            System.out.println("Required privileges are not correct");
        }
    }

    public void op4() {
        if (userState == connectedState) {
            System.out.println("Option 4 has been selected.");
        }

        else {
            System.out.println("Required privileges are not correct");
        }
    }

    // toString Method

    public String toString() {
        return "Secure State Machine";
    }
}