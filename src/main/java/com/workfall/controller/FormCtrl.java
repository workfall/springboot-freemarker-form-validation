package com.workfall.controller;

import com.workfall.model.User;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class FormCtrl {

  // endpoint - http://localhost:7001/
  @GetMapping(value = "/")
  public String index() {
    log.info("Redirecting");
    return "redirect:/form";
  }

  @GetMapping(value = "/form")
  public String showForm(final Model model) {
    log.info("Showing form page");
    setModel(model, new User());
    return "form";
  }

  @PostMapping(value = "/form")
  public String post(@Valid final User user, final BindingResult result, final Model model) {
    log.info(user.toString());
    if (!result.hasErrors()) {
      log.info("Form validation passed. No errors reported");
      model.addAttribute("noErrors", true);
    }
    setModel(model, user);
    return "form";
  }

  private void setModel(final Model model, final User user) {
    model.addAttribute("user", user);
    model.addAttribute("genders", genders());
  }

  private List<String> genders() {
    final List<String> list = new ArrayList<>();
    list.add("Male");
    list.add("Female");
    return list;
  }
}
