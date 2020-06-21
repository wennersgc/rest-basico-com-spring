package com.restspring.rest.service;

import com.restspring.rest.exception.JediNotFoundException;
import com.restspring.rest.model.Jedi;
import com.restspring.rest.repository.JediRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JediService {

    @Autowired
    private JediRepository repository;

    public List<Jedi> findAll() {
        return this.repository.findAll();
    }

    public Jedi findById(final Long id) {
        final Optional<Jedi> jedi = this.repository.findById(id);

        if (jedi.isPresent()) {
            return jedi.get();

        } else {
            throw new JediNotFoundException();
        }
    }

    public Jedi save(final Jedi jedi) {
        return this.repository.save(jedi);
    }

    public Jedi update(final Long id, final  Jedi dto) {
        final Optional<Jedi> jediEntity = this.repository.findById(id);
        final Jedi jedi;

        if (jediEntity.isPresent()) {
            jedi = jediEntity.get();
        } else {
            throw new JediNotFoundException();
        }

        jedi.setName(dto.getName());
        jedi.setLastName(dto.getLastName());

        return this.repository.save(jedi);
    }

    public void delete(final long id) {
        final Jedi jedi = findById(id);

        this.repository.delete(jedi);
    }

}
