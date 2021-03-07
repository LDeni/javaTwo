package com.company;



import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static final String SERVER_ADDR = "localhost";
    public static final int SERVER_PORT = 5353;


    public static void main(String[] args) {
        Socket socket = null;
        Scanner sc = new Scanner(System.in);
        try {
            socket = new Socket(SERVER_ADDR, SERVER_PORT);
            System.out.println("Client connected");
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            Thread thread1 = new Thread(() -> {
                try {
                    while (true) {
                        out.writeUTF(sc.nextLine());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            thread1.setDaemon(true);
            thread1.start();
            while (true) {
                String str = in.readUTF();
                if (str.equals("/end")) {
                    System.out.println("Connection failed");
                    out.writeUTF("/end");
                    break;
                } else System.out.println("Server: " + str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }
        }
    }

}

