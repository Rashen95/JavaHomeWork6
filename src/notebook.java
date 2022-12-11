//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//        Создать множество ноутбуков.
//        Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет
//        ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
//        “Введите цифру, соответствующую необходимому критерию:
//        1 - ОЗУ
//        2 - Объем ЖД
//        3 - Операционная система
//        4 - Цвет …
//        Далее нужно запросить минимальные значения для указанных критериев -
//        сохранить параметры фильтрации можно также в Map.
//        Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

import java.util.Random;

public class notebook {
    String model_cpu;
    String model_gpu;
    String manufacturer;
    String model;
    int ram_size;
    int hdd_size;
    String os_name;
    String color;
    int price;
    String[] color_var = new String[]{"Черный", "Белый", "Красный", "Зеленый"};

    notebook(String arg_model_cpu, String arg_model_gpu, String arg_manufacturer,
             String arg_model, String arg_os_name, int arg_ram_size, int arg_hdd_size, int arg_price) {
        Random r = new Random();
        model_cpu = arg_model_cpu;
        model_gpu = arg_model_gpu;
        manufacturer = arg_manufacturer;
        model = arg_model;
        ram_size = arg_ram_size;
        hdd_size = arg_hdd_size;
        price = arg_price;
        os_name = arg_os_name;
        color = color_var[r.nextInt(color_var.length)];
    }

    public void info() {
        System.out.println("====================############=======================");
        System.out.printf("Фирма изготовитель: %s \n", manufacturer);
        System.out.printf("Модель: %s \n", model);
        System.out.printf("Процессор: %s \n", model_cpu);
        System.out.printf("Видеокарта: %s \n", model_gpu);
        System.out.printf("Количество оперативной памяти: %d гб \n", ram_size);
        System.out.printf("Объем жесткого диска: %d гб \n", hdd_size);
        System.out.printf("Операционная система %s \n", os_name);
        System.out.printf("Цвет: %s \n", color);
        System.out.printf("Цена: %d рублей \n", price);
    }
}
