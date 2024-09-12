import Java15.Model.Genre;
import dao.MovieSortAble;
import dao.MovieSortImpl;
import service.MovieService;
import service.MovieServiceImpl;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MovieService movieService = new MovieServiceImpl();
        MovieSortAble movieSortAble = new MovieSortImpl();
        Scanner scanner = new Scanner(System.in);
        Scanner scannerNum = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    1.Все кино
                    2.Найти кино по названию
                    3.Найти кино по имени актера
                    4.Найти кино по году
                    5.Найти кино по продюссеру
                    6.Найти фильм по жанру
                    7.Найти кино по ролу
                                    
                    8.Сортировать по названию кино
                    9.Сортировать по году выпусков
                    10.Сортировать по имени продюсера 
                                        
                    Выберите функцию:
                                        
                    """);
            String choice = scanner.nextLine();
            switch (choice.trim()) {
                case "1" -> {
                    movieService.getAllMovies().forEach(System.out::println);
                }
                case "2" -> {
                    System.out.println("Введите название фильма: ");
                    String name = scanner.nextLine();
                    System.out.println(movieService.findMovieByFullNameOrPartName(name.trim().toLowerCase()));
                }
                case "3" -> {
                    System.out.println("Введите имя актера: ");
                    String actorName = scanner.nextLine().toLowerCase().trim();
                    System.out.println(movieService.findMovieByActorName(actorName));
                }
                case "4" -> {
                    System.out.println("Введите год: ");
                    try {
                        int year = scanner.nextInt();  // Вводим только год
                        scanner.nextLine();
                        // Вызываем метод поиска по году
                        System.out.println(movieService.findMovieByYear(LocalDate.of(year, 1, 1)));  // Передаем только год как int
                    } catch (InputMismatchException e) {
                        System.out.println("Ошибка: Введите корректное числовое значение для года.");
                          // Очищаем ввод, чтобы избежать бесконечного цикла ошибок
                    }


                }
                case "5" -> {
                    System.out.println("Введите имя продюссера: ");
                    String producerFullName = scannerNum.nextLine();
                    movieService.findMovieByProducer(producerFullName).forEach(System.out::println);
                }
                case "6" -> {
                    System.out.println(movieService.findByGenre(Genre.valueOf(scannerNum.nextLine().toUpperCase().trim().replace(" ", ""))));
                }
                case "7" -> {
                    System.out.println("Введите имя актера: ");
                    String actorFullName = scanner.nextLine();
                    System.out.println("Введите название фильма: ");
                    String movieName = scanner.nextLine();
                    System.out.println(movieService.findRoleByRoleAndMoveName(movieName, actorFullName));
                }
                case "8" -> {
                    System.out.println("asc/desc");
                    String asc = scanner.nextLine();
                    movieSortAble.sortMovieByName(asc);
                    movieService.getAllMovies().forEach(System.out::println);
                }
                case "9" -> {
                    System.out.println("asc/desc");
                    String desk = scanner.nextLine();
                    movieSortAble.sortByYear(desk);
                    movieService.getAllMovies().forEach(System.out::println);

                }
                case "10" -> {
                    System.out.println("Sort by (name/last name): ");
                    String s = scannerNum.nextLine();
                    movieSortAble.sortByProducer(s);
                    movieService.getAllMovies().forEach(System.out::println);
                }
                default -> System.out.println("Неверная");
            }
        }
    }
}