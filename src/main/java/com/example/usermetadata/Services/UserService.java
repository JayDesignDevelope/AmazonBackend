package com.example.usermetadata.Services;

import com.example.usermetadata.Entity.UserMetaData;
import com.example.usermetadata.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.usermetadata.Repository.UsersRepo;


@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    //submit data into db
    public UserMetaData saveUserMetaDataTODB(UserMetaData metaData){
        return userRepo.save(metaData);
    }

    //retrive data from db
    public UserMetaData getsUserDetailsFromDB(String userId){
        return userRepo.findAllByuniqueId(userId);
    }
}
