package DateBase;

import Java15.Model.Actor;
import Java15.Model.Genre;
import Java15.Model.Movie;
import Java15.Model.Producer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DateBase {

    public static List<Movie> movies = new LinkedList<>(List.of(
            new Movie("Один дома", LocalDate.of(1999, 12, 31), Genre.COMEDY,
                    new Producer("Sam", "Raimy"), new ArrayList<>(List.of(
                    new Actor("Jon Cina", "Dad")
            ))),
            new Movie("1+1", LocalDate.of(2011, 4, 9), Genre.COMEDY,
                    new Producer("Оливье", "Накаш"), new ArrayList<>(List.of(
                    new Actor("Франсуа Клюзе", "Philippe"),
                    new Actor("Омар Си", "Driss")
            ))),
            new Movie("Маска", LocalDate.of(1994, 7, 29), Genre.COMEDY,
                    new Producer("Чак", "Рассел"), new ArrayList<>(List.of(
                    new Actor("Джим Керри", "Stanley Ipkiss"),
                    new Actor("Кэмерон Диас", "Tina Carlyle")
            ))),
            new Movie("День сурка", LocalDate.of(1993, 2, 12), Genre.COMEDY,
                    new Producer("Гарольд", "Рамис"), new ArrayList<>(List.of(
                    new Actor("Билл Мюррей", "Phil Connors"),
                    new Actor("Энди МакДауэлл", "Rita Hanson")
            ))),
            new Movie("Американский пирог", LocalDate.of(1999, 7, 9), Genre.COMEDY,
                    new Producer("Пол", "Вайц"), new ArrayList<>(List.of(
                    new Actor("Джейсон Биггс", "Jim Levenstein"),
                    new Actor("Шон Уильям Скотт", "Steve Stifler")
            ))),

            // Ужасы

            new Movie("Кошмар на улице Вязов", LocalDate.of(1984, 11, 9), Genre.HORROR,
                    new Producer("Уэс", "Крейвен"), new ArrayList<>(List.of(
                    new Actor("Роберт Инглунд", "Freddy Krueger"),
                    new Actor("Хизер Лэнгенкамп", "Nancy Thompson")
            ))),
            new Movie("Зловещие мертвецы", LocalDate.of(1981, 10, 15), Genre.HORROR,
                    new Producer("Сэм", "Рэйми"), new ArrayList<>(List.of(
                    new Actor("Брюс Кэмпбелл", "Ash Williams")
            ))),
            new Movie("Сияние", LocalDate.of(1980, 5, 23), Genre.HORROR,
                    new Producer("Стэнли", "Кубрик"), new ArrayList<>(List.of(
                    new Actor("Джек Николсон", "Jack Torrance"),
                    new Actor("Шелли Дюваль", "Wendy Torrance")
            ))),
            new Movie("Омен", LocalDate.of(1976, 6, 6), Genre.HORROR,
                    new Producer("Ричард", "Доннер"), new ArrayList<>(List.of(
                    new Actor("Грегори Пек", "Robert Thorn")
            ))),
            new Movie("Заклятие", LocalDate.of(2013, 7, 19), Genre.HORROR,
                    new Producer("Джеймс", "Ван"), new ArrayList<>(List.of(
                    new Actor("Патрик Уилсон", "Ed Warren"),
                    new Actor("Вера Фармига", "Lorraine Warren")
            ))),

            // Романтика

            new Movie("Титаник", LocalDate.of(1997, 12, 19), Genre.ROMANCE,
                    new Producer("Джеймс", "Кэмерон"), new ArrayList<>(List.of(
                    new Actor("Леонардо ДиКаприо", "Jack Dawson"),
                    new Actor("Кейт Уинслет", "Rose DeWitt Bukater")
            ))),
            new Movie("Гордость и предубеждение", LocalDate.of(2005, 11, 11), Genre.ROMANCE,
                    new Producer("Джо", "Райт"), new ArrayList<>(List.of(
                    new Actor("Кира Найтли", "Elizabeth Bennet"),
                    new Actor("Мэттью Макфэдьен", "Mr. Darcy")
            ))),
            new Movie("Ла-Ла Ленд", LocalDate.of(2016, 12, 9), Genre.ROMANCE,
                    new Producer("Дэмьен", "Шазелл"), new ArrayList<>(List.of(
                    new Actor("Райан Гослинг", "Sebastian"),
                    new Actor("Эмма Стоун", "Mia")
            ))),
            new Movie("Виноваты звезды", LocalDate.of(2014, 6, 6), Genre.ROMANCE,
                    new Producer("Джош", "Бун"), new ArrayList<>(List.of(
                    new Actor("Шейлин Вудли", "Hazel Grace"),
                    new Actor("Энсел Эльгорт", "Augustus Waters")
            ))),
            new Movie("Сумерки", LocalDate.of(2008, 11, 21), Genre.ROMANCE,
                    new Producer("Кэтрин", "Хардвик"), new ArrayList<>(List.of(
                    new Actor("Кристен Стюарт", "Bella Swan"),
                    new Actor("Роберт Паттинсон", "Edward Cullen")
            ))),

            // Кыргызское кино

            new Movie("Бир тууганчик", LocalDate.of(2017, 5, 12), Genre.DRAMA,
                    new Producer("Актан", "Арым Кубат"), new ArrayList<>(List.of(
                    new Actor("Тынчтык Абдылдаев", "Аман")
            ))),
            new Movie("Таксыр", LocalDate.of(2018, 3, 10), Genre.DRAMA,
                    new Producer("Эрнест", "Абдыжапаров"), new ArrayList<>(List.of(
                    new Actor("Азиз Мурадилаев", "Мырза")
            ))),
            new Movie("Аяш", LocalDate.of(2019, 10, 15), Genre.COMEDY,
                    new Producer("Темир Бирназаров", "Бакыт"), new ArrayList<>(List.of(
                    new Actor("Алтынбек Максутов", "Айдар")
            ))),
            new Movie("Бейиш эненин таманында", LocalDate.of(2016, 8, 30), Genre.DRAMA,
                    new Producer("Садык", "Шер-Нияз"), new ArrayList<>(List.of(
                    new Actor("Айсулуу Азимбаева", "Камиля")
            ))),
            new Movie("Боз салкын", LocalDate.of(2007, 7, 20), Genre.DRAMA,
                    new Producer("Актан", "Арым Кубат"), new ArrayList<>(List.of(
                    new Actor("Тынай Ибрагимов", "Султан")
            )))
    ));
}
