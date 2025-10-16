public class ConnectedState implements UserState {
    UserFunctionsMachine machine;

    public ConnectedState(UserFunctionsMachine userMachine) {
        this.machine = userMachine;
    }

    @Override
    public void DisconnectedState() {
        machine.setUserState(machine.getDisconnectedState());
    }

    @Override
    public void ConnectedState() {
        machine.setUserState(machine.getConnectedState());
    }

    @Override
    public String toString() {
        return "Connected State";
    }
}
