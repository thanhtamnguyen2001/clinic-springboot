package com.dev.clinic.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.clinic.exception.NotFoundException;
import com.dev.clinic.model.Certificate;
import com.dev.clinic.model.Register;
import com.dev.clinic.model.User;
import com.dev.clinic.repository.CertificateRepository;
import com.dev.clinic.repository.RegisterRepository;
import com.dev.clinic.service.CertificateService;
import com.dev.clinic.service.RegisterService;
import com.dev.clinic.service.UserService;

@Service
public class CertificateServiceImpl implements CertificateService {

    @Autowired
    private CertificateRepository certificateRepository;

    @Autowired
    private RegisterRepository registerRepository;

    @Autowired
    private RegisterService registerService;

    @Autowired
    private UserService userService;

    @Override
    public Certificate getCetificateById(long certificateId) {
        Optional<Certificate> cOptional = this.certificateRepository.findById(certificateId);
        if (cOptional.isPresent()) {
            return cOptional.get();
        }

        throw new NotFoundException("Certificate does not exist!");
    }

    @Override
    public Certificate createCertificate(long registerId, Certificate certificate) {
        User currentUser = this.userService.getCurrentUser();
        Register register = this.registerService.getRegisterById(registerId);

        certificate.setRegister(register);
        certificate.setUser(currentUser);
        certificate.setCreatedDate(new Date());

        certificate.setId(null);
        Certificate newCertificate = this.certificateRepository.save(certificate);

        return newCertificate;
    }

    @Override
    public Certificate updateCertificate(long certificateId, Certificate certificate) {
        User currentUser = this.userService.getCurrentUser();
        Optional<Certificate> cOptional = this.certificateRepository.findById(certificateId);
        if (cOptional.isPresent()) {
            Certificate existedCer = cOptional.get();
            certificate.setId(existedCer.getId());
            certificate.setRegister(existedCer.getRegister());
            certificate.setUser(currentUser);

            Certificate updatedCertificate = this.certificateRepository.save(certificate);

            return updatedCertificate;
        }

        throw new NotFoundException("Certificate does not exist!");
    }

    @Override
    public Boolean deleteCertifcate(long certificateId) {
        boolean isExist = this.certificateRepository.existsById(certificateId);
        if (isExist) {
            this.certificateRepository.deleteById(certificateId);
            return true;
        }

        throw new NotFoundException("Certificate does not exist!");
    }

    @Override
    public Set<Certificate> getCertificatesByRegisterId(long registerId) {
        Optional<Register> rOptional = this.registerRepository.findById(registerId);

        if (rOptional.isPresent()) {
            return rOptional.get().getCertificates();
        }

        throw new NotFoundException("Register " + registerId + " does not have any Certification!");
    }

    @Override
    public List<Certificate> getCertificates() {
        List<Certificate> certificates = this.certificateRepository.findAll();
        
        return certificates;
    }

    @Override
    public Certificate createACertificate(Certificate certificate) {
        certificate.setCreatedDate(new Date());
        Certificate newCertificate = this.certificateRepository.save(certificate);
        
        return newCertificate;
    }

    @Override
    public Certificate updateACertificate(long certificateId, Certificate certificate) {
        
        Optional<Certificate> cOptional = this.certificateRepository.findById(certificateId);
        if (cOptional.isPresent()) {
            Certificate existedCer = cOptional.get();
            certificate.setId(existedCer.getId());

            Certificate updatedCertificate = this.certificateRepository.save(certificate);

            return updatedCertificate;
        }

        throw new NotFoundException("Certificate does not exist!");
    }

}
