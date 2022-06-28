package project.code00;
import project.code00.supermarket.LittleSuperMarket;
import project.code00.supermarket.MerchandiseV2;

public class TestBench01 {
    public static void main(String[] args) {
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
                "世纪大道1号", 500, 600, 100);

        MerchandiseV2 m0 = superMarket.getMerchandiseOf(0);
        m0.describe();
        System.out.println();
        MerchandiseV2 m100 = superMarket.getMerchandiseOf(100);
        m100.describe();
        System.out.println();
        MerchandiseV2 m10 = superMarket.getMerchandiseOf(10);
        m10.describe();


    }
}
