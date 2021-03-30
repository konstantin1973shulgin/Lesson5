package lesson5;

public class Lesson5 {

    public static void main(String[] args) {

        Worker[] employees = new Worker[5];
        employees[0] = new Worker("Васильев Петр", "Прораб", "vasp@mail.ru", "+79021251216",60000 ,28);
        employees[1] = new Worker("Соколов Дмитрий", "Токарь", "sokolov@mai.ru", "+79021251212",70000,27);
        employees[2] = new Worker("Макаров Алексей", "Фрезеровщик", "makarov@mail.ru", "+79021251214",80000,43);
        employees[3] = new Worker("Соломин Макар", "Слесарь", "solomm@mail.ru", "+79021251215",50000,18);
        employees[4] = new Worker("Носова Ирина ", "Маркшейдер", "nos@mail.ru", "+79021251217",30000,41);

        for (Worker worker : employees)
            if (worker.getAge()>40)
                System.out.println(worker);


    }
}

class Worker {
    private final String name;
    private final String position;
    private final String email;
    private final String phone;
    private final int income;
    private final int age;

    public Worker(String name, String position, String email, String phone, int income, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.income = income;
        this.age = age;


    }

    public int getAge() {
        return age;

    }

    @Override
    public String toString() {
        return (name + "\n-"
                + position + "\n-"
                + email + "\n-"
                + phone + "\n-"
                + income + "\n-"
                + age);
    }
}
