package org.msp.profileservice.service;

import org.msp.profileservice.model.Profile;
import org.msp.profileservice.repository.IProfileRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService implements IProfileService{
    private final IProfileRepo profileRepo;

    public ProfileService(IProfileRepo profileRepo) {
        this.profileRepo = profileRepo;
    }


    @Override
    public List<Profile> getProfiles() {
        return profileRepo.findAll();
    }
}
