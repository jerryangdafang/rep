package day30.day01;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class DemoFile {
    public static void main(String[] args) throws IOException {
        /*路径：
        * 1相对路径
        *    src/day30/day01
        * 2绝对路径
        * D:\20191030\20200511\code\javaSE\src\day30\day01
        *
        * */
        File  file=new File("src/day30/day01");
        //测试应用程序是否可以执行此抽象路径名表示的文件。
        boolean b = file.canExecute();
        System.out.println("是否存在："+b);
        //测试应用程序是否可以读取此抽象路径名表示的文件。
        boolean b1 = file.canRead();
        System.out.println("是否可读："+b1);
//      测试应用程序是否可以修改此抽象路径名表示的文
        boolean b2 = file.canWrite();
        System.out.println("是否可写："+b2);
        //当且仅当不存在具有此抽象路径名指定名称的文件时，不可分地创建一个新的空文件。
        File  file2=new File("src/day30/day01/stu1.txt");
        boolean newFile = file2.createNewFile();
        System.out.println("是否创建成功："+newFile);
        // 删除此抽象路径名表示的文件或目录。
      ///  boolean delete = file2.delete();
       // System.out.println("是否删除成功："+delete);
        //测试此抽象路径名表示的文件或目录是否存在。
        boolean exists = file2.exists();
        System.out.println(exists);
        //  返回此抽象路径名的绝对路径名形式。
        File absoluteFile = file2.getAbsoluteFile();
        System.out.println(absoluteFile);
        //返回此抽象路径名的绝对路径名字符串。
        String absolutePath = file2.getAbsolutePath();
        System.out.println(absolutePath);
        // 返回此抽象路径名的规范形式
        File canonicalFile = file2.getCanonicalFile();
        System.out.println(canonicalFile);
        //
        String canonicalPath = file2.getCanonicalPath();
        System.out.println(canonicalPath);
        //返回由此抽象路径名表示的文件或目录的名称。
        System.out.println(file2.getName());
//返回此抽象路径名父目录的路径名字符串；如果此路径名没有指定父目录，则返回 null。
        String parent = file2.getParent();
        System.out.println(parent);
        // 返回此抽象路径名父目录的抽象路径名；如果此路径名没有指定父目录，则返回 null。
        File parentFile = file2.getParentFile();
        System.out.println(parentFile);
        //测试此抽象路径名是否为绝对路径名。
        boolean absolute = file.isAbsolute();
        System.out.println(absolute);
        //测试此抽象路径名表示的文件是否是一个目录。
        boolean directory = file2.isDirectory();
        System.out.println(directory);
        // 测试此抽象路径名表示的文件是否是一个标准文件
        boolean file1 = file2.isFile();
        System.out.println(file1);
        //测试此抽象路径名指定的文件是否是一个隐藏文件。
        boolean hidden = file2.isHidden();
        System.out.println(hidden);
        //返回此抽象路径名表示的文件最后一次被修改的时间
        long l = file2.lastModified();
        Date  date=new Date();
        date.setTime(l);
        System.out.println(date);

        File  file3=new File("src/day30/day01/stu.txt");
        //返回由此抽象路径名表示的文件的长度。
        long length = file3.length();
        System.out.println(length);
        File  file4=new File("src/day31/a/b");
      /*  boolean mkdir = file4.mkdir();
        System.out.println(mkdir);*/
        boolean mkdirs = file4.mkdirs();
        System.out.println(mkdirs);
        file4.renameTo(new File("src/day31/a/c"));//主要是文件不是目录


    }
}
