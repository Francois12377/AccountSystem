package za.ac.nwu.ac.web.sb.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.nwu.ac.main.service.GeneralResponse;



@RestController("BeanName")
@RequestMapping("Demo")
public class AccountTypeControl {
    @GetMapping("/all")
    public GeneralResponse<String> getAll() {return new GeneralResponse<>(true, "No Types found");}
}
