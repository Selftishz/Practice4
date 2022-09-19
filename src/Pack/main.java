package Pack;

public class main {

    public static void main(String[] args) {
        WSSA favor = WSSA.spring;

        best(favor);

        for (WSSA one_time : WSSA.values()) {
            System.out.println(one_time + " " + one_time.Description + " " + one_time.temp);
        }
    }
    public static void best(WSSA time)
    {
        switch (time)
        {
            case winter:
                System.out.println("Я люблю зиму");
                break;
            case spring:
                System.out.println("Я люблю весну");
                break;
            case summer:
                System.out.println("Я люблю лето");
                break;
            case autumn:
                System.out.println("Я люблю осень");
        }
    }

    public enum WSSA {
        winter(-3,"Холодное время года"),
        spring(9, "Не такая теплая, как лето, но и не холодная, как зима"),
        summer(19,"Теплое время года"),
        autumn(12,"Переходное время года");
        private int temp;
        private String Description;
        WSSA(int temp, String Description){
            this.temp = temp;
            this.Description = Description;
        }

        public String getDescription() { return Description;}
    }


}
