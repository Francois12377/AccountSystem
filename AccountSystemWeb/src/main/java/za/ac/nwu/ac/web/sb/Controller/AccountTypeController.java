package za.ac.nwu.ac.web.sb.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.nwu.ac.main.service.GeneralResponse;

@RestController
public class AccountTypeController {
    @GetMapping("/all")
    public GeneralResponse<String> getAll() { return new GeneralResponse<>(true , "No type found");}
}
