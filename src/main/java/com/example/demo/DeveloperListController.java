package com.example.demo;

import java.util.List;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.annotation.RequestAction;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.ocpsoft.rewrite.faces.annotation.Deferred;
import org.ocpsoft.rewrite.faces.annotation.IgnorePostback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "session")
@Component(value = "developerList")
@ELBeanName(value = "developerList")
@Join(path = "/", to = "/developer-list.jsf")

public class DeveloperListController {

	@Autowired
	private DeveloperRepository developerRepository;

	private List<Developer> developers;

	@Deferred
	@RequestAction
	@IgnorePostback

	public void loadData() {
		developers = developerRepository.findAll();
	}

	public List<Developer> getDevelopers() {
		return developers;
	}

	private Developer developer = new Developer();

	public String save() {
		developerRepository.save(developer);
		developer = new Developer();

		return "/developer-list.xhtml?faces-redirect=true";
	}

	public Developer getDeveloper() {
		return developer;
	}

}
