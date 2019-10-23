/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class Validator {

    public static boolean isEmpty(String text) {
        return text.trim().length() == 0;
    }

    public static boolean validateNumber(JTextComponent component) {
        if (component != null) {
            component.setBackground(Color.white);
            if (!component.getText().matches("[\\d\\.]+")) {
                component.setBackground(new Color(250, 255, 168));
                component.requestFocus();
                return false;
            }
            component.setBackground(new Color(255, 255, 255));
        }
        return true;
    }

    public static boolean validateComponents(ArrayList<JTextComponent> components) {
        if (components != null) {
            for (JTextComponent component : components) {
                component.setBackground(Color.white);
                if (isEmpty(component.getText())) {
                    Message.error("Không được để trống");
                    component.setBackground(new Color(250, 255, 168));
                    component.requestFocus();
                    return false;
                }
                component.setBackground(new Color(255, 255, 255));
            }
        }
        return true;
    }

    public static void setBlankFields(JTextComponent[] tcps) {
        for (JTextComponent tcp : tcps) {
            tcp.setText("");
        }
    }

    public static boolean validatePhone(JTextField txtPhone) {
        if (!txtPhone.getText().matches("[\\d]{10,13}")) {
            Message.error("Số điện thoại không hợp lệ!");
            txtPhone.setBackground(new Color(250, 255, 168));
            txtPhone.requestFocus();
            return false;
        }
        txtPhone.setBackground(new Color(255, 255, 255));
        return true;
    }

    public static boolean validateEmail(JTextField txtEmail) {
        if (!txtEmail.getText().matches("^(([\\-\\w]+)\\.?)+@(([\\-\\w]+)\\.?)+\\.[a-zA-Z]{2,4}$")) {
            Message.error("Email không hợp lệ");
            txtEmail.setBackground(new Color(250, 255, 168));
            txtEmail.requestFocus();
            return false;
        }
        return true;
    }

    public static boolean validateUsername(JTextField txtUsername) {
        if (!txtUsername.getText().matches("^[a-zA-Z0-9._-]{3,}$")) {
            Message.error("Username phải có ít nhất 3 ký tự, gồm a-z, A-Z, 0-9, ");
            txtUsername.setBackground(new Color(250, 255, 168));
            txtUsername.requestFocus();
            return false;
        }
        return true;
    }

    public static boolean validatePassword(JPasswordField txtPassword, JPasswordField txtPassword2) {
        String password = new String(txtPassword.getPassword());
        String password2 = new String(txtPassword2.getPassword());
        if (!password.matches("^(?i)(?=.*[a-z])(?=.*[0-9])[a-z0-9#.!@$*&_]{6,20}$")) {
            Message.error("Password phải từ 6-20 ký tự, chứa ít nhất một chữ số,"
                    + "một ký tự in hoa, 1 ký tự in thường và ký tự đặc biệt");
            txtPassword.setBackground(new Color(250, 255, 168));
            txtPassword.requestFocus();
            return false;
        } else {
            if (!password.equals(password2)) {
                Message.error("Password không trùng khớp");
                return false;
            }
        }
        return true;
    }

    public static boolean validateFloatField(JTextField txtNumber) {
        if (!txtNumber.getText().matches("[\\d]{1,3}(\\.[\\d]{1,5})?")) {
            Message.error("Chỉ được nhập số thực");
            txtNumber.setBackground(new Color(250, 255, 168));
            txtNumber.requestFocus();
            return false;
        }
        txtNumber.setBackground(new Color(255, 255, 255));
        return true;
    }
}
