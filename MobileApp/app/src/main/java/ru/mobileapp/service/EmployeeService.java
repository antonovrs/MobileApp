package ru.mobileapp.service;

import ru.mobileapp.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private List<Employee> employees = new ArrayList<Employee>();

    public List<Employee> createListEmployee(){
        employees.add(new Employee("Дмитрий Кравцов","Водитель (*)","Грузовой автомобиль КАМАЗ А 007 АА 64",false,"+79299921099","kravets@pergruz.ru"));
        employees.add(new Employee("Алексей Любимов","Водитель (*)","Автобус Neoplan А 011 АА 64",false,"+79299920099","lyubimov@perevozki.ru"));
        employees.add(new Employee("Алексей Рубин","Водитель (*)","Автобус Setra А 006 АА 64",false,"+79299920199","rubin@perevozki.ru"));
        employees.add(new Employee("Олег Павлов","Старший водитель (*)","Седельный тягач Tatra А 009 АА 64",false,"+79299921199","pavlov@pergruz.ru"));
        employees.add(new Employee("Андрей Васильев","Старший водитель (*)","Автобус Volvo А 001 АА 64",false,"+79299221099","vasya@pergruz.ru"));
        employees.add(new Employee("Артем Хохлов","Старший водитель (*)","Автобус Volvo А 005 АА 64",false,"+79292221099","xoxol@pergruz.ru"));
        employees.add(new Employee("Егор Малышев","Водитель (*)","Автобус Volvo А 005 АА 64",false,"+79292221099","malysh@pergruz.ru"));
        employees.add(new Employee("Иван Петров","Старший водитель (*)","Автобус Volvo А 005 АА 64",false,"+79292221094","petrov@pergruz.ru"));
        employees.add(new Employee("Сергей Коваленко","Водитель (*)","Автобус Volvo А 005 АА 64",false,"+79292221095","kovalenko@pergruz.ru"));
        employees.add(new Employee("Владимир Кудинов","Старший водитель (*)","Автобус Volvo А 005 АА 64",false,"+79292221096","kudinov@pergruz.ru"));
        employees.add(new Employee("Андрей Маринин","Водитель (*)","Автобус Volvo А 005 АА 64",false,"+79292221097","marinin@pergruz.ru"));
        employees.add(new Employee("Юрий Костенко","Старший водитель (*)","Автобус Volvo А 005 АА 64",false,"+79292221098","kostenko@pergruz.ru"));


        return employees;
    }
}
