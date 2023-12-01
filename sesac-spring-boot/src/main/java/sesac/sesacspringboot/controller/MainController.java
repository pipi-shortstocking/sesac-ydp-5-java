package sesac.sesacspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
// @RestController : Controller 면서 모든 메소드가 @ResponseBody를 갖도록 하는 친구
public class MainController {
    @GetMapping("/api")
    public String getApi(){return "request";}

    // 1) get : ?key=value
    // 검색 / 해시태그
    // /get/response1?name=abc&age=14
    @GetMapping("/get/response1")
    public String getResponse1(@RequestParam(value="name") String name,
                               @RequestParam(value="age") String age,
                               Model model) {
        // @RequestParam : 요청의 파라미터를 매개변수로 받을 때 적는 어노테이션
        // value = ? 뒤에 넘어온 key
        // required 값을 설정할 수 있다. = true / false -> 기본값은 true
        // required 가 true 로 되어있으면 ?뒤에 해당되는 key가 없을 경우 메소드를 찾지 못한다. = 400 error
        model.addAttribute("name", name);
        return "response";
    }

    @GetMapping("/get/response2")
    public String getResponse2(@RequestParam(value="name", required = false) String name, Model model) {
        model.addAttribute("name",name);
        return "response";
    }

    // /get/response3/이름/나이
    // uri에 변수가 들어올 때 그 값을 가져오는 방법
    @GetMapping("/get/response3/{name}/{age}")
    public String getResponse3(@PathVariable(value="name") String n,
                               @PathVariable String age,
                               Model model) {
        model.addAttribute("name", n);
        model.addAttribute("age", age);
        return "response";
    }

    @GetMapping("/get/response4/{name}/{age}")
    public String getResponse4(@PathVariable(value="name") String n,
                               @PathVariable(required = false) String age,
                               Model model) {
        // @Pathvariable에 required 설정이 가능하나, 기본값은 true
        // @Pathvariable에 required를 설정할 때는 GetMapping에 url도 같이 설정해줘야 한다.
        // required 값이 false 인 친구는 뒤로 가야한다.
        model.addAttribute("name", n);
        model.addAttribute("age", age);
        return "response";
    }

    //////////////////////
    // practice
    @GetMapping("/introduce1/{name}")
    public String getPractice1(@PathVariable String name, Model model) {
        model.addAttribute("name",name);
        return "practice";
    }

    @GetMapping("/introduce2")
    public String getPractice2(@RequestParam(value="name") String name,
                               @RequestParam(value="age") String age,
                               Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "practice";
    }

    ////////////////////
    // post로 값을 전달할 때 그 값을 controller에서 받는 방법은 @RequestParam
    @PostMapping("/post/response1")
    public String postResponse1(@RequestParam(value="name") String name, Model model) {
        model.addAttribute("name", name);
        // required = true임에도 빈 값으로 post가 되는 이유 - input에 name이라는 키가 존재하기 때문
        return "response";
    }

    @PostMapping("/post/response2")
    public String postResponse2(@RequestParam(value="name", required = false) String name, Model model) {
        model.addAttribute("name", name);
        return "response";
    }

    @PostMapping("/post/response3")
    @ResponseBody // res.send
    // return 하는 문자열의 template 파일을 불러오는 게 아니라
    // return 하는 문자열 그대로 값을 전달하는 것
    public String postResponse3(@RequestParam(value="name", required = false) String name, Model model) {
        model.addAttribute("name", name);
        return "response";
    }

    //////////////////////
    // practice
    @GetMapping("/postPrac")
    public String getPractice(){return "practicePost";}

    @PostMapping("/postPrac")
    public String postPractice(@RequestParam(value="name") String name,
                               @RequestParam(value="gender") String gender,
                               @RequestParam(value="year") String year,
                               @RequestParam(value="month") String month,
                               @RequestParam(value="day") String day,
                               @RequestParam(value="interest") String interest,
                               Model model) {
        model.addAttribute("name", name);
        model.addAttribute("gender", gender);
        model.addAttribute("year", year);
        model.addAttribute("month", month);
        model.addAttribute("day", day);
        model.addAttribute("interest", interest);
        return "postPrac";
    }
}
