package day23.day01;

public class Student {
    private   int age;
    private  String  name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
    重写equal目的是w为了可以比较内容


     */
    @Override
    public boolean equals(Object obj) {
        if (this==obj){
            System.out.println("这里比较内存对象");
            return  true;
        }

        if (obj  instanceof   Student){
            Student student= (Student) obj;
            /*   if (student.getAge()==this.age){
                   System.out.println("");
                   System.out.println("这里是比较年龄");
                   return true;
               }*/

            if (student.getName().equals(this.name)){
                System.out.println("这里是比较姓名");
                return   true;
            }
        }
        return false;
    }
    /*
       重写tostring目的是为了显示我们自己想要的效果


        */
    @Override
    public String toString() {
        return "年龄: " + age +", 姓名： " + name ;
    }
}
