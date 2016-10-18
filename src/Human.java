/**
 * Created by Zou on 2016/10/18.
 */
public class Human {
    String name;
    int age;
    String sex;

    public Human() {
    }

    public Human(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void introduce(){
        System.out.println("姓名:"+name+"\n性别:"+sex+"\n年龄:"+age+"\n");
    }
}
