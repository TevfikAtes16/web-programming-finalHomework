package com.tevfik.webprogramming.API;

import com.tevfik.webprogramming.dto.JqueryDto;
import com.tevfik.webprogramming.service.IJqueryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RequiredArgsConstructor
@Log4j2


@RestController
@RequestMapping("/api/v1/jquery")
@CrossOrigin
public class JquerySpringApi  {

    private final IJqueryService iJqueryService;

    @PostMapping(value = "/post",consumes={"application/json"})
    public ResponseEntity<JqueryDto>  createRegister(@Valid @RequestBody(required = true) JqueryDto jqueryDto) { //@RequestBody(required = false)
        System.out.println(jqueryDto);
        iJqueryService.createRegister(jqueryDto);
        return ResponseEntity.ok(jqueryDto);
    }


    @GetMapping(value = "/get")
    public ResponseEntity<List<JqueryDto>>  getAllRegisters() {
        return ResponseEntity.ok(iJqueryService.getAllRegisters());
    }
}
