package py.com.isproject.rodate.bean;

import static com.github.adminfaces.template.util.Assert.has;
import static py.com.isproject.rodate.util.Utils.addDetailMessage;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.util.Faces;

import py.com.isproject.rodate.model.Car;
import py.com.isproject.rodate.service.CarService;

@Named
@ViewScoped
public class CarFormMB implements Serializable {

	private Integer id;
	private Car car;

	@Inject
	CarService carService;

	public void init() {
		if (Faces.isAjaxRequest()) {
			return;
		}
		if (has(id)) {
			car = carService.findById(id);
		} else {
			car = new Car();
		}
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public void remove() throws IOException {
		if (has(car) && has(car.getId())) {
			carService.remove(car);
			addDetailMessage("Car " + car.getModel() + " removed successfully");
			Faces.getFlash().setKeepMessages(true);
			Faces.redirect("car-list.jsf");
		}
	}

	public void save() {
		String msg;
		if (car.getId() == null) {
			carService.insert(car);
			msg = "Car " + car.getModel() + " created successfully";
		} else {
			carService.update(car);
			msg = "Car " + car.getModel() + " updated successfully";
		}
		addDetailMessage(msg);
	}

	public void clear() {
		car = new Car();
		id = null;
	}

	public boolean isNew() {
		return car == null || car.getId() == null;
	}

}
