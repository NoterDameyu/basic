package com.example.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommitInfoController {
 
    @Value("${git.commit.message.short}")
    private String commitMessage;
 
    @Value("${git.branch}")
    private String branch;
 
    @Value("${git.commit.id}")
    private String commitId;
 
    @RequestMapping("/commitId")
    public Map<String, String> getCommitId() {
        Map<String, String> result = new HashMap<>();
        result.put("Commit message",commitMessage);
        result.put("Commit branch", branch);
        result.put("Commit id", commitId);
        return result;
    }
}
