package DAY24.EnumDemo.Demo01;

/**
 * @author FF
 * @date 2021/10/14
 * @TIME:10:25
 */
public enum Seasong {
    SPRING("春"){
        private void show(){
            this.show();
        }
    },SUMMER("夏"){

    },AUTUMN("秋"){

    },WINTER("冬"){

    };

    Seasong() {

    }
        Seasong(String name) {
        this.name = name;
    }

    public String name;
    private void show(){
        System.out.println(this.name);

    }
}
