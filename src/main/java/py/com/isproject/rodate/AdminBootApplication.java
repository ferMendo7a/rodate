package py.com.isproject.rodate;

import java.util.List;

import javax.inject.Inject;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import py.com.isproject.rodate.model.Car;
import py.com.isproject.rodate.util.Utils;

@SpringBootApplication
public class AdminBootApplication {
	@Inject
	private Utils utils;

	@Bean
	public List<Car> getCars() {
		return utils.getCars();
	}

}
