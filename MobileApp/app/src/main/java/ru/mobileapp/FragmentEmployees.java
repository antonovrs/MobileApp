package ru.mobileapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.SimpleExpandableListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ru.mobileapp.model.Employee;
import ru.mobileapp.service.EmployeeService;


public class FragmentEmployees extends Fragment {

    private static final List<Employee> employees = new EmployeeService().createListEmployee();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = (View) inflater.inflate(R.layout.fragment_employees, container, false);

        Map<String, String> map;

        ArrayList<Map<String, String>> groupDataList = new ArrayList<>();

        String[] names = new String[8];

        for (int i = 0; i < 8; i++) {
            names[i] = employees.get(i).getName() + "\n" + employees.get(i).getPosition();
        }
        String[] employee1 = new String[]{"Грузовой автомобиль КАМАЗ А 007 АА 64", "+79299921099", "kravets@pergruz.ru"};
        String[] employee2 = new String[]{"Автобус Neoplan А 011 АА 64", "+79299920099", "lyubimov@perevozki.ru"};
        String[] employee3 = new String[]{"Автобус Setra А 006 АА 64", "+79299920199", "rubin@perevozki.ru"};
        String[] employee4 = new String[]{"Седельный тягач Tatra А 009 АА 64", "+79299921199", "pavlov@pergruz.ru"};
        String[] employee5 = new String[]{"Автобус Volvo А 001 АА 64", "+79299221099", "vasya@pergruz.ru"};
        String[] employee6 = new String[]{"Автобус Volvo А 005 АА 64", "+79292221099", "xoxol@pergruz.ru"};
        String[] employee7 = new String[]{"Автобус Volvo А 005 АА 64", "+79292221099", "malysh@pergruz.ru"};
        String[] employee8 = new String[]{"Автобус Volvo А 005 АА 64", "+79292221094", "petrov@pergruz.ru"};


        for (String group : names) {
            map = new HashMap<>();
            map.put("groupName", group); // время года
            groupDataList.add(map);
        }
        String groupFrom[] = new String[]{"groupName"};
        int groupTo[] = new int[]{android.R.id.text1};
        ArrayList<ArrayList<Map<String, String>>> сhildDataList = new ArrayList<>();
        ArrayList<Map<String, String>> сhildDataItemList = new ArrayList<>();

        for (String content : employee1) {
            map = new HashMap<>();
            map.put("employeeDescription", content); // название месяца
            сhildDataItemList.add(map);
        }

        сhildDataList.add(сhildDataItemList);

        сhildDataItemList = new ArrayList<>();
        for (String content : employee2) {
            map = new HashMap<>();
            map.put("employeeDescription", content);
            сhildDataItemList.add(map);
        }
        сhildDataList.add(сhildDataItemList);

        сhildDataItemList = new ArrayList<>();
        for (String content : employee3) {
            map = new HashMap<>();
            map.put("employeeDescription", content);
            сhildDataItemList.add(map);
        }
        сhildDataList.add(сhildDataItemList);


        сhildDataItemList = new ArrayList<>();
        for (String content : employee4) {
            map = new HashMap<>();
            map.put("employeeDescription", content);
            сhildDataItemList.add(map);
        }
        сhildDataList.add(сhildDataItemList);


        сhildDataItemList = new ArrayList<>();
        for (String content : employee5) {
            map = new HashMap<>();
            map.put("employeeDescription", content);
            сhildDataItemList.add(map);
        }
        сhildDataList.add(сhildDataItemList);


        сhildDataItemList = new ArrayList<>();
        for (String content : employee6) {
            map = new HashMap<>();
            map.put("employeeDescription", content);
            сhildDataItemList.add(map);
        }
        сhildDataList.add(сhildDataItemList);

        сhildDataItemList = new ArrayList<>();
        for (String content : employee7) {
            map = new HashMap<>();
            map.put("employeeDescription", content);
            сhildDataItemList.add(map);
        }
        сhildDataList.add(сhildDataItemList);
        сhildDataItemList = new ArrayList<>();
        for (String content : employee8) {
            map = new HashMap<>();
            map.put("employeeDescription", content);
            сhildDataItemList.add(map);
        }
        сhildDataList.add(сhildDataItemList);

        String childFrom[] = new String[]{"employeeDescription"};
        int childTo[] = new int[]{android.R.id.text1};
        SimpleExpandableListAdapter adapter = new SimpleExpandableListAdapter(getActivity(), groupDataList,
                android.R.layout.simple_expandable_list_item_1, groupFrom,
                groupTo, сhildDataList, android.R.layout.simple_list_item_1,
                childFrom, childTo);

        ExpandableListView expandableListView = (ExpandableListView) rootView.findViewById(R.id.expandableListView);
        expandableListView.setAdapter(adapter);
        return rootView;
    }

}

