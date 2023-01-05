package com.caprocoo.ob.api.rest;

import com.caprocoo.ob.service.account.AccountService;
import com.caprocoo.ob.dto.account.AccountDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * packageName    : com.caprocoo.ob.controller
 * fileName       : MemberController
 * author         : caprocoo
 * date           : 2022-12-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-09        caprocoo       최초 생성
 */
@Slf4j
@RequiredArgsConstructor
@Controller
@RequestMapping("/account")
public class AccountController {

    private final AccountService accountService;


//    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//    public ApiResponseDto getAccountId(@PathVariable(value = "id") String id) throws BackendException {
//        try {
//            return new ApiResponseDto(true, this.accountService.findByMemberId(id)) ;
//        } catch (Exception e) {
//            throw new BackendException(" member 조회 중 오류발생", e);
//        }
//    }

    @RequestMapping(value = "login", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String loginHome(){

        return "account/login";
    }

    @PostMapping("/sign")
    public ResponseEntity<AccountDto> signup(@Valid @RequestBody AccountDto accountDto) {
        return ResponseEntity.ok(accountService.signup(accountDto));
    }



}
