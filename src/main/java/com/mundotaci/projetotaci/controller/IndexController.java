package com.mundotaci.projetotaci.controller;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mundotaci.projetotaci.entities.Store;

@Controller
public class IndexController {

    @PersistenceContext
    private EntityManager entityManager;

    @GetMapping("/index")
    public String mostrarLoja(Model model) {
        Query query = (Query) entityManager.createQuery("select s from Store s", Store.class);

        List<Store> stories = query.getResultList();
        model.addAttribute("stories", stories);

        return "index";
    }

}
