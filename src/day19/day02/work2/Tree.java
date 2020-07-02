package day19.day02.work2;

public class Tree {
    //树的名字
    String treeName;
    //树的高度
    double treeHeight;
    public   void printTree(){
        System.out.println(treeName+" "+treeHeight);
    }

    public Tree(String treeName) {
        this.treeName = treeName;
        System.out.println("这里是String类型的参数的构造方法");
    }

    public Tree(double treeHeight) {
        this("白杨");
        this.treeHeight = treeHeight;
        System.out.println("这里是double类型的参数的构造方法");
    }

    public Tree() {
        this(7.8d);
        System.out.println("无参数的构造方法");
    }
}
