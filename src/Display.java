//时钟变化
public class Display {
    private int value = 0;

    private int limit = 0;

    public void increase() {
        value++;
        if(value == limit){
            value = 0;
        }
    }

    public int getValue() {
        return value;
    }

    public Display(int limit){
        this.limit = limit;
    }
    public static void main(String[] args) {
        Display d = new Display(24);
        for(;;){
            d.increase();
            System.out.println(d.getValue());
        }
    }
}
