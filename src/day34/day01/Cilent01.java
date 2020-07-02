package day34.day01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/*
客户类
 */
public class Cilent01 {
 public static void main(String[] args) {
  try {
   //1创建客户端对象，制定ip和端口
   //192.168.2.108    127.0.0.1    localhost
   Socket  socket=new Socket("localhost",8888);
   //2打开输出流   发数据
   OutputStream outputStream = socket.getOutputStream();
   //3准备发送的数据
   String   msg="你好，我是客户端。。";
   //4字符串转数组
   byte[] bytes = msg.getBytes();
   //5调用输出流的方法输出方法   发送数据
   outputStream.write(bytes);
   System.out.println("数据已发送。。。");
   //6刷新
   outputStream.flush();
   //7关闭资源
  /* outputStream.close();
   socket.close();*/
  } catch (IOException e) {
   e.printStackTrace();
  }
 }
}

