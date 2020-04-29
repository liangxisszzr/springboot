package com.eastnorth.springinaction.service;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author zuojianhou
 * @Date: 2020/4/28
 * @Description:
 */
public class SimpleChatClientA {

    JTextField outgoing;
    PrintWriter writer;
    Socket socket;

    public void go() {
        // 注册按钮的监听者
        JFrame frame = new JFrame("simple chat client");
        JPanel mainPanel = new JPanel();
        outgoing = new JTextField(20);
        JButton sendButton = new JButton("send");
        sendButton.addActionListener(new SendButtonListener());
        mainPanel.add(outgoing);
        mainPanel.add(sendButton);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        // 调用setUpNetworking
        setUpNetworking();
        frame.setSize(400, 500);
        frame.setVisible(true);
    }

    private void setUpNetworking() {
        // 建立Socket、PrintWriter
        try {
            socket = new Socket("127.0.0.1", 5000);
            writer = new PrintWriter(socket.getOutputStream());
            System.out.println("networking established");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 赋值PrintWriter给实例变量
    }

    public class SendButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // 取得文字字段内容
            writer.println(outgoing.getText());
            writer.flush();
            // 传送到服务器上
            outgoing.setText("");
            outgoing.requestFocus();
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new SimpleChatClientA().go();
    }
}
