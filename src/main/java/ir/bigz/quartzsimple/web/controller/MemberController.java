package ir.bigz.quartzsimple.web.controller;

import ir.bigz.quartzsimple.domain.Member;
import ir.bigz.quartzsimple.service.MemberService;
import ir.bigz.quartzsimple.web.model.FilterRequest;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Controller
@RequestMapping(value = "/members", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class MemberController {

    private MemberService memberService;

    public MemberController(@Lazy MemberService memberService) {
        this.memberService = memberService;
    }

    @ResponseBody
    @GetMapping(value = "")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Member>> getAllMembers(@RequestParam(required = false) String searchString, FilterRequest filter) {
        return new ResponseEntity<>(memberService.getMembers(filter, searchString), HttpStatus.OK);
    }
}
