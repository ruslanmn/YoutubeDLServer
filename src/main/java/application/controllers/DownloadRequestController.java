package application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DownloadRequestController {
    @RequestMapping("/download")
    @ResponseBody
    public String download(@RequestParam String url) {
        return "Started downloading";
    }

}
