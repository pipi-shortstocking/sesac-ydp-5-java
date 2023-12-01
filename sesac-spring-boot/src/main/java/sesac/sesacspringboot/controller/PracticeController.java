package sesac.sesacspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PracticeController {
    @GetMapping("practice")
    public String getPractice(Model model) {
        // 실습 1
        int prac1_age = 25;

        model.addAttribute("age", prac1_age);

        // 실습 2
        List<Person> person = new ArrayList<>();

        person.add(new Person("kim", 10));
        person.add(new Person("lee", 20));
        person.add(new Person("hong", 30));
        person.add(new Person("park", 40));
        person.add(new Person("shin", 50));

        model.addAttribute("people", person);
        return "practice";
    }

    class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
