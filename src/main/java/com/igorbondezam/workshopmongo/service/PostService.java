package com.igorbondezam.workshopmongo.service;

import com.igorbondezam.workshopmongo.Repository.PostRepository;
import com.igorbondezam.workshopmongo.Repository.UserRepository;
import com.igorbondezam.workshopmongo.domain.Post;
import com.igorbondezam.workshopmongo.domain.User;
import com.igorbondezam.workshopmongo.dto.UserDTO;
import com.igorbondezam.workshopmongo.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;



    public Post findById(String id){
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findyByTitle(String text){
        return repo.searchTitle(text);
    }

    public List<Post> fullSearch(String text, Date minDate, Date maxDate){
        maxDate = new Date(maxDate.getTime()+24*60*60*1000);
        return repo.fullSearch(text, minDate, maxDate);
    }

}
