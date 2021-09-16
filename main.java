import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;





public class main {
	    public static int find(String[] array, String element) {
		    return  Arrays.asList(array).indexOf(element);
		}
		public static void main(String[] args) throws InterruptedException, IOException {
		Scanner in = new Scanner(System.in);
		
			
		String[] work = {
		".",  //0
		"Покупаю билеты\n", //1
		"Сажусь на самолёт\n",//2
		"Лечу в Италию\n",//3
		"Лечу в Бразилию\n",//4
		"Собираю ягоды\n",//5
		"Сушу ягоды\n",//6
		"Займитесь делами, я там на долго...\n",//7
		"Лечу Обратно\n",//8
		"Покупаю зёрна\n",//9
		"Грею воду\n",//10
		"Собираю росу\n",//11
		"Лечу в Африку\n",//12
		"Обжариваю зёрна\n",//13
		"Чешу левую пятку\n",//14
		"Измельчаю зёрна\n",//15
		"Иду в пятёрочку\n",//16
		"Беру первый попавшийся дешевый кофе\n",//17
		"Насыпаю в кружку\n",//18
		"Лью кипяток\n",//19
		"2 кубика сахара\n",//20
		"буль буль\n",//21
		"ВАШ КОФЕ ГОТОВ, СУДАРЬ!\n",//22
		"Размешиваю\n",//23
		"Такой кофе я не знаю. Идите нафиг, сударь!\n",//24
		"топ топ\n",//25
		"хвать хвать\n",//26
		"cып сып\n",//27
		".\n",//28
		"плеск плеск\n",//29
		"ш ",//30
		"жжжж\n",//31
		"Нагреваю молоко\n",//32
		"Взбиваю молоко\n",//33
		"Сыплю зёрна в турку\n",//34
		"заливаю водой\n",//35
		"Нагреваю n-раз\n",//36
		"Соединяю\n",//37
		"ой да ну его нафиг\n",//38
		"Просто представьте типичное приготовление кофе Раф, Ок?\n",//39
		
		};
		
		int[][] numbers_work = {
				{0,0,28,24},
			    {16, 25,0,0,28, 17, 18, 27,27, 10, 0,0,28, 21, 19,29, 20, 21, 23, 0,0,28, 22}, 
			    {16, 9, 13,30,30,30,28,14,15,31,31,34,27,35,21,23, 0,0,28,36, 0,0,28, 32, 0,0,28, 33,37,0,0,28,22},
			    {1, 2, 3, 0,0,28, 7},
			    {1,2,4, 0,0,28, 5,6, 0,0,28,11,8, 0,0,28,15, 0,0,28, 0,0,28,38,39,0,0,28,22},
			};

		String[] coffee = {"Экспрессо", "Каппучино", "Латте", "Раф"};
		
		System.out.println(" Здравствуйте! Я кофейный АВТОМАТ!");
		TimeUnit.SECONDS.sleep(2);
		System.out.println(" И Какой же кофе вы хотите, сударь?? ");
		TimeUnit.SECONDS.sleep(2);
		for (int i = 0; i < coffee.length; i++) {
	        System.out.println((String)coffee[i]);
	        TimeUnit.SECONDS.sleep(1);
	    }
		TimeUnit.SECONDS.sleep(1);
		System.out.print(" Пишите название: ");
		String name = in.nextLine();;
		int x = find(coffee,name);
		int index = 1 + x;
		for (int i = 0; i < numbers_work[index].length; i++) {
	        System.out.print(work[numbers_work[index][i]]);
	        TimeUnit.SECONDS.sleep(1);
	    }
		
	}

}
