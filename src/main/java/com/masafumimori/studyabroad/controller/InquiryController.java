package com.masafumimori.studyabroad.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.masafumimori.studyabroad.model.form.InquiryForm;

@Controller
@RequestMapping("/studyabroad/contact/send")
public class InquiryController {

	@Autowired
	private MailSender mailSender;
	
	@RequestMapping("/")
	@ResponseBody
	public List<String> send(@RequestBody InquiryForm f) {
		
		String body = "お問い合わせカテゴリー:　" + f.getSubject() + "\n" +
								"お名前:　" + f.getName() + "\n" +
								"メールアドレス:　" + f.getEmail() + "\n" +
								"メッセージ:　" + f.getContent();
		
		// メール内容をセットし、送信
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setFrom(f.getEmail());
		msg.setTo("morimamama123@gmail.com"); //送信先のメール
		msg.setSubject("Ask-any-senpaiでお問い合わせがありました。");
		msg.setText("お問い合わせは下記の通りです。\n\n----------------------\n" + body + "\n----------------------");
		mailSender.send(msg);
		
		return Arrays.asList("SENT");
	}
}
