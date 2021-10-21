package Day07;

/**
 * @author FF
 * @date 2021/9/7
 * @TIME:10:07
 */
public class Demo01 {
   private String name;
    private String sex;



    public Demo01(String name,String sex){
        System.out.println(name+" "+sex);
    }

    public Demo01(){

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSex(String sex){
        this.sex = sex;
    }

    public String getSex(){
        return sex;
    }
      public void eat(){
        System.out.println(name+"吃"+sex);
    }
}
