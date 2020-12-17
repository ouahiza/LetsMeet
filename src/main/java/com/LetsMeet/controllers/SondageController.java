package com.LetsMeet.controllers;

import com.LetsMeet.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.LetsMeet.exceptions.ResourceNotFoundException;
import com.LetsMeet.models.SondageRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
//@RequestMapping ("/sondageapi")
public class SondageController {
    @Autowired
    private SondageRepository sondageRepository;
    @Autowired
    private ChoixRepository choixRepository;

    @GetMapping("/sondage/{id}")
    public ResponseEntity getSondageById(@PathVariable(value = "id") Long sondageId)
            throws ResourceNotFoundException {
        Sondage sondage =
                (Sondage) sondageRepository
                        .findById(sondageId)
                        .orElseThrow(() -> new ResourceNotFoundException("Sondage not found on:: " + sondageId));
        return ResponseEntity.ok().body(sondage);
    }

// création de sondage

    @PostMapping("/createsurvey")
    public boolean createSurvey(@RequestBody Map<String, Object> request)
            throws ResourceNotFoundException {
        String name = (String) request.get("name");
        ArrayList<LinkedHashMap> choices = (ArrayList<LinkedHashMap>) request.get("choices");
        Set<Choix> choicesSet = new HashSet<Choix>();
        for (LinkedHashMap o : choices) {
            Choix choix = new Choix();
            choix.setPlace((String) o.get("place"));
            choix.setDate((Date) o.get("date"));

            choicesSet.add(choix);

        }
        Sondage sondage = new Sondage();
        sondage.setName(name);
        sondage.setChoices(choicesSet);

        //User user =
        //      userService
        //           .findByEmailAndPassword(email_address, password);

        //return ResponseEntity.ok();//.body(user);
        return true;
    }

}
