package com.dev.clinic.service;

import java.util.List;
import java.util.Set;

import com.dev.clinic.model.Certificate;

public interface CertificateService {

    Certificate getCetificateById(long certificateId);

    Set<Certificate> getCertificatesByRegisterId(long registerId);

    Certificate createCertificate(long registerId, Certificate certificate);

    Certificate updateCertificate(long certificateId, Certificate certificate);

    Boolean deleteCertifcate(long certificateId);

    List<Certificate> getCertificates();

    Certificate createACertificate(Certificate certificate);

    Certificate updateACertificate(long certificateId, Certificate certificate);

    

}
