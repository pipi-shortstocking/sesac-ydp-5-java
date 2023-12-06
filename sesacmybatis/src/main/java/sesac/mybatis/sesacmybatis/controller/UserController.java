package sesac.mybatis.sesacmybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import sesac.mybatis.sesacmybatis.domain.User;
import sesac.mybatis.sesacmybatis.dto.UserDTO;
import sesac.mybatis.sesacmybatis.entity.UserEntity;
import sesac.mybatis.sesacmybatis.service.UserService;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/")
    public String getUsers(Model model) {
//        List<UserDTO> users = userService.getUserList();
        List<UserDTO> users = userService.getUserList2();
        model.addAttribute("list", users);

        return "user";
    }

    @GetMapping("user")
    public String getUserInsert(@RequestParam String name, @RequestParam String nickname, Model model) {
        User user = new User();
        user.setName(name);
        user.setNickname(nickname);

        userService.insertUser(user);

        return "redirect:/";
    }

    @GetMapping("search")
    @ResponseBody
    public String getUserByName(@RequestParam String name) {
        // ? 뒤에 쿼리로 받아온 name 값으로 검색을 해서 검색된 객체의 아이디와 닉네임을 보여주겠다.
//        UserEntity user = userService.getUserByName(name);
//        return user.getId() + " : " + user.getNickname();

        int user = userService.getUserByName(name);

        return user + "명";
    }

    @GetMapping("search2")
    @ResponseBody
    public String getUserByNameAndNickname(@RequestParam String name, @RequestParam String nickname) {
//        UserEntity user = userService.getUserByNameAndNickname(name, nickname);
//        return user.getId() + " : " + user.getNickname();

        int user = userService.getUserByNameAndNickname(name, nickname);

        return user + "명";
    }

    @GetMapping("search3")
    @ResponseBody
    public String getUserByNameOrNickname(@RequestParam String name, @RequestParam String nickname) {
        int user = userService.getUserByNameOrNickname(name, nickname);

        return user + "명";
    }

    @GetMapping("search4")
    @ResponseBody
    public String getUserByNickname(@RequestParam String nickname) {
//        UserEntity user = userService.getUserByNickname(nickname);
//        return user.getId() + " : " + user.getNickname();

        int user = userService.getUserByNickname(nickname);

        return user + "명";
    }

    @GetMapping("exist")
    @ResponseBody
    public String getUserExist(@RequestParam String name) {
        UserEntity user = userService.findExist(name);

        if(user != null) {
            return "exist";
        } else {
            return "no exist";
        }
    }
}
