public class Main {
    public static void main(String[] args) {
        //Task 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Task 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Task 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Task 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Task 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //Task 6
        var boxerWeightFirst = 78.2;
        var boxerWeightSecond = 82.7;
        var boxerWeightTotal = boxerWeightFirst + boxerWeightSecond;
        System.out.println("Общая масса бойцов " + boxerWeightTotal + " кг.");
        var boxerWeightDiff = boxerWeightSecond - boxerWeightFirst;
        System.out.println("Разница между массами бойцов составляет " + boxerWeightDiff + " кг.");

        //Task 7
        var boxerWeightDiff2 = boxerWeightSecond % boxerWeightFirst;
        System.out.println(boxerWeightDiff2);

        //Task 8
        //8.1
        var workHoursTotal = 640;
        var workHours = 8;
        var workersNumber = workHoursTotal / workHours;
        System.out.println("Всего работников в компании — " + workersNumber + " человек");
        //8.2
        workersNumber = workersNumber + 94;
        workHoursTotal = workHours * workersNumber;
        System.out.println("Если в компании работает " + workersNumber + " человек, то всего " + workHoursTotal + " часов работы может быть поделено между сотрудниками");
    }
}