package com.LetsMeet.services;

import com.LetsMeet.exceptions.ForbiddenException;
import com.LetsMeet.models.Choix;
import com.LetsMeet.models.ChoixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Calendar;
import java.util.Date;

@Service
@Transactional
public class ChoixService {
    @Autowired
    private ChoixRepository choixRepository;

    public Choix choixValidation(String place, Date date) throws ForbiddenException {
        if(place.isEmpty() || date.before(Calendar.getInstance().getTime())){
            throw new ForbiddenException("choice info not correct");
        }
        Choix choix = new Choix();
        choix.setPlace(place);
        choix.setDate(date);

       // return ChoixRepository.save(choix);
        return choix;
    }
}
