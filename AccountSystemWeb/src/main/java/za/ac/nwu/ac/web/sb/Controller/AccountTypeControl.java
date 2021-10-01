package za.ac.nwu.ac.web.sb.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.nwu.ac.main.service.Response;

@RestController
public class AccountTypeControl {
    @GetMapping("/all")
    public Response<String> getAll() {return new Response<>(true, "No Types found");}
}
