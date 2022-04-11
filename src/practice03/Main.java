package practice03;
import java.util.Calendar;
public class Main {
    public static void main(String[] args){

        //---Задача 3.1 (Java Is)---//
        String course = "Изучение Java это просто";
        Study study = new Study(course);
        System.out.println(study.printCourse());


        //---Задача 3.2 (А-А-А-А-АФТОМОБИ-И-И-ИЛЬ!!!)---//
        Car car1 = new Car("White", "Lada", 1500);

        String fullInfo = car1.showfullInfo();
        System.out.println(fullInfo);

        String partialInfoCW = car1.result("Red", 1000);
        System.out.println(partialInfoCW);

        String partialInfoC = car1.result("White");
        System.out.println(partialInfoC);


        //---Задача 3.3 (Дом)---//
        House house = new House();

        //Добавление календаря
        Calendar currentDate2 = Calendar.getInstance();
        int years = currentDate2.get(Calendar.YEAR);

        //Вызов методов
        house.setAllParameters();
        house.showAllParameters();
        System.out.println("Возраст дома " + house.houseAgeCount(house.constructionDate, years));


        //---Задача 3.4 (Здравствуй дерево)---//
        int a = 10;
        boolean i = true;
        String n = "Карагач";
        Tree tree1 = new Tree(); // Без параметров
        Tree tree2 = new Tree(a, n); // 2 параметра
        Tree tree3 = new Tree(a, i, n); // 3 параметра
    }
}
