public class WritingMachineTestPlay {
    public static void main (String [] args) {
        System.out.println("test");

        WritingMachine machine = new WritingMachine();

                System.out.println(machine);

                machine.written();
                machine.rejected();
                machine.accepted();
    }
}