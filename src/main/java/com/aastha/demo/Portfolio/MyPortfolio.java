package com.aastha.demo.Portfolio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyPortfolio {
    @GetMapping("/mySelf")
    public String MySelf(){
        return """
                <h1>MySelf</h1>
                <p>My name is Aastha. Currently persuing B.Tech CSE at LPU.</p>
                <p>My name academic details are as follows:</p>
                <ul>
                    <li> <a href="https://github.com/aasthaghosh">Git Hub link</a></li>
                    <li> <a href="https://leetcode.com/u/aastha_ghosh/">Leet Code link</a></li>

                <ul>
                """;
    }
}
