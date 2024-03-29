public class Main {
    public static void main(String[] args) {
        //Задача 1
        String firstName="Ivan";
        String middleName="Ivanovich";
        String lastName="Ivanov";
        String fullName=lastName+" "+firstName+" "+middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        System.out.println();
        //Задача 2
        System.out.println("Данные ФИО сотрудника для заполнения отчета - "+fullName.toUpperCase());
        System.out.println();
        //Задача 3
        String fullName1="Иванов Семён Семёнович";
        String replacedFullName=fullName1.replace('ё','е');
        System.out.println("Данные ФИО сотрудника - "+replacedFullName);
    }
}