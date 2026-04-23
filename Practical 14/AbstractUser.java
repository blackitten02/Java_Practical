abstract class AbstractUser {
    abstract void login();

    final void systemAccess() {
        System.out.println("Final Method: System Access Granted");
    }
}