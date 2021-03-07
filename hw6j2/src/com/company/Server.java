package com.company;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        Socket clientSocket = null;
        Scanner sc = new Scanner(System.in);
        try (ServerSocket serverSocket = new ServerSocket(5353)){
            System.out.println("Server started");
            clientSocket = serverSocket.accept();
            System.out.println("Client connected");
            DataInputStream in = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
            Thread thread2 = new Thread(() -> {
                try {
                    while (true) {
                        out.writeUTF(sc.nextLine());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            thread2.setDaemon(true);
            thread2.start();
            while (true) {
                String str = in.readUTF();
                if (str.equals("/end")) {
                    System.out.println("Client disconnected");
                    out.writeUTF("/end");
                    break;
                } else System.out.println("Client: " + str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                clientSocket.close();
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }
        }
    }
}
