public class SecureStateMachineTestPlay {
    public static void main (String [] args) {
        System.out.println("Secure State Machine test");
        SecureSystem secureSystem = new SecureSystem();

        secureSystem.loginPassword();
        secureSystem.op1();
        secureSystem.op2();
        secureSystem.op3();
        secureSystem.op4();

        secureSystem.superUserPassword();

        secureSystem.op1();
        secureSystem.op2();
        secureSystem.op3();
        secureSystem.op4();

        secureSystem.logout();

        secureSystem.adminUserPassword();
        secureSystem.op1();
        secureSystem.op2();
        secureSystem.op3();
        secureSystem.op4();

        secureSystem.logout();

        secureSystem.loginPassword();
        secureSystem.superUserPassword();
        secureSystem.op1();
        secureSystem.op2();
        secureSystem.op3();
        secureSystem.op4();

        secureSystem.logout();

        secureSystem.op1();
        secureSystem.op2();
        secureSystem.op3();
        secureSystem.op4();
    }
}