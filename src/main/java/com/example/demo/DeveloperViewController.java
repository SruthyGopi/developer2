package com.example.demo;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.annotation.RequestAction;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.ocpsoft.rewrite.faces.annotation.Deferred;
import org.ocpsoft.rewrite.faces.annotation.IgnorePostback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "session")
@Component(value = "developerView")
@ELBeanName(value = "developerView")
@Join(path = "/developer-details/{id}", to = "/developer-view.jsf")

public class DeveloperViewController {

	@Autowired
	private DeveloperRepository developerRepository;

	private Developer developer;

	private String newSkill = "";

	@Deferred
	@RequestAction
	@IgnorePostback
	public void loadData() {

		HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext()
				.getRequest();

		String id = request.getParameter("id");

		developer = developerRepository.getOne(Long.parseLong(id));

	}

	public Developer getDeveloper() {
		return developer;
	}

	public String getNewSkill() {
		return newSkill;
	}

	public void setNewSkill(String value) {
		newSkill = value;
	}

	public String addSkill() {
		developer.setSkills(developer.getSkills() + "," + newSkill);

		developerRepository.save(developer);
		newSkill = "";
		return "/developer-list.xhtml?faces-redirect=true";
	}
}
