public class Main {
    public static void main(String[] args) {
        AutomaticHotDrinks automaticHotDrinks = new AutomaticHotDrinks();
        automaticHotDrinks.addProduct(1, new HotDrink("Чай", 12345, 49, 20, 1, 50));
        automaticHotDrinks.addProduct(2, new HotDrink("Кофе", 11111, 299, 1, 1, 40));
        automaticHotDrinks.addProduct(3, new HotDrink("Late", 22222, 99, 10, 1, 60));
        automaticHotDrinks.addProduct(4, new HotDrink("Мокачино", 15643, 150, 5, 1, 40));

        System.out.format("Выберите товар: 1 = %s, 2 = %s, 3 = %s, 4 = %s или 5 по названию, обьему и температуре \n",
                automaticHotDrinks.showName(1),
                automaticHotDrinks.showName(2), automaticHotDrinks.showName(3), automaticHotDrinks.showName(4));

        int number = automaticHotDrinks.enterNumber();
        HotDrink goods = automaticHotDrinks.showGoods(number);
        automaticHotDrinks.goodsBuy(goods);

    }
}