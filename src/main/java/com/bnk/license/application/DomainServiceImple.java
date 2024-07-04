package com.bnk.license.application;

import com.bnk.license.infrastructure.DomainRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DomainServiceImple implements DomainService{

    private final DomainRepository domainRepository;
}
