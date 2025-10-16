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
        state.reviewingState();
        System.out.println("test written now in " + state);
    }

    public void rejected() {
        state.writingState();
        System.out.println("test rejected now in " + state);
    }

    public void accepted() {
        state.publishedState();
        System.out.println("test accepted now in " + state);
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