
package dutycalls;
public class DutyCalls {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            LoginPage login = new LoginPage();
            login.setVisible(true);
        });
    }
}
