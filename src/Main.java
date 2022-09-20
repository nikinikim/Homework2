public class Main {
    public static void main(String[] args) {
        // exercises 1-3
        double dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // exercises 4-5
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // exercise 6 - 7
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        var weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Общий вес двух бойцов = " + totalWeight + " кг");
        System.out.println("Разница в весе = " + weightDifference + " кг");
        var weightDifference2 = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница в весе 2 = " + weightDifference2 + " кг");
        // exercise 8
        var totalTime = 640;
        var employeesTime = 8;
        var numberOfEmployees = totalTime / employeesTime;
        System.out.println("Всего работников в компании - " + numberOfEmployees + " человек");
        numberOfEmployees = numberOfEmployees + 94;
        var newTime = totalTime / numberOfEmployees;
        System.out.print("Если в компании работает " + numberOfEmployees + " человек(а)," + " то всего " + newTime);
        System.out.println(" часов работы может быть поделено между сотрудниками");







    }


}