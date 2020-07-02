package day34.day01;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
服务器类
 */
public class Server01 {
 public static void main(String[] args) {
  System.out.println("服务器已启动。。。。");
  try {
   //1 创建ServerSocket对象  指定端口为：
   ServerSocket   serverSocket=new ServerSocket(8888);
   //2监听客户端，侦听
   Socket accept = serverSocket.accept();
   //3打开输入流，处理请求
   InputStream inputStream = accept.getInputStream();
   //4创建数组存储客户端发来的数据
   byte   bs[]=new byte[1024];
   //5对于输入流方法读取客户端发来的数据
   inputStream.read(bs);
   //6将数组转字符串
   String  msg=new String(bs);
   System.out.println("来自客户端的信息： "+msg);
   //7关闭资源
  /*  inputStream.close();
   accept.close();
   serverSocket.close();*/

  } catch (IOException e) {
   e.printStackTrace();
  }

 }
}
