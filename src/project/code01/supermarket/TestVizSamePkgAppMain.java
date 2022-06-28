package project.code01.supermarket;

public class TestVizSamePkgAppMain {
    public static void main(String[] args) {
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
                "世纪大道1号", 500, 600, 100);

        Phone ph = (Phone) superMarket.getMerchandiseOf(10);
        System.out.println("手机的屏幕大小为："+ph.screenSize);
        System.out.println("手机的内存为："+ph.memoryG);

        ShellColorChangePhone scp = (ShellColorChangePhone) superMarket.getMerchandiseOf(100);
        System.out.println("渐变手机的屏幕大小为："+scp.screenSize);
        System.out.println("渐变手机的屏幕大小为："+scp.memoryG);
    }
}
