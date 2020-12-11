package com.LetsMeet.controllers;

import com.LetsMeet.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.LetsMeet.exceptions.ForbiddenException;
import com.LetsMeet.exceptions.ResourceNotFoundException;
import com.LetsMeet.models.SondageRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.*;

@RestController
@RequestMapping ("/sondageapi")
public class SondageController {
    @Autowired

    private SondageRepository sondageRepository;
    private ChoixRepository choixRepository;

    @GetMapping("/sondage/{choix}")
    public ResponseEntity getSondageByChoix(@PathVariable(value = "choix") Long sondageChoix)
            throws ResourceNotFoundException {
        Sondage sondage =
                (Sondage) sondageRepository
                        .findByChoix(sondageChoix)
                        .orElseThrow(() -> new ResourceNotFoundException("Sondage not found on:: " + sondageChoix));
        return ResponseEntity.ok().body(sondage);
    }



}
