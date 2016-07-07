package com.example.testapplication.dummy;

import com.example.testapplication.model.Employee;
import com.example.testapplication.service.EmployeeService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DummyContent {

    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();
    public static final List<Employee> EMPLOYEES = new EmployeeService().createListEmployee();
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();
    private static final int COUNT = EMPLOYEES.size();

    static {
        for (int i = 0; i < COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        String name = EMPLOYEES.get(position).getName();
        return new DummyItem(String.valueOf(position), name, makeDetails(EMPLOYEES.get(position)));
    }

    private static String makeDetails(Employee employee) {
        StringBuilder builder = new StringBuilder();
        builder.append("Информация о сотруднике: ");
            builder.append("\n"+"Должность: \n" + employee.getPosition())
                    .append("\n"+"Текущее ТС: \n" + employee.getCurrentVehicle())
                    .append("\n"+"Телефон: \n" + employee.getPhoneNumber())
                    .append("\n"+"E-mail: \n" + employee.getEmail());
        return builder.toString();
    }

    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;

        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
