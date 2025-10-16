public class writingState implements State {
    WritingMachine machine;

    public writingState(WritingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void writingState() {
        machine.setState(machine.getWritingState());
    }

    @Override
    public void reviewingState() {
        machine.setState(machine.getReviewingState());
    }

    @Override
    public void publishedState() {
        machine.setState(machine.getPublishedState());
    }

    @Override
    public String toString() {
        return "Writing State";
    }
}
