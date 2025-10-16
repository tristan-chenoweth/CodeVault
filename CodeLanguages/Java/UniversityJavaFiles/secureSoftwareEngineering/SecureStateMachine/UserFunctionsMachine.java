public class UserFunctionsMachine {

    // State Creation

    UserState userState;

    UserState connectedState;
    UserState disconnectedState;

    // User Machine Creation

    public UserFunctionsMachine() {
        connectedState = new ConnectedState(this);
        disconnectedState = new DisconnectedState(this);

        if (userState == null) {
            userState = disconnectedState;
        }
    }

    // State Setters

    void setUserState(UserState userState) {
        this.userState = userState;
    }

    // State Getters

    public UserState getConnectedState() {
        return connectedState;
    }

    public UserState getDisconnectedState() {
        return disconnectedState;
    }

    // toString Method

    public String toString() {
        return "User State Machine";
    }
}