package com.preethi.personaldictionary.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.preethi.personaldictionary.repo.WordRepo;
import com.preethi.personaldictionary.word.Word;

@Controller
public class HomeController {
	@Autowired
	WordRepo repo;
	@RequestMapping("/")
	public String index()
	{
		return "index.jsp";
	}
	@RequestMapping("/addNew")
	public String addNew(Word word)
	{
		repo.save(word);
		return "success.jsp";
	}
	/*@RequestMapping("/findWord/{word}")
	@ResponseBody
	public Optional<Word> findWord(@PathVariable("word") String word)
	{
		System.out.println(word);
		System.out.println(repo.findById(word));
		return repo.findById(word);
	}*/
	@RequestMapping("/findWord")
	public ModelAndView findWord(@RequestParam String word)
	{
		
		ModelAndView mv= new ModelAndView("showWord.jsp");
		
		Word w = repo.findById(word).orElse(new Word());
		System.out.println(repo.findById(word));
		mv.addObject(w);
		return mv;	
	}
	@RequestMapping("/updateWord")
	public String updateWord(@RequestParam("word") String word,@RequestParam("toMeaning") String meaning)
	
	{
		System.out.println(word+" "+meaning);
		/*Word oldword = repo.findById(word).orElse(new Word());
		ModelAndView mv= new ModelAndView();
	    System.out.println(meaning);
		System.out.println(oldword);
		oldword.setMeaning(meaning);
		repo.save(oldword);*/
		Word oldword = repo.findById(word).orElse(new Word());
		oldword.setMeaning(meaning);
		repo.save(oldword);
		return "update.jsp";
	}
	
	

}
