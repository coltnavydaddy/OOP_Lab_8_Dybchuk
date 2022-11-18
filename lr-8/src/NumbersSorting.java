import java.util.*;

public class NumbersSorting {
    public static List<Integer> NumberList = new ArrayList<>();

    // додаємо рандомом інтові числа у діапазоні від -1000 до 1000 до нашого списку;
    public static void OurList() {

        Random random = new Random();

        for(int i = 0; i < 100; i++)
        {
            int Num = random.nextInt(-1000,1000);
            NumberList.add(Num);
        }
    }

    // виводимо всі елементи;
    public static void SeeList()
    {System.out.print('\n');
        for (Integer number : NumberList)
        {
            System.out.print(number + " ");
        }
    }

    public static void main(String[] args)
    {
        OurList();
        System.out.println("Наш список та вихідний список: ");
        SeeList();
        System.out.println('\n');
        int results = 0;
        int k = 0;

        while( k < NumberList.size() - results)
        {
            if (NumberList.get(k) < 0)
            {
                NumberList.add(NumberList.get(k) );
                NumberList.remove(NumberList.get(k) );
                results++;
            }
            else
                k++;
        }

        SeeList();
    }
}