package com.eastnorth.springinaction.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author zuojianhou
 * @Date: 2020/4/27
 * @Description:
 */
public class SocketTest {
    public static void main(String[] args) throws IOException {
        write();
        //建立对服务器的socket连接
        Socket chatSocket = new Socket("127.0.0.1", 5000);
        //从socket取得输入串流
        InputStreamReader inputStreamReader = new InputStreamReader(chatSocket.getInputStream());
        //建立BufferedReader来读取
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String message = reader.readLine();
        System.out.println(message);
    }

    private static void write() throws IOException {
        //建立对服务器的socket连接
        Socket chatSocket = new Socket("127.0.0.1", 5000);
        //建立链接到socket的printWriter
        PrintWriter writer = new PrintWriter(chatSocket.getOutputStream());
        writer.println("message to send");
        writer.print("another message");
    }
}
