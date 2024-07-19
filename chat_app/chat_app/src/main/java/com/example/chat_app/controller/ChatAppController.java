package com.example.chat_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.chat_app.model.UserMessager;
import jakarta.validation.Valid;

@Controller
public class ChatAppController {

    @GetMapping("/chatApp")
    public String getChatApp(Model model) {
        model.addAttribute("userMessager", new UserMessager());
        return "chat";
    }

    @PostMapping("/sendMessage")
    public String sendMessage(Model model, @Valid UserMessager userMessager) {
        System.out.println(userMessager.getMessage());

        model.addAttribute("userMessager", userMessager);
        return "chat";
    }
}



// package com.example.chat_app.controller;

// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;

// import com.example.chat_app.model.UserMessager;

// import jakarta.validation.Valid;


// @Controller
// public class ChatAppController {

//     @GetMapping("/chatApp")
//     public String getChatApp(){
//         return "chat";
//     }

//     @PostMapping("/sendMessage")
//     public String sendMessage(Model model , @Valid UserMessager userMessager){
//     model.addAttribute("userMessager", new UserMessager());
//     System.out.println(userMessager.getMessage());

//     return "chat";
//     }
    
// }


// @Controller
// @RequestMapping("/smartContect")
// public class UserDataController {

//     @Autowired
//     UserDataService userDataService;

//     // go to home page this is first page
//     @GetMapping("/")
//     public String homePage() {
//         return "home";
//     }

//     // this is log in page
//     @GetMapping("/logIn")
//     public String logInPage(Model model) {
//         model.addAttribute("userData", new UserData());
//         return "logIn";
//     }

//     // this ia sign up page
//     @GetMapping("/signUp")
//     public String signUpPage(Model model) {
//         model.addAttribute("userData", new UserData());
//         return "signUp";
//     }

//     // add contect after sign up
//     @PostMapping("/userCreated")
//     public String createNewUser(Model model, @Valid UserData userData, BindingResult result) {
//         try {
//             model.addAttribute("contactData", new ContectData());
//             return userDataService.createNewUser(userData, result);
//         } catch (Exception e) {
//             System.out.println(e);
//             return "signUp";
//         }
//     }

//     // add contect after login
//     @PostMapping("/userLogin")
//     public String userLogin(Model model, @Valid UserData userData, BindingResult result) {
//         try {
//             model.addAttribute("contactData", new ContectData());
//             return userDataService.logInUser(userData, result);
//         } catch (Exception e) {
//             return "logIn";
//         }
//     }

//     @DeleteMapping("/deleteAll")
//     public ResponseEntity<?> deleteAllData() {
//         return userDataService.deletedAllData();
//     }

//     @DeleteMapping("/deleteUserById")
//     public ResponseEntity<Optional<UserData>> deleteDataById(@PathVariable("id") int id){
//         return userDataService.deletedUserDataById(id);
//     }
// }
