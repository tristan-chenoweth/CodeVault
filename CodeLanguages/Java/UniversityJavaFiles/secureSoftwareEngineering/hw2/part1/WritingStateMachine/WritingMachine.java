public class WritingMachine {
    State writingState;
    State reviewingState;
    State publishedState;

    State state;

    public WritingMachine () {
        writingState = new writingState(this);
        reviewingState = new reviewingState(this);
        publishedState = new publishedState(this);

        if (state == null) {
            state = writingState;
        }
    }

    public void written() {
        System.out.println("test written");
        state.reviewingState();
        state.toString();
    }

    public void rejected() {
        System.out.println("test rejected");
        state.writingState();
        state.toString();
    }

    public void accepted() {
        System.out.println("test accepted");
        state.publishedState();
        state.toString();
    }

    void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public State getWritingState() {
        return writingState;
    }

    public State getReviewingState() {
        return reviewingState;
    }

    public State getPublishedState() {
        return publishedState;
    }

    public String toString() {
        return "WritingMachine";
    }
}