package project.code00;

import project.code00.supermarket.*;

public class TestBench {
    public static void main(String[] args) {
        Phone ph = new Phone(
                "手机001", "Phone001", 100, 1999, 999,
                4.5, 3.5, 4, 128, "索尼", "安卓"
        );

        MerchandiseV2 m = ph;
        MerchandiseV2 m2 = new Phone(
                "手机002", "Phone002", 100, 1999, 999,
                4.5, 3.5, 4, 128, "索尼", "安卓"
        );

        ph.getBrand();

        Phone aPhone = (Phone) m2;

        // MerchandiseV2是Phone的父类，Phone是shellColorChangePhone的父类
        ShellColorChangePhone shellColorChangePhone = new ShellColorChangePhone(
                "手机002", "Phone002", 100, 1999, 999,
                4.5, 3.5, 4, 128, "索尼", "安卓"
        );

        MerchandiseV2 ccm = shellColorChangePhone;

        Phone ccp = (Phone) ccm;

        ShellColorChangePhone scp = (ShellColorChangePhone) ccm;


    }
}
