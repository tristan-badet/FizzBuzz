package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
@RestController
public class FizzBuzz {
    public static void main(String[] args) {
      SpringApplication.run(FizzBuzz.class, args);
    }


    @GetMapping("/FizzBuzz")
    public List<String> fizzBuzz(@RequestParam("entry") int entry){
      List<String> number =new ArrayList<>();
      for (int x = 1 ; x <= entry; x++){
      if(x%5==0 && x%3==0){
          number.add("Fizzbuzz");
      }else if (x%5==0){
          number.add("Buzz");
      } else if (x%3 == 0){
          number.add("Fizz");
      } else {
          number.add(String.valueOf(x));
      }
    }
    return number;
  }
}
  


