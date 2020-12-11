package com.LetsMeet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import com.LetsMeet.exceptions.ForbiddenException;
import com.LetsMeet.exceptions.ResourceNotFoundException;
import com.LetsMeet.models.Sondage;
import com.LetsMeet.models.ChoixRepository;
import com.LetsMeet.models.SondageRepository;
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

    @RequestMapping(value="/api/sondage/find")



}
