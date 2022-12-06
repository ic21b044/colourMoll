package at.sml.colour.controller;

import at.sml.colour.service.colourService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class colourController {

    private final colourService clrService;

    public colourController(colourService clrService, colourService clrService1) {
        this.clrService = clrService1;
    }

    @GetMapping("/colour")
    @ResponseBody
    String getSum() {
        return clrService.toString();
    }

    @GetMapping("/colour/{colour}")
    @ResponseBody
    String addToSum(@PathVariable String colour) {
        return clrService.getComColour(colour);
    }

}
