package io.spring.tutorial.part07.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Service;

@Service
public class TrafficFortuneService implements FortuneService {
	@Override
	public String getFortune() {

		try {
			// simulate a delay
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// return a fortune
		return "Expect heavy traffic this morning";
	}
}