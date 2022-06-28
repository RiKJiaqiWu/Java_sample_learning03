package project.code02;

import project.code02.supermarket.*;

import java.util.Date;

public class UseInterface {
    public static void main(String[] args) {
        Date produceDate = new Date();
        Date expireDate = new Date(produceDate.getTime() + 365L * 24 * 3600 * 1000);
        GamePointCard gamePointCard = new GamePointCard(
                "手机001", "Phone001", 100, 1999, 999,
                produceDate, expireDate
        );

        ExpireDateMerchandise expireDateMerchandise = gamePointCard;

        VirtualMerchandise virtual = gamePointCard;

        MerchandiseV2 m = gamePointCard;

        expireDateMerchandise = (ExpireDateMerchandise) m;

        virtual = (VirtualMerchandise) m;

        if (m instanceof ExpireDateMerchandise) {
            System.out.println("m 是 ExpireDateMerchandise 类型的实例");
        }

        if (m instanceof VirtualMerchandise) {
            System.out.println("m 是 VirtualMerchandise 类型的实例");
        }
    }
}
