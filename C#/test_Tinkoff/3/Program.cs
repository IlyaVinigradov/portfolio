﻿Console.WriteLine("Один из ваших знакомых стал стажером-аналитиком в команде Тинькофф. У него есть данные за п дней о том, как клиенты подключают и отменяют подписки на один из сервисов. По странному стечению обстоятельств дни чередуются: в первый день подписки только подключались, во второй только отменялись и т.Д., т.е. каждый день число приобретенных подписок составляет (- 1)^(i-1)ai, где а, - число подключенных или отключечных подписок за 2-й день. Во время анализа данных ваш знакомый задался вопросом, увеличилась бы прибыль компании, если бы данные за какие-то дни поменялись местами. В качестве первого этапа он решил поменять местами не более двух дней. Проверьте, сможете ли вы стать стажером-аналитиком в Тинькофф. Для этого предлагаем вам посчитать максимально возможное значение прибыли, которую можно получить, поменяв местами данные за не более, чем два дня. Стоимость одной подписки можно считать равной 1.");
Console.WriteLine("входные данные: \nВ первой строке задано одно натуральное число n (2 <= n <= 100000) - число дней, данные за которые у вас есть. Во второй строке заданы n чисел аі - количество подключенных/отмененных подписок за i-й день (1 <= і <= n, 1 <= ai <= 1000).");
Console.WriteLine("Формат выходных данных: \nВ единственной строке выведите максимальную прибыль, которую можно получить, поменяв данные за не более, чем два дня. \nЗамечание \nМожно менять данные за не более, чем два дня, в том числе не менять ничего.");

// 2
// 1 2
// 1
// -------------
// 3
// 2 2 2
// 2

//ввод данных
int n = Convert.ToInt32(Console.ReadLine());
string input = Console.ReadLine();
string[] myInput = input.Split(new char[] {' '});
int sum = 0;

Console.WriteLine("{0}", classic(n, input));

// работа с формулой 
int classic(int n, string input) {
    for (int i = 1; i <= n; i++) {
        int ai = Convert.ToInt32(myInput[i-1]);
        int result = (int)Math.Pow(-1, i-1) * ai;
        sum = sum + result;
    }
    //Console.WriteLine("sum = " + sum);
    return sum;
}

// перестроение массива
//идея: проверять начиная с первого элемента, как выгоднее со следующим или через один
for (int i = 0; i < n; i++) {
    if (i < n-1) {
        string proverka1 = myInput[i];
        string proverka2 = myInput[i+1];
        int sum1 = classic(n, proverka1);
        int sum2 = classic(n, proverka2);
        Console.WriteLine("{0}, {1} ", proverka1, proverka2);
        if (sum1 < sum2) {
            string temp = myInput[i];
            myInput[i] = myInput[i+1];
            myInput[i+1] = temp;
        }
    } else break;
}