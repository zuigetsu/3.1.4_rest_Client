package client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/admin")
    public String getAdminPage() {
        return "usersList";
    }

    @GetMapping("/user")
    public String getUserPage() {
        return "userPage";
    }


}
