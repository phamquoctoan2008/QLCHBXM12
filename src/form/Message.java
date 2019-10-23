package form;

import javax.swing.JOptionPane;

public class Message {

    public static void error(String message) {
        JOptionPane.showMessageDialog(null, message, "Lỗi!", JOptionPane.ERROR_MESSAGE);
    }

    public static void infor(String message) {
        JOptionPane.showMessageDialog(null, message, "Thông tin!", JOptionPane.INFORMATION_MESSAGE);
    }

    public static boolean confirm(String message) {
        int i = JOptionPane.showConfirmDialog(null, message, "Xác nhận", JOptionPane.YES_NO_OPTION);
        return i == JOptionPane.YES_OPTION;
    }
}
