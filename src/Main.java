import common.Task;
import tasks.Task1;
import tasks.Task2;
import tasks.Task3;
import tasks.Task4;
import tasks.Task5;
import tasks.Task6;
import tasks.Task7;
import tasks.Task8;

import java.util.List;

/*
Задачи находятся в пэкедже tasks
Один класс - одна задача.
main запустит и проверит все эти задачи
Реализовывать можно как и с использованием стримов, так и без
Главное - понятность кода и его скорость. Вы сами решаете уместность применения стримов!
И разумеется прохождение проверки это лишь формальная часть, я буду смотреть на код и на комментарии, которые требуются в задачах
 */
public class Main {

  public static void main(String[] args) {
    List<Task> tasks = List.of(
        new Task1(),
        new Task2(),
        new Task3(),
        new Task4(),
        new Task5(),
        new Task6(),
        new Task7(),
        new Task8()
    );
    tasks.forEach(task -> System.out.println(task.getClass().getName() + " - "  + (task.check() ? "Success" : "Fail")));
  }
}
