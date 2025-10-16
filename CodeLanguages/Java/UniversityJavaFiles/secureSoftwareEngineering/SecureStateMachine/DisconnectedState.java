public class DisconnectedState  implements UserState {
    UserFunctionsMachine machine;

    public DisconnectedState(UserFunctionsMachine userMachine) {
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
        return "Disconnected State";
    }
}
