package et.edu.askualalms.askualalms.services;

import et.edu.askualalms.askualalms.domains.Admin;

import et.edu.askualalms.askualalms.repositories.AdminRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public Admin createAdmin (Admin admin){

        return adminRepository.save(admin);
    }
    public Iterable<Admin> allAdmin(){
        return adminRepository.findAll();

    }
}


