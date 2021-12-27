package com.pb.popov.hw14;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Server {
    static class Echo implements Runnable {
        private final Socket clientSocket;

        Echo(Socket clientSocket) {
            this.clientSocket = clientSocket;
        }


        @Override
        public void run() {
            //System.out.println("Старт сервера");
            BufferedReader in = null;
            PrintWriter out = null;
            ServerSocket server = null;
            try {
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                out = new PrintWriter(clientSocket.getOutputStream(), true);
            } catch (IOException e) {
                e.printStackTrace();
            }
            String clientMessage = null;
            //System.out.println("Ожидаем сообщений");
            while (true) {
                try {
                    if (!((clientMessage = in.readLine()) != null)) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if ("exit".equalsIgnoreCase(clientMessage)) {
                    break;
                }
                out.println("Сервер: " + clientMessage + " | " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
                System.out.println(clientMessage);
            }
            out.close();
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        int port = 1234;
         ServerSocket server = new ServerSocket(port);
        System.out.println("Старт сервера");
        System.out.println("Ожидаем соединений");
        ExecutorService threadPool = Executors.newFixedThreadPool(10);
        while (true){
            Socket clientSocket = server.accept();
            threadPool.submit(new Echo(clientSocket));
            System.out.println("Присоединился новый пользователь!");
        }
    }
}
