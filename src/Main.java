public class Main {
    public static void main(String[] args) {

        System.out.println();
        var dog = 8.0;
        System.out.println(dog);

        System.out.println();
        var cat = 3.6;
        System.out.println(cat);

        System.out.println();
        var peper = 763789;
        System.out.println(peper);

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        peper = peper + 4;
        System.out.println(peper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        peper = peper - 7639;
        System.out.println(peper);

        System.out.println();
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 2;
        System.out.println(friend);

        System.out.println();
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println();
        var oneBoxerWheight = 78.2;
        var twoBoxerWheight = 82.7;
        var result = oneBoxerWheight + twoBoxerWheight;
        System.out.println(result);

        System.out.println();
        System.out.println("Разница между весами" + result);

        System.out.println();
        var resultDyf = twoBoxerWheight % oneBoxerWheight;
        System.out.println("Остаток от деления" + result);

        System.out.println();
        var x = 640;
        var y = 8;
        var result1 = x / y;
        System.out.println("Всего работников в компании" + result);

        System.out.println();
        var x1 = 80 + 94;
        var y2 = 640;
        var result2 = y / x;
        System.out.println("Если в компании работает" + x + "человек, то всего" + result + "часов работы может быть поделено между сотрудниками");
    }
}