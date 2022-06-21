package com.example.demo.Controller;

import com.example.demo.dao.ArticleDao;
import com.example.demo.repository.ArticlesRepository;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@Validated
public class ArticlesController {

    @Autowired
    ArticlesRepository articlesRepository;

    @GetMapping("/articles")
    public String showArticles(Model model){

        //model.addAttribute("articles",this.articlesRepository.findAll().stream().map(ArticleDao::fromArticle).collect(Collectors.toList()));

        model.addAttribute("articles", List.of(new ArticleDao("test1","le test","qsdqsd"),new ArticleDao("test2","testqsdqsdqsdsqd","qsdqsd")));


        return "articles";
    }

    @GetMapping("/admin/addArticle")
    public String addArticle(){
        return "addArticle";
    }

    @PostMapping(
            path = "/admin/newArticle",
            consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public RedirectView newArticle(@RequestParam Map<String, String> map){
        LoggerFactory.getLogger("qsqsdqsdqsd").info("{}",map.toString());
        return new RedirectView("/articles");
    }

}
