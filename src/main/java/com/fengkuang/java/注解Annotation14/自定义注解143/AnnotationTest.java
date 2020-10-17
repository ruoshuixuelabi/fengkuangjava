package com.fengkuang.java.注解Annotation14.自定义注解143;
import java.awt.event.*;
import javax.swing.*;
public class AnnotationTest {
    private JFrame mainWin = new JFrame("使用注解绑定事件监听器");
    // 使用@ActionListenerFor注解为ok按钮绑定事件监听器
    @ActionListenerFor(listener = OkListener.class)
    private JButton ok = new JButton("确定");
    // 使用@ActionListenerFor注解为cancel按钮绑定事件监听器
    @ActionListenerFor(listener = CancelListener.class)
    private JButton cancel = new JButton("取消");
    public void init() {
        // 初始化界面的方法
        var jp = new JPanel();
        jp.add(ok);
        jp.add(cancel);
        mainWin.add(jp);
        ActionListenerInstaller.processAnnotations(this);     // ①
        mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWin.pack();
        mainWin.setVisible(true);
    }

    public static void main(String[] args) {
        new AnnotationTest().init();
    }
}

// 定义ok按钮的事件监听器实现类
class OkListener implements ActionListener {
    public void actionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog(null, "单击了确认按钮");
    }
}

// 定义cancel按钮的事件监听器实现类
class CancelListener implements ActionListener {
    public void actionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog(null, "单击了取消按钮");
    }
}