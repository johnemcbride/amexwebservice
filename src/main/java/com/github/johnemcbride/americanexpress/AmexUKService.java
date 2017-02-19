package com.github.johnemcbride.americanexpress;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.jasypt.util.text.StrongTextEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.boot.autoconfigure.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;

import com.github.johnemcbride.americanexpress.api.client.AmexUKClient;
import com.github.johnemcbride.americanexpress.api.model.AmexUKLoginResponse;
import com.github.johnemcbride.americanexpress.api.model.Card;
import com.github.johnemcbride.americanexpress.api.model.SummaryData;

@RestController
@EnableAutoConfiguration
public class AmexUKService{


	@RequestMapping(value = "/getaccounts", method = RequestMethod.GET, produces = "application/json")
  	public AmexUKLoginResponse getaccounts (
				@RequestParam(value = "username", required = true) String username,
                @RequestParam(value = "password", required = true) String password
                ) {

    //BigDecimal balance = new AmexUKClient(username, password) .getLoginResp();
   return new AmexUKClient(username, password) .getLoginResp();
        
	}
	

}