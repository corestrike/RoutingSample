package gr.corestrike.sample.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/sample")
public class SampleController {

    @RequestMapping("/")
    public String index(Map<String, Object> model) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat();
        String str = "Reached server controller: " + format.format(date);
        model.put("sample", str);
        return "sample/index";
    }

    @RequestMapping("/angular/")
    public String index2(Map<String, Object> model) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat();
        String str = "Reached server controller: " + format.format(date);
        model.put("sample", "Reached server controller: " +date.getTime());
        return "sample/dist/index";
    }
}
