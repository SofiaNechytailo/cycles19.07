public class Main {
    public static void main(String[] args) {
        System.out.println("task 1");
        for (int i = 0; i < 10; i++) {
            System.out.println(i); }
        //Створити програму для виведення чисел від 1 до 10
        System.out.println("task 2");
            boolean isTrue =true;
            int j =2;
            while (isTrue) {
                System.out.println(j);
                j+= 2;
                if (j >100)
                isTrue = false;
                //Показати всі парні числа в діапазоні від 1 до 100

            }
        System.out.println("task 3");
            int n = 1;
            for (int i = 1; i < 8; i++) {
                n *= i;
                //Знайти факторіал числа 7
            }
            System.out.println(n);
        System.out.println("task 4");
        int f = 0;
        int s = 1;
        System.out.println(f);
        for (int i =1; i <100;) {
            System.out.println(s);
            f =i;
            i =s+f;
            s =f;
            //Вивести числа фібоначчі до 100 (значення самого числа не повинно перевищувати 100)



        }

        }
        }

