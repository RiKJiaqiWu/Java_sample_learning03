package project.code02.supermarket;

public enum Category {
    Food(1),
    Fresh(2),
    CookingItem(3),
    Clothes(4),
    DailySupplies(5),
    ElectronicEquipment(6),
    Phone(7);

    // 可以有属性
    private int id;

    Category(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                '}';
    }
}
